package jason.lee.brainbright;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contactlist extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.contactlist);

        TextInputEditText nameinput = findViewById(R.id.nameinput);
        TextInputEditText numberinput = findViewById(R.id.numberinput);
        Button btn = findViewById(R.id.addcontact_btn);
        TextView tv = findViewById(R.id.contactview);

        ArrayList<String> numbers = new ArrayList<String>();
        HashMap<String, String> contactlist = new HashMap<>();

           // System.out.println(numbers);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers.add(nameinput.getText().toString());
                String tmp = tv.getText().toString();
                contactlist.put(nameinput.getText().toString(),numberinput.getText().toString());
                List<String> keyList = new ArrayList<>(contactlist.keySet());

                tv.setText(tmp+"\n hello");
                //length method, access array list with index 

                Log.e("Contactlist",keyList.toString());
            }
        });


    }
}
