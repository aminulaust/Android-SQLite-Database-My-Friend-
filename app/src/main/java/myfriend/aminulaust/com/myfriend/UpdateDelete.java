package myfriend.aminulaust.com.myfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateDelete extends AppCompatActivity {

    EditText getid, getidcon;
    Button update,delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);
        getid=(EditText)findViewById(R.id.edittext);
        update=(Button)findViewById(R.id.updatedatabase);
        delete=(Button)findViewById(R.id.delete_data);
        getidcon=(EditText)findViewById(R.id.edittextcon);


        final int rec_pos = getIntent().getIntExtra("MyKEY", 999);

        final MyDBFunctions obj = new MyDBFunctions(getApplicationContext());

        getid.setText(obj.fetch_day(rec_pos+1));
        getid.setSelection(getid.getText().length());
        getidcon.setText(obj.fetch_contact(rec_pos+1));
        getidcon.setSelection(getidcon.getText().length());


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                obj.update_birthday((rec_pos+1), getid.getText().toString(), getidcon.getText().toString());
               // obj.update_contact((rec_pos+1), getidcon.getText().toString());
                Toast.makeText(getApplicationContext(), "Updated Successfully!", Toast.LENGTH_SHORT).show();


            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj.delete_bday(obj.fetch_day(rec_pos+1));
                Toast.makeText(getApplicationContext(), "Deleted Successfully!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
