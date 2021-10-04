package com.example.mvvmtodolist.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmtodolist.R;
import com.example.mvvmtodolist.databinding.FragmentTodoListBinding;
import com.example.mvvmtodolist.viewmodel.TodoViewModel;

public class TodoListFragment extends Fragment {

    private FragmentTodoListBinding todoListBinding;
    private TodoViewModel todoViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        todoViewModel = new ViewModelProvider(this).get(TodoViewModel.class);
        todoListBinding = FragmentTodoListBinding.inflate(inflater, container, false);

        todoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                todoListBinding.text.setText(s);
            }
        });

        return todoListBinding.getRoot();
    }
}
