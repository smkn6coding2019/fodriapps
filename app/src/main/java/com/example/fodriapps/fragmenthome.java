package com.example.fodriapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fragmenthome extends Activity {
    String var_nama, var_tanggal, var_meja,var_makanan, var_minuman;
    EditText nama, tanggal, meja, makanan, minuman;
    Button pesan, keluar;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        nama = (EditText) findViewById(R.id.edtName);
        tanggal = (EditText) findViewById(R.id.edtTanggal);
        meja = (EditText) findViewById(R.id.edtMeja);
        makanan = (EditText) findViewById(R.id.edtMakanan);
        minuman = (EditText) findViewById(R.id.edtMinuman);

        keluar=(Button)findViewById(R.id.btnkeluar);
        keluar.setOnClickListener((View.OnClickListener) this);

        Button pesan = (Button) findViewById(R.id.btnpesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var_nama = nama.getText().toString();
                var_tanggal = tanggal.getText().toString();
                var_meja = meja.getText().toString();
                var_makanan = makanan.getText().toString();
                var_minuman = minuman.getText().toString();


                Intent i = null;
                i = new Intent(fragmenthome.this, TampilActivity.class);
                Bundle b = new Bundle();
                b.putString("nama", var_nama);
                b.putString("tanggal", var_tanggal);
                b.putString("meja", var_meja);
                b.putString("makanan", var_makanan);
                b.putString("minuman", var_minuman);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
