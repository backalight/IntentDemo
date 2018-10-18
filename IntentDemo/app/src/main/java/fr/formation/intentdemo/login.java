package fr.formation.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private EditText ecranDomainLogin;
    private EditText ecranLogin;
    private EditText ecranPassword;
    private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ecranLogin=findViewById(R.id.etLogin);
        ecranPassword=findViewById(R.id.etPwd);
        ok=findViewById(R.id.btOk);
        ecranDomainLogin=findViewById(R.id.etDomain);

      ecranDomainLogin.setText(getIntent().getStringExtra("domaine"));

    }

    public int btOk(View view) {
       int RESULT_CODE_OK_LOGIN;
        Intent i = new Intent(this,MainActivity.class);
        if(ecranLogin.getText().equals(ecranPassword.getText())){
          RESULT_CODE_OK_LOGIN=1;

        }else{
            RESULT_CODE_OK_LOGIN=-1;
        }
            finish();
            return RESULT_CODE_OK_LOGIN;




    }
}
