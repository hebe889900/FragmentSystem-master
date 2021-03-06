package com.example.nick.fragmentsystem;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Detail_Fragment extends Fragment {

    OnButtonClickedListener mListener;
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
                /*
                Button submit = (Button) view.findViewById(R.id.button);
                EditText editName = (EditText) view.findViewById(R.id.EditTextName);
                EditText editAge = (EditText) view.findViewById(R.id.EditAge);
                Spinner spinner = (Spinner)view.findViewById(R.id.SpinnerFeedbackType);
                if(editName.getText()!=null && editAge.getText()!=null && spinner.getSelectedItem()!=null){
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name =  ((EditText) view.findViewById(R.id.EditTextName)).getText().toString();
                        String age = ((EditText) view.findViewById(R.id.EditAge)).getText().toString();
                        String fruit = ((Spinner) view.findViewById(R.id.SpinnerFeedbackType)).getSelectedItem().toString();
                        List<String> smallList = new ArrayList<String>();
                        smallList.add(name);
                        smallList.add(age);
                        smallList.add(fruit);
                        InfoList.add(smallList);//add the input to the list
                    }
                });
            }
            */
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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnButtonClickedListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnButtonClickedListener ");
        }
    }

    public void clickButton() {
        // When the button is clicked, notify the activity.
        //   The activity will then pass the information to fragment
        //   B (if it has been created).

        mListener.onButtonClicked(getView());//get the current fragment view so that we can access to the button on that view
    }
}

