package edu.hrbeu.xiaox.textview_liftandrightslide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends Activity {


    @InjectView(R.id.textview)
    TextView textview;
    @InjectView(R.id.text2)
    TextView text2;
    @InjectView(R.id.listView)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        final myAdapter myAdapter =new myAdapter(MainActivity.this);
        listView.setAdapter(myAdapter);

    }

}
