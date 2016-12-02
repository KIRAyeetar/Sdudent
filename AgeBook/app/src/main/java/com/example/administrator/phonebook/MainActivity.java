package com.example.administrator.phonebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    private ScrollView mScrollView;
    private int count;
    private Create i;
    ArrayList studentName;
    ArrayList studentNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        mScrollView = (ScrollView) findViewById(R.id.activity_main);

        //   始终在这里接收数据失败...
        /*Bundle bunde = this.getIntent().getExtras();
        this.name = bunde.getString("name");
        this.num= bunde.getString("num");*/
       /* Student mStudent=new Student(this);
        SQLiteDatabase db=null;
        Cursor c = db.query("user",null,null,null,null,null,null);//查询并获得游标
        if(c.moveToFirst()){//判断游标是否为空
            for(int i=0;i<c.getCount();i++){
                c.move(i);//移动到指定记录
                name= c.getString(c.getColumnIndex("name"));
                studentNum.add ( c.getString(c.getColumnIndex("num")));
            }
        }*/

        count=20;
        addView(R.layout.item, count, mLinearLayout);
    }

    private void addView(@LayoutRes int res, int count, ViewGroup parent) {
        String  name[]= new String[] {"曾名杨","徐书展","郑昱旋","曹越","饶东","吴随"};
        int age[]=new int[]{19,19,19,19,19,18};

        for (int i = 0,j=0; i < count; i++,j++) {
            if (j==6)
            {j=0;}
            View student = View.inflate(this, res, null);

            TextView NameTextView = (TextView) student.findViewById(R.id.nametv);
            NameTextView.setText(String.valueOf(name[j]+ "")  );

            TextView NumTextView = (TextView) student.findViewById(R.id.numtv);
            NumTextView.setText(String.valueOf(age[j] + ""));

            NameTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,Show.class));
                }
            });
            NumTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,Show.class));
                }
            });
            parent.addView(student);
    }
  }
}

