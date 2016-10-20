package tw.com.a4040e032.e032_1013;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private TextView t1;
private Button B3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViews();
    }
    public void findViews(){
        t1 = (TextView) findViewById(R.id.t1);
        B3 = (Button) findViewById(R.id.B3);
        Button nextPageBtn = (Button)findViewById(R.id.B3);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
