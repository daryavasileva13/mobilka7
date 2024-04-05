package com.example.mobiles4.UI.View;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobiles4.R;

public class Fragment1 extends Fragment {
    public Fragment1() {
        super(R.layout.fragment1);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView img = view.findViewById(R.id.imageView_sports_academy);
        Button sections = view.findViewById(R.id.sections);
        Button sign_up = view.findViewById(R.id.sign_up);
        Button list1 = view.findViewById(R.id.list1);
        Button list2 = view.findViewById(R.id.list2);
        //Button b_addTask = view.findViewById(R.id.b_add_task);
        TextView text_discription = view.findViewById(R.id.text_discription);

        //TextView tTasktextmenu = view.findViewById(R.id.t_tasktextmenu);


//        EditText e_qcount = view.findViewById(R.id.e_qcount);
//        TaskListViewModel list = new ViewModelProvider(getActivity()).get(TaskListViewModel.class);
//        getParentFragmentManager().setFragmentResultListener("getElement", this,
//                new FragmentResultListener() {
//                    @Override
//                    public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
//                        list.getUiState().observe(getViewLifecycleOwner(), uiState -> {
//                            tTasktextmenu.setText(uiState.getTasks().
//                                    get(result.getInt("getElement")).getText());
//                        });
//                    }
//                });

        sections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String str = e_qcount.getText().toString();
//                    Bundle bundle = new Bundle();
//                    bundle.putBoolean("CreateList", true);
//                if (!str.isEmpty() && str.matches("\\d+")) {
//                    bundle.putInt("qCount", Integer.parseInt(str));
//                }
                //Navigation.findNavController(v).navigate(R.id.a_left, bundle);
                //Navigation.findNavController(v).navigate(R.id.f_left);
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String str = e_qcount.getText().toString();
//                Bundle bundle = new Bundle();
//                bundle.putBoolean("CreateList", true);
//                if (!str.isEmpty() && str.matches("\\d+")) {
//                    bundle.putInt("qCount", Integer.parseInt(str));
//                }
//                Navigation.findNavController(v).navigate(R.id.a_right, bundle);
                Navigation.findNavController(v).navigate(R.id.fragment3);
            }
        });

        sections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.fragment2);
            }
        });

        list1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.fragment_list1);
            }
        });

        list2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.fragment_list2);
            }
        });


    }
}