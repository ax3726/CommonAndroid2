package com.lm.commonandroid2.lib_two;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lm.commonandroid2.lib_common.base.BaseFragment;
import com.lm.commonandroid2.lib_common.base.BaseFragmentPresenter;
import com.lm.commonandroid2.lib_two.databinding.ActivityTwoBinding;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
@Route(path = "/lib_two/TwoFragment")
public class TwoFragment extends BaseFragment<BaseFragmentPresenter,ActivityTwoBinding> {
    @Override
    public int getLayoutId() {
        return R.layout.activity_two;
    }

    @Override
    protected boolean isPrestener() {
        return false;
    }

    @Override
    protected BaseFragmentPresenter createPresenter() {
        return null;
    }
}
