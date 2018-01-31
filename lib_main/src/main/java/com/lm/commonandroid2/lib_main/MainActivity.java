package com.lm.commonandroid2.lib_main;

import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lm.commonandroid2.lib_common.base.BaseActivity;
import com.lm.commonandroid2.lib_common.base.BasePresenter;
import com.lm.commonandroid2.lib_main.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<BasePresenter, ActivityMainBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean isPrestener() {
        return false;
    }

    @Override
    protected void initTitleBar() {
        super.initTitleBar();
        mTitleBarLayout.setLeftShow(false);
        mTitleBarLayout.setTitle("我是标题");
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    public void ToOneActivity(View view) {
        ARouter.getInstance().build("/lib_one/OneActivity").navigation();
    }

    public void ToTwoActivity(View view) {
        ARouter.getInstance().build("/lib_two/TwoActivity").navigation();
    }

    public void ToThreeActivity(View view) {
        ARouter.getInstance().build("/lib_three/ThreeActivity").navigation();
    }

    public void ToNavigationViewActivity(View view) {
        startActivity(NavigationViewActivity.class);
    }
}
