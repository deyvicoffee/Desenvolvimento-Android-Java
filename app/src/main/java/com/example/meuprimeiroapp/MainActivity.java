package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_matrix;
    private Matrix matrix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_matrix = findViewById(R.id.iv_matrix);
        matrix = new Matrix();
        matrix.setSkew(2,2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            iv_matrix.setAnimationMatrix(matrix);
        }
    }
}