package com.example.tabsandswipe;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Third_tab extends  Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    public static final String ARG_SECTION_NUMBER = "section_number";

    public Third_tab() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static MainActivity.PlaceholderFragment newInstance(int sectionNumber) {
        MainActivity.PlaceholderFragment fragment = new MainActivity.PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.third_tab, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label_3);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}