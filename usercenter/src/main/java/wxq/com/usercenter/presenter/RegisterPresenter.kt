package wxq.com.usercenter.presenter

import wxq.com.baselibrary.ext.execute
import wxq.com.baselibrary.presenter.BasePresenter
import wxq.com.baselibrary.rx.BaseSubscriber
import wxq.com.usercenter.presenter.view.RegisterView
import wxq.com.usercenter.presenter.view.service.impl.UserServiceImpl

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile:String, verifyCode:String, pwd:String) {
        /*
            业务逻辑
         */
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
            .execute(object :BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })
    }
}