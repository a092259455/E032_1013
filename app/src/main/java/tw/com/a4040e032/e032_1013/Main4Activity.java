package tw.com.a4040e032.e032_1013;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private TextView t2;
    private Button B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        findviews();
    }
    public void findviews(){
        t2 = (TextView) findViewById(R.id.t2);
        B4 = (Button) findViewById(R.id.B4);
        Button nextPageBtn = (Button) findViewById(R.id.B4);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main4Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
