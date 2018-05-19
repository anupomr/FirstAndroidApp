package com.example.anupo.zapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    Button button;
    EditText edtName,edtStudentID;

    public void next_activity(View view)
    {
        edtName=(EditText)findViewById(R.id.edtNames);
        String stName = edtName.getText().toString();

        edtStudentID=(EditText)findViewById(R.id.edtID);
        String stuID=edtStudentID.getText().toString();

        if (view.getId()==R.id.button)
        {
            Intent intent=new Intent(MainActivity.this, NewFormActivity.class);
            intent.putExtra("MyAnMessage", "This is the massage from First activity");
            intent.putExtra("name",stName);
            intent.putExtra("stdId",stuID);
            startActivity(intent);
        }
    }
}
