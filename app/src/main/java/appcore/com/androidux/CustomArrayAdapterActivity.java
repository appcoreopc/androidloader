package appcore.com.androidux;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Person p1 = new Person("Jeremy", "jeremy@test.com");
        Person p2 = new Person("Mark", "markjeremy@test.com");
        Person p3 = new Person("Seth", "seth@test.com");
        Person p4 = new Person("osborne", "osborne@test.com");
        Person p5 = new Person("jimmy", "jimmy@test.com");
        Person p6 = new Person("jenny", "jimmy@test.com");
        Person p7 = new Person("sonya", "jimmy@test.com");
        Person p8 = new Person("will", "jimmy@test.com");
        Person p9 = new Person("loki", "jimmy@test.com");

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(0, p1);
        list.add(1, p2);
        list.add(2, p3);
        list.add(3, p4);
        list.add(4, p5);
        list.add(5, p6);
        list.add(6, p7);
        list.add(7, p8);
        list.add(8, p9);

        MySimpleAdapter adapterList = new MySimpleAdapter(this, R.layout.compositerow, list);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapterList);

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

