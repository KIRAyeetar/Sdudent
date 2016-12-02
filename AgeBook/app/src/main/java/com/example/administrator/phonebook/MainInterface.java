package com.example.administrator.phonebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/*
*  主界面...想试试SQlite但是失败了..所以这页等于没做....
* */
public class MainInterface extends AppCompatActivity {
    private Button toLook;
    private Button login;
    private Button back;
    private Button toCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
        back=(Button) findViewById(R.id.back_button);
        toCreate=(Button) findViewById(R.id.toCreat_button);
        toLook=(Button) findViewById(R.id.toLook_button);
        toCreate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainInterface.this,Create.class);
                startActivity(i);
            }
        });
        toLook.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainInterface.this,MainActivity.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }

}
