package com.example.nick.fragmentsystem;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Detail_Fragment extends Fragment {

    private List<Fragment> FragmentList;
    /**
     * Create a new instance of DetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static Detail_Fragment newInstance(int index) {
        Detail_Fragment f = new Detail_Fragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);

        return f;
    }

    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            // We have different layouts, and in one of them this
            // fragment's containing frame doesn't exist.  The fragment
            // may still be created from its saved state, but there is
            // no reason to try to create its view hierarchy because it
            // won't be displayed.  Note this is not needed -- we could
            // just run the code below, where we would create and return
            // the view hierarchy; it would just never be used.
            return null;
        }

        switch(getShownIndex()){
            case 0:
                return inflater.inflate(R.layout.fragment_enter_names, container, false);
            case 1:
                return inflater.inflate(R.layout.fragment_store, container, false);
            case 2:
                return inflater.inflate(R.layout.fragment_load, container, false);
            case 3:
                return inflater.inflate(R.layout.fragment_view, container, false);
            case 4:
                System.exit(0);
            default:
                return null;
        }
    }
}

