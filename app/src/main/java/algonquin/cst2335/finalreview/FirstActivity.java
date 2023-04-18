package algonquin.cst2335.finalreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    static final String KEY_NAME="Name";
    static final String KEY_LICENSE_ID="License ID";
    static final String KEY_SCORE="Score";
    static final String KEY_Rank="Rank";
    static final String KEY_PHONE="Phone";
    static final String KEY_SALES="Sales";
    static final String KEY_WEBSITE="website";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO_3 - start the activity when the button is clicked
        Button nextPageButton = findViewById(R.id.gotoSecondId);
        nextPageButton.setOnClickListener( click ->{
            //TODO_2 - Save content of Phone EditText
            EditText phoneTextView = findViewById(R.id.phoneId);
            String phone = phoneTextView.getText().toString();

            //TODO_1 - Create the intent here
            Intent secondPage = new Intent(FirstActivity.this, SecondActivity.class);
            secondPage.putExtra(KEY_PHONE, phone);

            startActivity(secondPage);
        });


    }
}