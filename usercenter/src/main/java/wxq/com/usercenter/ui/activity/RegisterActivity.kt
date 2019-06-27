package wxq.com.usercenter.ui.activity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast
import wxq.com.baselibrary.ui.activity.BaseMvpActivity
import wxq.com.usercenter.R
import wxq.com.usercenter.presenter.RegisterPresenter
import wxq.com.usercenter.presenter.view.RegisterView

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mRegisterBtn.setOnClickListener {
            mPresenter.register(mMobileEt.text.toString(), mVeriEt.text.toString(), mPwdEt.text.toString())
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }
}
