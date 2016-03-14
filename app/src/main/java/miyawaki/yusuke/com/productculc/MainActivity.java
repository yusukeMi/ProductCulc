package miyawaki.yusuke.com.productculc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Activity activity = this;
        Button btn1 = (Button) activity.findViewById(R.id.LGbtn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(activity, LinerGuideActivity.class);
                activity.startActivity(intent1);
            }
        });

        Button btn2 = (Button) activity.findViewById(R.id.BSbtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(activity, BallScrewActivity.class);
                activity.startActivity(intent2);
            }
        });
    }
}
