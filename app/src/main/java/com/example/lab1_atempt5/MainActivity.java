package com.example.lab1_atempt5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);


    }
    public void BlueButtonClick(View view){
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Press Green");
        text.setTextColor(Color.BLUE);
        Toast.makeText(this, "You preseed Blue Button", Toast.LENGTH_SHORT).show();
    }
    public void GreenButtonClick(View view){
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Press Blue");
        text.setTextColor(Color.GREEN);
        Toast.makeText(this, "Гыгыга", Toast.LENGTH_SHORT).show();
    }
}