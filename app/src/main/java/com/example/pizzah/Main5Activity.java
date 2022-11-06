package com.example.pizzah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    private TextView tvl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tvl = (TextView)findViewById(R.id.detail_order);

        final CheckBox cb = (CheckBox)findViewById(R.id.cbpick);
        final CheckBox cb1 = (CheckBox)findViewById(R.id.cbdel);
        Button btn = (Button)findViewById(R.id.btn_order);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Terima kasih Ka Ammar telah memesan di toko kami, pesanan akan di pick up oleh anda!", Toast.LENGTH_SHORT).show();
                }
                else if (cb1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Terima kasih Ka Ammar telah memesan di toko kami, pesanan anda akan diantar dalam waktu 30 menit!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}