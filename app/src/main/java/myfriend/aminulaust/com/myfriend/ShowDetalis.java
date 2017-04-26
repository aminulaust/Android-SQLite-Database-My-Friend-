package myfriend.aminulaust.com.myfriend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;


public class ShowDetalis extends AppCompatActivity {
    ListView lv;
    String [] data;
    //EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detalis);
       // ed=(EditText)findViewById(R.id.hello);
        lv = (ListView) findViewById(R.id.myfriendbday);

        MyDBFunctions mf=new MyDBFunctions(getApplicationContext());

        data=mf.my_data();

        lv.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.lview, R.id.mytext, data));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), UpdateDelete.class);
                i.putExtra("MyKEY", position);
                startActivity(i);
            }
        });

    }

}
