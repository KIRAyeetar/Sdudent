package com.example.administrator.phonebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Create extends AppCompatActivity {
    private Button back;
    private EditText getName;
    private EditText getNum;
    private String name;
    private String num;
    public Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        back=(Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){back.setOnClickListener(new View.OnClickListener(){


                    public void onClick(View v){


                        getName=(EditText) findViewById(R.id.getName_exitText);
                        getNum=(EditText) findViewById(R.id.getNum_exitText);
                        name = getName.getText().toString();
                        num=getNum.getText().toString();

                        Intent intent = new Intent();
                        intent.setClass(Create.this,MainActivity.class);
                        Toast.makeText(Create.this,"新建成功" ,Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                        finish();
                       }
                    });
            }
        });
    }
    // 创建的SQlite添加数据
    /*class InsertListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            ContentValues values=new ContentValues();
            values.put("name",name);
            values.put("num",num);
            Student mStudent=new Student(Create.this);
            SQLiteDatabase db=mStudent.getWritableDatabase();
            db.insert("Student.db",null,values);
        }
    }*/
}
