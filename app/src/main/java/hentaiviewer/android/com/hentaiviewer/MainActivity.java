package hentaiviewer.android.com.hentaiviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,web_Activity.class);
                intent.putExtra("url","https://nhentai.net/");
                startActivity(intent);

                Toast toast = Toast.makeText(MainActivity.this,
                        "進入Nhentai~", Toast.LENGTH_LONG);
                //顯示Toast
                toast.show();
            }
        });

        Button btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,web_Activity.class);
                intent.putExtra("url","https://www.wnacg.org/albums.html");
                startActivity(intent);

                Toast toast = Toast.makeText(MainActivity.this,
                        "進入Wnacg~", Toast.LENGTH_LONG);
                //顯示Toast
                toast.show();
            }
        });

    }
}
