package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfviewer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer1);

        PDFView pdfView = findViewById(R.id.pdfview1);

        pdfView.fromAsset("android.pdf").load();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(pdfviewer1.this, pdfContent.class);
        startActivity(intent);
        finish();
    }
}