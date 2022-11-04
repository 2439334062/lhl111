package com.example.lhl111.ui.video;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lhl111.R;
import com.example.lhl111.bean.VideoBean;
import com.example.lhl111.databinding.FragmentVideoBinding;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;

public class VideoFragment extends Fragment {

    private  FragmentVideoBinding binding;
    private  VideoViewModel _VideoViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        _VideoViewModel =
                new ViewModelProvider(this).get(VideoViewModel.class);
        binding = FragmentVideoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RefreshLayout refreshLayout = (RefreshLayout)root.findViewById(R.id.refreshLayout);

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
                getVideoList();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
            }
        });

        return root;
    }

    private void getVideoList() {
_VideoViewModel.getVideoList().observe(getViewLifecycleOwner(),videoBeans -> {
    for (VideoBean videoBean:videoBeans) {
        Log.i("Video",videoBean.getName());
    }
});
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}