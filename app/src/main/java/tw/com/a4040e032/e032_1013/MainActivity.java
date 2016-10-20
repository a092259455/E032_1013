package tw.com.a4040e032.e032_1013;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText NA;
private EditText PA;
private EditText PH;
private Button B1;
private Button B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    private void findViews(){
NA = (EditText) findViewById(R.id.NA);
PA = (EditText) findViewById(R.id.PA);
PH = (EditText) findViewById(R.id.PH);
B1 = (Button)   findViewById(R.id.B1);
B2 = (Button)   findViewById(R.id.B2);
Button nextPageBtn = (Button)findViewById(R.id.B1);
nextPageBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =  new Intent();
        intent.setClass(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }
});
Button nextPageBtn1 = (Button)findViewById(R.id.B2);
nextPageBtn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Main4Activity.class);
        startActivity(intent);
    }
});
    }
}
