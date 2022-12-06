package jason.lee.brainbright;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Survey extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);

        TextView q1 = findViewById(R.id.test1);
        TextView q2 = findViewById(R.id.test2);
        Button btn = findViewById(R.id.testbtn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(count);
                q1.setText(str);
                count = count + 1;
                q2.setText("Hello World");


            }
        });


    }
}
