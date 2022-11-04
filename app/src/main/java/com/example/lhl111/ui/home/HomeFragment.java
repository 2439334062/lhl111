package com.example.lhl111.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.lhl111.R;
import com.example.lhl111.bean.NewsBean;
import com.example.lhl111.databinding.FragmentHomeBinding;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeViewModel _homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        _homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RefreshLayout refreshLayout = (RefreshLayout)root.findViewById(R.id.refreshLayout);

        refreshLayout.setOnRefreshListener(refreshlayout-> {
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
                GetAdList();
                GetNewsList();
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
                Toast.makeText(getActivity(),"没有更多的数据",Toast.LENGTH_SHORT).show();
            }
        });
        GetAdList();
        GetNewsList();
        return root;
    }

    private void GetAdList() {
        _homeViewModel.getAdList().observe(getViewLifecycleOwner(), new Observer<List<NewsBean>>() {
            @Override
            public void onChanged(List<NewsBean> newsBeans) {
                for(NewsBean newsBean:newsBeans){
                    Log.i("News",newsBean.getNewsName());
                }
            }
        });
    }

    private void GetNewsList() {
        _homeViewModel.getNewsList().observe(getViewLifecycleOwner(), new Observer<List<NewsBean>>() {
            @Override
            public void onChanged(List<NewsBean> newsBeans) {
                for(NewsBean newsBean:newsBeans){
                    Log.i("News",newsBean.getNewsName());
                }
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}