package com.example.pi.classschedule;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment***REMOVED*** subclass.
 */
public class fragment_assg_pending extends Fragment {

    private View _view;
    private db_helper helper;
    private adapter_assignment assg_objs;
    private ListView ls_view;
    public fragment_assg_pending() {
        // Required empty public constructor
***REMOVED***



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list_assg_pending, container, false);
        this._view=view;
        ((ListView)_view.findViewById(R.id.list_pending)).setOnItemClickListener(new clickListener_list_assignment());
        return view;
***REMOVED***

    @Override
    public void onResume()
    {

        //For dynamic views
        super.onResume();

        if(this.helper==null)
            this.helper=new db_helper(getActivity(), null, null, 1);


        ArrayList<object_assignment> assignments=this.helper.list_assg_status("Pending");



        Log.i("Assignment number:", String.valueOf(assignments.size()));
        if(assignments.size()>0) {
            ((FrameLayout)_view.findViewById(R.id.assg_pend_frame)).setBackgroundColor(Color.parseColor("#eeeeee"));
            ((LinearLayout)_view.findViewById(R.id.assg_pend_notice)).setVisibility(View.GONE);
            ((ListView)_view.findViewById(R.id.list_pending)).setVisibility(View.VISIBLE);
            this.assg_objs = new adapter_assignment(getContext(), assignments);
            Log.i("Number of assg_obs", String.valueOf(this.assg_objs.getCount()));


***REMOVED***
        else {

            ((FrameLayout)_view.findViewById(R.id.assg_pend_frame)).setBackgroundColor(Color.parseColor("#ffffff"));
            ((ListView)_view.findViewById(R.id.list_pending)).setVisibility(View.GONE);
            ((LinearLayout)_view.findViewById(R.id.assg_pend_notice)).setVisibility(View.VISIBLE);
            this.assg_objs = null;
***REMOVED***


        this.ls_view=((ListView)_view.findViewById(R.id.list_pending));

        this.ls_view.setAdapter(this.assg_objs);







***REMOVED***





***REMOVED***
