package com.example.dell.cobagambar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

    Button button,button2;
    ImageView image;
    TextView NewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }

    public void addListenerOnButton() {
        NewText = (TextView)findViewById(R.id.textView1);
        image = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new OnClickListener() {

                                      @Override
                                      public void onClick(View arg0) {
                                          image.setImageResource(R.drawable.kucing);
                                          NewText.setText("Kucing");
                                      }

                                  }
        );
        button2.setOnClickListener(new OnClickListener() {

                                      @Override
                                      public void onClick(View arg0) {
                                          image.setImageResource(R.drawable.gajah);
                                          NewText.setText("Gajah");
                                      }

                                  }

        );

    }

}