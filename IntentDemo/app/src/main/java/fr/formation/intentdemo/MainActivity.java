package fr.formation.intentdemo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText domaineEcran;
TextView connectEcran;
 Button btDemo1;
 Button btDemo2;
 int REQUEST_CODE_LOGIN=1;
 int RESULT_CODE_OK=1;
 int RESULT_CODE_FALSE=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectEcran=findViewById(R.id.tvLogin);
        domaineEcran= findViewById(R.id.etDomain);
        btDemo1=findViewById(R.id.btDemo1);
        btDemo2=findViewById(R.id.btDemo2);

    }


    public void btnDemo1(View view) {
        Intent i = new Intent(this,login.class);
        String nomDomain = domaineEcran.getText().toString();
        i.putExtra("domaine",nomDomain);
        startActivity(i);





    }

    public void btnDemo2(View view) {

        Intent i = new Intent(this,login.class);
        String nomDomain = domaineEcran.getText().toString();
        i.putExtra("domaine",nomDomain);
        startActivityForResult(i,REQUEST_CODE_LOGIN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE_LOGIN) {
            if (resultCode == RESULT_CODE_OK) {
            connectEcran.setText("CONNECTE");
            }else{
                Toast.makeText(this,"login incorrect",Toast.LENGTH_LONG);
            }
        }
    }
}

