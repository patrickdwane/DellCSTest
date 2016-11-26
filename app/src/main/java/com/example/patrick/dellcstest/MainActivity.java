package com.example.patrick.dellcstest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgbutton = (ImageButton)findViewById(R.id.imgbutton);
        ImageButton imgbutton1 = (ImageButton)findViewById(R.id.imgbutton1);
        //ImageButton imgbutton2 = (ImageButton)findViewById(R.id.imgbutton2);
        //Button desktophome = (Button)findViewById(R.id.desktophome);

        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentNotebook = new Intent(v.getContext(), Notebook.class);
                startActivity(myIntentNotebook);
            }
        });

        //imgbutton.setOnClickListener(new View.OnClickListener(){
        //    public void onClick(View v){
        //        Intent myIntentimgbutton = new Intent(v.getContext(), Desktop.class);
        //        startActivity(myIntentimgbutton);
        //    }
        //});

        imgbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentDesktop = new Intent(v.getContext(), Desktop.class);
                startActivity(myIntentDesktop);
            }
        });

        //imgbutton2.setOnClickListener(new ImageButton.OnClickListener(){
        //    public void onClick(View v){
        //        Intent myIntentimgbutton2 = new Intent(v.getContext(),DesktopDetail.class );
        //        startActivity(myIntentimgbutton2);
        //    }
        //});

        //desktophome.setOnClickListener(new Button.OnClickListener(){
        //public void onClick(View v){
        //        Intent myIntentdesktophome = new Intent(v.getContext(),MainActivity.class );
        //        startActivity(myIntentdesktophome);
        //    }
        //});

    }

   //public void buttonOnClick(View view){
       //do something when button is clicked
       //ImageButton imgbutton= (ImageButton) view;
       //startActivity(new Intent(getApplicationContext(), Notebook.class));
       //ImageButton imgbutton1= (ImageButton) view;
       //startActivity(new Intent(getApplicationContext(), Desktop.class));
       //ImageButton imgbutton2= (ImageButton) view;
       //startActivity(new Intent(getApplicationContext(), DesktopDetail.class));

   //}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
