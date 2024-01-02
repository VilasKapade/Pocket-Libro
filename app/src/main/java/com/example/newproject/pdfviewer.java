package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfviewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);

        PDFView pdfView = findViewById(R.id.pdfview);

        pdfView.fromAsset("c#.netNotes.pdf").load();

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(pdfviewer.this, pdfContent.class);
        startActivity(intent);
        finish();
    }
}