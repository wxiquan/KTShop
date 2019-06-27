package wxq.com.usercenter.presenter.view.service.impl

import rx.Observable
import rx.functions.Func1
import wxq.com.baselibrary.data.protocol.BaseResp
import wxq.com.baselibrary.rx.BaseException
import wxq.com.usercenter.data.repository.UserRepository
import wxq.com.usercenter.presenter.view.service.UserService

class UserServiceImpl :UserService{
    override fun register(mobile: String,  pwd: String, verifyCode: String): Observable<Boolean> {

        val repository = UserRepository()
        return repository.register(mobile, pwd, verifyCode)
            .flatMap(object :Func1<BaseResp<String>, Observable<Boolean>> {
                override fun call(t: BaseResp<String>): Observable<Boolean> {
                    if (t.status != 0) {
                        return Observable.error(BaseException(t.status, t.message))
                    }
                    return Observable.just(true)
                }
            })
    }
}


