package com.jrdbnntt.cop4656.grabbag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void clickLogin(View view)
    {
        Intent intent = new Intent(this, GroupScreenActivity.class);
        startActivity(intent);
    }
}