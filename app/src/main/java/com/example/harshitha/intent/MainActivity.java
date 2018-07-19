package com.example.harshitha.intent;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity
{
    //Initialising variables
    EditText Text;
    Button Srchbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining variables
        Text = (EditText)findViewById(R.id.EdtTxt);
        Srchbtn = (Button)findViewById(R.id.Search);
        Srchbtn.setOnClickListener(new View.OnClickListener()
        {
            //Onclick event
            @Override
            public void onClick(View v)
            {

                String input = Text.getText().toString(); //Getting Text And Converting To String Format
                //Initialising And Defining Google Search Implicit Intent
                Intent GoogleSearch = new Intent(Intent.ACTION_WEB_SEARCH);
                GoogleSearch.putExtra(SearchManager.QUERY, input);
                //Starting Activity
                startActivity(GoogleSearch);
            }
        });
    }
}
