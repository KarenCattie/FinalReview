package algonquin.cst2335.finalreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //TODO_4 - Retrieve the textview to display
        TextView infoTextView = findViewById(R.id.infos);

        //TODO_5 - Retrieve the data
        Intent fromPageOne = getIntent();
        String phoneText = fromPageOne.getStringExtra(FirstActivity.KEY_PHONE);

        //TODO_6 - Display the retrieved information on the screen
        infoTextView.setText("Phone number is: " + phoneText);

        //TODO_7 - Return to previous activity when BACK button is clicked
        Button backButton = findViewById(R.id.backButtonId);
        backButton.setOnClickListener( click -> {
            finish();
        });

    }
}