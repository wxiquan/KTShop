package wxq.com.usercenter.data.repository

import rx.Observable
import wxq.com.baselibrary.data.net.RetrofitFactory
import wxq.com.baselibrary.data.protocol.BaseResp
import wxq.com.usercenter.data.api.UserApi
import wxq.com.usercenter.data.protocol.RegisterReq

class UserRepository {
    fun register(mobile:String, pwd:String, verifyCode:String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
            .register(RegisterReq(mobile,pwd,verifyCode))
    }
}