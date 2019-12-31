package com.example.listveiwxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView listv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        listv=findViewById(R.id.LisV1);
        listv.setOnItemClickListener(click);
    }

    private AdapterView.OnItemClickListener click=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            tv1.setText("你選擇了"+((TextView)view).getText());
        }
    };
}
