package com.example.lhl111.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lhl111.R;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;

public class IntroActivity  extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("第一日",
                "启动页、引导页、闪屏页与基础框架搭建", R.drawable.p1, Color.GRAY, Color.RED,Color.BLACK));
        addSlide(AppIntroFragment.newInstance("第二日",
                "LiveData+Retrofit网络请求与下拉刷新SmartRefreshLayout", R.drawable.p2, Color.GRAY, Color.RED,Color.BLACK));
        addSlide(AppIntroFragment.newInstance("第三日",
                "RecyclerAdapter框架与轮播图banner", R.drawable.p3, Color.GRAY, Color.RED,Color.BLACK));
        addSlide(AppIntroFragment.newInstance("第四日",
                "新闻详情页AgentWeb与Python详情页", R.drawable.p4, Color.GRAY, Color.RED,Color.BLACK));
        addSlide(AppIntroFragment.newInstance("第五日",
                "爆炸菜单BoomMenu与统计图表MPAndroidChart", R.drawable.p5, Color.GRAY, Color.RED,Color.BLACK));
        addSlide(AppIntroFragment.newInstance("第六日",
                "视频列表与视频播放器GSYVideoPlayer", R.drawable.p6, Color.GRAY, Color.RED,Color.BLACK));
        addSlide(AppIntroFragment.newInstance("第七日",
                "我的界面与基于Bmob后端云的登录注册，找回密码", R.drawable.p7, Color.GRAY, Color.RED,Color.BLACK));
        addSlide(AppIntroFragment.newInstance("第八日",
                "百度地图API", R.drawable.p8, Color.GRAY, Color.RED,Color.BLACK));
        setSkipText("跳过");
        setDoneText("完成");
        setImmersiveMode();
    }

    @Override
    protected void onSkipPressed(@Nullable Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDonePressed(@Nullable Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}

