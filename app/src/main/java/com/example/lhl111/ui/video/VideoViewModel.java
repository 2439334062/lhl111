package com.example.lhl111.ui.video;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.lhl111.bean.VideoBean;
import com.example.lhl111.utils.NewUtils;
import com.github.leonardoxh.livedatacalladapter.Resource;

import java.util.List;

public class VideoViewModel extends ViewModel {



    public LiveData<List<VideoBean>>  getVideoList() {
        return Transformations.map(NewUtils.get().getVideoList(),
                Resource::getResource
        );
    }
}