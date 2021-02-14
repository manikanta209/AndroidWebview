package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    WebView webView1,webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView1=findViewById(R.id.webview1);
        webView2=findViewById(R.id.webview2);

        WebSettings webSettings=webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path="file:android_asset/";
        String name="webview.html";
        String file=path+name;
        webView1.loadUrl("file:///android_asset/webview.html");

        WebSettings webSettings1=webView2.getSettings();
        webSettings1.setJavaScriptEnabled(true);
        webView2.loadUrl("https://m.youtube.com");


    }
}