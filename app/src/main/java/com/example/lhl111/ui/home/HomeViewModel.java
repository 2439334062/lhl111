package com.example.lhl111.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.lhl111.bean.NewsBean;
import com.example.lhl111.utils.NewUtils;
import com.github.leonardoxh.livedatacalladapter.Resource;

import java.util.List;

public class HomeViewModel extends ViewModel {

//    private final MutableLiveData<String> mText;
//
//    public HomeViewModel() {
//        mText = new MutableLiveData<>();
//        mText.setValue("This is home fragment");
//    }

    public LiveData<List<NewsBean>> getNewsList() {

        return Transformations.map(NewUtils.get().getNewsList(),
                Resource::getResource
        );
    }

    public LiveData<List<NewsBean>> getAdList() {

        return Transformations.map(NewUtils.get().getAdList(),
                Resource::getResource
        );
    }
}