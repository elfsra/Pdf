package com.example.asus.pdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Webview extends AppCompatActivity {

    private WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView tarayici;
        tarayici= (WebView) findViewById (R.id.webview1);
        tarayici.getSettings().setJavaScriptEnabled(true);

       tarayici.loadUrl("http://www.onlinekitapoku.com/component/djcatalog2/kitap/1-roman/117-anna-karenina.html#.WcQse7JJbDc");
    }

    private void loadUrl(String s) {
    }

    public WebSettings getSettings() {
        return settings;
    }
}
