package thom9521.appcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView resultView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 + num2;
                resultView.setText(result + ""); //"" er nødvendigt for at appen ikke crasher
            }
        });

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView resultView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 - num2;
                resultView.setText(result + ""); //"" er nødvendigt for at appen ikke crasher
            }
        });

        Button multiBtn = (Button) findViewById(R.id.mutliBtn);
        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView resultView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 * num2;
                resultView.setText(result + ""); //"" er nødvendigt for at appen ikke crasher
            }
        });

        Button divBtn = (Button) findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView resultView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 / num2;
                resultView.setText(result + ""); //"" er nødvendigt for at appen ikke crasher
            }
        });

        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView resultView = (TextView) findViewById(R.id.resultTextView);

                editText1.setText(null);
                editText2.setText(null);
                resultView.setText("Result");
            }
        });

        Button githubBtn = (Button) findViewById(R.id.githubBtn);
        githubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String github = "https://github.com/Thom9521/AppCalculator";
                Uri webaddress = Uri.parse(github);

                Intent goToGithub = new Intent(Intent.ACTION_VIEW, webaddress);
                if (goToGithub.resolveActivity(getPackageManager()) != null){
                    startActivity(goToGithub);
                }
            }
        });
    }
}
