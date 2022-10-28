package jason.lee.brainbright;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Abc extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.abc);

            FirebaseDatabase database = FirebaseDatabase.getInstance("https://brainbright-559e5-default-rtdb.asia-southeast1.firebasedatabase.app/");

            DatabaseReference myRef = database.getReference("key 1");

            TextView test = findViewById(R.id.textView3);
           // test.setText(myRef.);

            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // This method is called once with the initial value and again
                    // whenever data at this location is updated.
                    for (DataSnapshot guide : dataSnapshot.getChildren()) {
                        //String getDto = guide.getValue();

                    }
                }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


            }


        }


