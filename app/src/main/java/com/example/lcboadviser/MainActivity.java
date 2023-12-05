package com.example.lcboadviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DrinkExpert expert = new DrinkExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickFindDrinks(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner genre = (Spinner) findViewById(R.id.genre);
        String drinkType = String.valueOf(genre.getSelectedItem());


        List<String> brandList = expert.getBrands(drinkType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList){
            brandsFormatted.append(brand).append('\n');
        }

        brands.setText(brandsFormatted);
    }
}