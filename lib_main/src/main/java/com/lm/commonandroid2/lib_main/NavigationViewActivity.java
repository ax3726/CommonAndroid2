package com.lm.commonandroid2.lib_main;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lm.commonandroid2.lib_common.base.BaseActivity;
import com.lm.commonandroid2.lib_common.base.BasePresenter;
import com.lm.commonandroid2.lib_main.databinding.ActivityNavigationViewBinding;

import java.util.ArrayList;
import java.util.List;

public class NavigationViewActivity extends BaseActivity<BasePresenter, ActivityNavigationViewBinding> {
    private List<Fragment> mFragments = new ArrayList<>();
    private FragmentAdapter mAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_navigation_view;
    }

    @Override
    protected boolean isPrestener() {
        return false;
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initTitleBar() {
        super.initTitleBar();
        mTitleBarLayout.setLeftShow(false);
        mTitleBarLayout.setTitle("我是主界面的标题");
    }


    @Override
    protected void initData() {
        super.initData();
        initFragment();
        mAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        mBinding.containerPager.setAdapter(mAdapter);
        mBinding.containerPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        mBinding.navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int i = item.getItemId();
                if (i == R.id.navigation_one) {
                    mBinding.containerPager.setCurrentItem(0);
                    return true;
                } else if (i == R.id.navigation_two) {
                    mBinding.containerPager.setCurrentItem(1);
                    return true;
                } else if (i == R.id.navigation_three) {
                    mBinding.containerPager.setCurrentItem(2);
                    return true;
                }
                return false;
            }
        });
    }


    private void initFragment() {
        // 获取Fragment
        Fragment onefragment = (Fragment) ARouter.getInstance().build("/lib_one/OneFragment").navigation();
        Fragment twofragment = (Fragment) ARouter.getInstance().build("/lib_two/TwoFragment").navigation();
        Fragment threefragment = (Fragment) ARouter.getInstance().build("/lib_three/ThreeFragment").navigation();
        mFragments.add(onefragment);
        mFragments.add(twofragment);
        mFragments.add(threefragment);
    }

    public class FragmentAdapter extends FragmentStatePagerAdapter {
        private List<Fragment> mFragments;

        public FragmentAdapter(FragmentManager fm, List<Fragment> mFragments) {
            super(fm);
            this.mFragments = mFragments;
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments != null ? mFragments.size() : 0;
        }

        @Override
        public int getItemPosition(Object object) {
            return android.support.v4.view.PagerAdapter.POSITION_NONE;
        }
    }
}
