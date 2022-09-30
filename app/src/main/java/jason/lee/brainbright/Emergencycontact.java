package jason.lee.brainbright;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Emergencycontact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergencycontact);

        Button contacts_btn = findViewById(R.id.contacts_btn);

        contacts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Emergencycontact.this, Contactlist.class);
                startActivity(it);
            }
        });

        Button call = findViewById(R.id.guardian_btn);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01029484920";
                Log.e("E.java", number);
                if (ContextCompat.checkSelfPermission(Emergencycontact.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
                    startActivity(it);
                } else {
                    ActivityCompat.requestPermissions(
                            Emergencycontact.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            123);
                }
            }

        });

        Button call1 = findViewById(R.id.emergency_btn);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01090370329";
                Log.e("E.java", number);
                if (ContextCompat.checkSelfPermission(Emergencycontact.this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                    Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
                    startActivity(it);
                } else {
                    ActivityCompat.requestPermissions(
                            Emergencycontact.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            123);
                }
            }
        });
    }
}