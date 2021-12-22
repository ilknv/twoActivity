package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button forward;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = (Button) findViewById(R.id.btnActTwo);
        name = (EditText) findViewById(R.id.name);
    }
    public void goNewView(View v){
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, MainActivity2.class);

                intent.putExtra("name", name.getText().toString());
                // показываем новое Activity
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}



