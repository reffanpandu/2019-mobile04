package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    public static  final String USERNAME_KEY = "username";
    public static  final String NAME_KEY = "name";
    public static  final String AGE_KEY = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            usernameText.setText(extras.getString(USERNAME_KEY));
            nameText.setText(extras.getString(NAME_KEY));
            ageText.setText(extras.getString(AGE_KEY));
        }
    }
}
