package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] ankara_ilceleri={"Yenimahalle","Keçiören","Mamak","Ayaş","Kızılcahamam","Kazan"};
    ArrayAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner_id);
        AdapterOlustur();
        SpinnerAdpEkle();
        selectedItemSpinner();

    }
    public void AdapterOlustur()
    {
      adp=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,ankara_ilceleri);

    }
    public void SpinnerAdpEkle()
    {
        spinner.setAdapter(adp);
    }
    public void selectedItemSpinner()
    {
      spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(getApplicationContext(),spinner.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });

    }

}
