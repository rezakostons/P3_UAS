package com.example.menghitung_diskon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hitung extends Activity implements OnClickListener {
	EditText diskon,harga;
	Button proses,hapus;
	TextView hasilnya,RP;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hitung);
		
		harga = (EditText)findViewById(R.id.harga);
		diskon = (EditText)findViewById(R.id.diskon);
		hasilnya = (TextView) findViewById(R.id.hasilnya);
		RP		= (TextView) findViewById(R.id.RP);
		proses = (Button) findViewById(R.id.proses);
		proses.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int nilai1 = Integer.parseInt(harga.getText().toString());
		int nilai2 = Integer.parseInt(diskon.getText().toString());
		int nilai3 = Integer.parseInt(harga.getText().toString());
		
		switch (arg0.getId()) {
		
		case R.id.proses:
			hasilnya.setText(Integer.toString(nilai3-(nilai1*nilai2/100)));
			RP.setText("RP.");
			break;
		}
		
	}
			
}

