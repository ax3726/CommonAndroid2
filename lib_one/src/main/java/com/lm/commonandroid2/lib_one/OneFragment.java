package com.lm.commonandroid2.lib_one;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lm.commonandroid2.lib_common.base.BaseFragment;
import com.lm.commonandroid2.lib_common.base.BaseFragmentPresenter;
import com.lm.commonandroid2.lib_one.databinding.ActivityOneBinding;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
@Route(path = "/lib_one/OneFragment")
public class OneFragment extends BaseFragment<BaseFragmentPresenter,ActivityOneBinding> {
    @Override
    public int getLayoutId() {
        return R.layout.activity_one;
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
