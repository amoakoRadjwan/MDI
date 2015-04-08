package com.app.mdi.mdi_interface;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;


public class LogIn extends ActionBarActivity {
    private EditText usernameEditText, passwordEditText;
    private ImageButton loginButton;
    private CheckBox rememberCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        usernameEditText = (EditText) findViewById(R.id.user_name);
        passwordEditText = (EditText) findViewById(R.id.user_password);
        loginButton = (ImageButton) findViewById(R.id.login_button);
        rememberCheckBox = (CheckBox) findViewById(R.id.remember_checkBox);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log_in, menu);
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

    public void onLoginClick(View view) {
        Intent homepageIntent = new Intent(this,HomePage.class);
        startActivity(homepageIntent);
    }

    public void onForgetPasswordClick(View view) {
        Intent

    }

    public void onSignUpClick(View view) {
        Intent signUpIntent = new Intent(this,singUp.class);
        startActivity(signUpIntent);


    }

    public void onRememberClick(View view) {

    }
}
