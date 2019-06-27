package wxq.com.baselibrary.presenter

import wxq.com.baselibrary.presenter.view.BaseView

open class BasePresenter<T:BaseView> {
    lateinit var mView: T
}