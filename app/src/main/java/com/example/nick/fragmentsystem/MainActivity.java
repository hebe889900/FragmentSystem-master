package com.example.nick.fragmentsystem;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button EnterNames,Store,Load,View,Exit;
    private List<View> viewList;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewList = new ArrayList<View>();
        View viewEnterNames = View.inflate(this,R.layout.fragment_enter_names,null);
        View viewExit = View.inflate(this,R.layout.fragment_exit,null);
        View viewLoad = View.inflate(this,R.layout.fragment_load,null);
        View viewStore = View.inflate(this,R.layout.fragment_store,null);
        View viewView = View.inflate(this,R.layout.fragment_view,null);
        viewList.add(viewEnterNames);
        viewList.add(viewLoad);
        viewList.add(viewStore);
        viewList.add(viewView);
        viewList.add(viewExit);

        MyPagerAdapter adapter = new MyPagerAdapter(viewList);
        pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);
        EnterNames = (Button)findViewById(R.id.enterNames);
        Store = (Button)findViewById(R.id.store);
        Load = (Button)findViewById(R.id.load);
        View = (Button)findViewById(R.id.view);
        Exit = (Button)findViewById(R.id.exit);

        EnterNames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnterNames enterNamesFragment = new EnterNames();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame, enterNamesFragment);
                ft.commit();
            }
        });
        Store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
