package com.example.fodriapps;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TampilActivity extends Activity {

    TextView nama,tanggal,meja, makanan, minuman;
    String get_nama,get_tanggal,get_meja, get_makanan, get_minuman;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        nama = (TextView) findViewById(R.id.edtName);
        tanggal = (TextView) findViewById(R.id.edtTanggal);
        meja = (TextView) findViewById(R.id.edtMeja);
        makanan = (TextView) findViewById (R.id.edtMakanan);
        minuman = (TextView) findViewById(R.id.edtMinuman);

        Bundle b = getIntent().getExtras();

        get_nama = b.getString("nama");
        get_tanggal = b.getString("tanggal");
        get_meja = b.getString("meja");
        get_makanan = b.getString("makanan");
        get_minuman = b.getString("minuman");

        nama.setText("Nama : "+get_nama);
        tanggal.setText("Tanggal : "+get_tanggal);
        meja.setText("No.Meja : "+get_meja);
        makanan.setText("Makanan : "+get_makanan);
        minuman.setText("Minuman : "+get_minuman);
    }
}

