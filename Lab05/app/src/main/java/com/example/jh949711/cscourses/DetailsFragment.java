package com.example.jh949711.cscourses;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by jh949711 on 3/19/18.
 */

public class DetailsFragment extends Fragment {
    public static DetailsFragment newInstance(int index){
        DetailsFragment detailsFragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putInt("index",index);
        detailsFragment.setArguments(args);
        return detailsFragment;
    }

    public int getShowIndex(){
        return getArguments().getInt("index",0);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        ScrollView scrollView = new ScrollView(getActivity());
        TextView text = new TextView(getActivity());
        text.setTextSize(15);
        text.setBackgroundColor(Color.MAGENTA);
        text.setTextColor(Color.WHITE);
        int padding = 20;
        scrollView.setPadding(padding,padding,padding,padding);
        scrollView.addView(text);
        text.setText(CSinfo.CourseInfo[getShowIndex()]);
        return scrollView;
    }
}
