package com.example.mvvmtodolist.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TodoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TodoViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is todo");
    }

    public LiveData<String> getText() {
        return mText;
    }


}
