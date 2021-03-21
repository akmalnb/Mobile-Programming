package umn.ac.id.uts_31187;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView textViewMyProfile;

    EditText inptUsername, inptPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textViewMyProfile = (TextView) findViewById(R.id.textViewMyProfile);
        textViewMyProfile.setPaintFlags(textViewMyProfile.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        inptUsername = findViewById(R.id.inputUsername);
        inptPassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inptUsername.getText().toString().equals("uasmobile") && inptPassword.getText().toString().equals("uasmobilegenap")) {
                    moveToListMusic();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username & Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void moveToListMusic() {
        Intent intent = new Intent(this, ListMusicActivity.class);
        startActivity(intent);
    }

    public void moveToViewProfile(View view) {
        Intent intent = new Intent(this, ViewProfileActivity.class);
        startActivity(intent);
    }


}
