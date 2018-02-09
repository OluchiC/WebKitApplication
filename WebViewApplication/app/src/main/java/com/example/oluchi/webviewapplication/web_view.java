package com.example.oluchi.webviewapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class web_view extends AppCompatActivity {

    private WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webviewID);

        webView .getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://www.google.com");

    }



}

