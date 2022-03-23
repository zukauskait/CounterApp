package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView results;
    EditText input;
    Calculation calc;
    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.choices);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.choices_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        results = (TextView) findViewById(R.id.result);

        Context context = getApplicationContext();
        CharSequence text = "You need to provide some text.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);



        final Button button = findViewById(R.id.calculate_btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                choice=spinner.getSelectedItem().toString();
                input = (EditText)findViewById(R.id.user_input);

                if(input.length()!=0){

                calc = new Calculation(input.getText().toString(),choice);
                results.setText(calc.count_values());

                }
                else {
                    toast.show();
                }
            }
        });




    }



}