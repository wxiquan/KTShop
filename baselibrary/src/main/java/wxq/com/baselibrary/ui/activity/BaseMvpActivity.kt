package wxq.com.baselibrary.ui.activity

import wxq.com.baselibrary.presenter.BasePresenter
import wxq.com.baselibrary.presenter.view.BaseView

open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(), BaseView {

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T
}