package wxq.com.usercenter.presenter.view.service

import rx.Observable

interface UserService {
    fun register(mobile:String,  pwd:String, verifyCode:String): Observable<Boolean>
}