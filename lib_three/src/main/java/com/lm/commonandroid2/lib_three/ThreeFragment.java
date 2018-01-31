package com.lm.commonandroid2.lib_three;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lm.commonandroid2.lib_common.base.BaseFragment;
import com.lm.commonandroid2.lib_common.base.BaseFragmentPresenter;

import com.lm.commonandroid2.lib_three.databinding.ActivityThreeBinding;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
@Route(path = "/lib_three/ThreeFragment")
public class ThreeFragment extends BaseFragment<BaseFragmentPresenter,ActivityThreeBinding> {
    @Override
    public int getLayoutId() {
        return R.layout.activity_three;
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
