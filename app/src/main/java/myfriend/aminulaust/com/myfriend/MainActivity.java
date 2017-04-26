package myfriend.aminulaust.com.myfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,dob,contact;
    Button save,show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        dob=(EditText)findViewById(R.id.dob);
        contact=(EditText)findViewById(R.id.contact);
        save=(Button)findViewById(R.id.save);
        show=(Button)findViewById(R.id.show);
        final MyDBFunctions mf = new MyDBFunctions(getApplicationContext());

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _name=name.getText().toString();
                String _bday=dob.getText().toString();
                String _contact=contact.getText().toString();
                Toast.makeText(getApplicationContext(),"Name: "+_name+"Bday: "+_bday+"Contact"+_contact+"\n", Toast.LENGTH_SHORT).show();

                DataTemp dt=new DataTemp(_name,_bday,_contact);
                mf.addingDataToTable(dt);
            }
        });
        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                 startActivity(new Intent(getApplicationContext(), ShowDetalis.class));



            }
        });
    }
}
