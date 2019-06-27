package wxq.com.usercenter.data.api

import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable
import wxq.com.baselibrary.data.protocol.BaseResp
import wxq.com.usercenter.data.protocol.RegisterReq

interface UserApi {
    @POST("")
    fun register(@Body req: RegisterReq): Observable<BaseResp<String>>
}