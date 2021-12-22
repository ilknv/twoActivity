package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button back;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back = (Button) findViewById(R.id.back_button);
        name = (TextView) findViewById(R.id.nametxt);

        // Принимаем имя
        String txtName = getIntent().getStringExtra(getString(R.string.name));
        // выводим принятое имя
        name.setText(name.getText().toString() + " " + txtName);
    }

    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}