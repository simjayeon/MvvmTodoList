package com.example.mvvmtodolist.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmtodolist.R;
import com.example.mvvmtodolist.databinding.FragmentDoneListBinding;
import com.example.mvvmtodolist.viewmodel.TodoViewModel;

public class DoneListFragment extends Fragment {


    private FragmentDoneListBinding doneListBinding;
    private TodoViewModel todoViewModel;
/*
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        todoViewModel = new ViewModelProvider(this).get(TodoViewModel.class);
        //데이터바인딩 초기화 및 뷰 inflate 필요
        //return 값도 필요
    }

 */
}
