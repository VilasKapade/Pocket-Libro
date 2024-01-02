package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfviewer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer2);

        PDFView pdfView = findViewById(R.id.pdfview2);

        pdfView.fromAsset("structureofavaProgram.pdf").load();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(pdfviewer2.this, pdfContent.class);
        startActivity(intent);
        finish();
    }
}