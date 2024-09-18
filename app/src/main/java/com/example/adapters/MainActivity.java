package com.example.adapters;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //Adapter is a bridge between data to adapterview components
        // DATA SOURCE - > ADAPTER -> ADAPTER VIEW COMPONENTS


        //Data source
        String[] countries = {"USA", "GERMANY", "FRANCE", "ITALY", "CHINA"};

        //Adapter
        myCustomAdapter adapter = new myCustomAdapter(
                this,
                countries
        );


        // AdapterView : ListView
        ListView listview = findViewById(R.id.listview);
        listview.setAdapter(adapter);












    }
}