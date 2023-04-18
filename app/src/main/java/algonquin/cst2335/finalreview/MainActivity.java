package algonquin.cst2335.finalreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO_create the listener that will implement the buy button.
        // The phone is $400 and its name is 'Samsung S8'
        //When the user clicks on the button, we should display
        //in the yellow textview at the bottom a text
        // that shows the product name and its price
        Button buyButton = findViewById(R.id.buyId);
        TextView textView = findViewById(R.id.textView);
        buyButton.setOnClickListener( click -> {
            String phoneName = getString(R.string.samsung_galaxy);
            int price = 400;
            textView.setText("The price of " + phoneName + " is $" + price);
        });

    }
}