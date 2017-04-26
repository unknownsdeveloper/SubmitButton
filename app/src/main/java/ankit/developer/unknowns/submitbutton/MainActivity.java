package ankit.developer.unknowns.submitbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.spark.submitbutton.SubmitButton;

public class MainActivity extends AppCompatActivity {
    SubmitButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (SubmitButton)findViewById(R.id.submitButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Submit",Toast.LENGTH_SHORT).show();
            }

        });

    }
}
