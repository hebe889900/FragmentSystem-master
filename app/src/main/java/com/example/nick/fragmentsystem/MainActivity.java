package com.example.nick.fragmentsystem;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity{
    Button submit;
    EditText editName;
    EditText editAge;
    Spinner spinner;
    private List<List<String>> InfoList = new ArrayList<List<String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        submit = (Button) findViewById(R.id.button);
        editName = (EditText) findViewById(R.id.EditTextName);
        editAge = (EditText) findViewById(R.id.EditAge);
        spinner = (Spinner) findViewById(R.id.SpinnerFeedbackType);
        if(editName.getText()!=null && editAge.getText()!=null && spinner.getSelectedItem()!=null){
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name =  ((EditText) findViewById(R.id.EditTextName)).getText().toString();
                    String age = ((EditText) findViewById(R.id.EditAge)).getText().toString();
                    String fruit = ((Spinner) findViewById(R.id.SpinnerFeedbackType)).getSelectedItem().toString();
                    List<String> smallList = new ArrayList<String>();
                    smallList.add(name);
                    smallList.add(age);
                    smallList.add(fruit);
                    InfoList.add(smallList);//add the input to the list
                }
            });
        }
        */
    }


}
