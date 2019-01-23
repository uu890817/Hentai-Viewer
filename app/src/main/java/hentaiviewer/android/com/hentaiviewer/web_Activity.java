package hentaiviewer.android.com.hentaiviewer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class web_Activity extends AppCompatActivity {

    WebView web_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        web_1 = findViewById(R.id.web_1);
        web_1.getSettings().setJavaScriptEnabled(true);
        web_1.setWebViewClient(new WebViewClient());
        web_1.loadUrl(url);


        Button btn_w1 = findViewById(R.id.btn_w1);
        btn_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(web_1.canGoBack()){
                    web_1.goBack();
                }

            }
        });

        Button btn_w2 = findViewById(R.id.btn_w2);
        btn_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(web_1.canGoForward()){
                    web_1.goForward();
                }

            }
        });

        final Button btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
