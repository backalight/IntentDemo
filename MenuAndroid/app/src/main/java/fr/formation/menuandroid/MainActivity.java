package fr.formation.menuandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

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
        if (id == R.id.action_parametre) {
            return true;
        }
        if (id == R.id.actionActivit0) {
            Intent i = new Intent(this,activitprincipal.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.actionActivit1) {
            Intent i = new Intent(this,activit1.class);
            startActivity(i);
            return true;

        }
        if (id == R.id.actionActivit2) {
            Intent i = new Intent(this,activit2.class);
            startActivity(i);
            return true;

        }
        if (id == R.id.actionActivit3) {
            Intent i = new Intent(this,activit3.class);
            startActivity(i);

            return true;
        }
        if (id == R.id.connexion) {
            if (item.isChecked())
            item.setChecked(false);

            else {
                item.setChecked(true);
            }
            return true;
        }



        return super.onOptionsItemSelected(item);
    }



}

