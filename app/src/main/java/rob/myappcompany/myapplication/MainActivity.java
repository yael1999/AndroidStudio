package rob.myappcompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void doSomething(View view){
        EditText iv1=(EditText) findViewById(R.id.amountText);
        double NISVALUE = Double.valueOf(iv1.getText().toString());
        double DOLLARVALUE= 3.6*Double.valueOf(iv1.getText().toString());
        Toast.makeText(getApplicationContext(),NISVALUE+" NIS  is " +Double.toString(DOLLARVALUE)+ " dollars" , Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}