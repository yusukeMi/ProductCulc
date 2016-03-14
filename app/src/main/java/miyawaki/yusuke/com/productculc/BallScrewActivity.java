package miyawaki.yusuke.com.productculc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BallScrewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_screw);
    }

    public void button2_onClick(View view){
        EditText ca  = (EditText)this.findViewById(R.id.editText);
        EditText fa = (EditText)this.findViewById(R.id.editText2);
        EditText fw = (EditText)this.findViewById(R.id.editText3);
        Double Ca  = Double.parseDouble(ca.getText().toString());
        Double Fa = Double.parseDouble(fa.getText().toString());
        Double Fw = Double.parseDouble(fw.getText().toString());
        Double num1 = Ca / Fw / Fa;
        Double num2 = num1 * num1 * num1 * 1000000;
        int L = (int)Math.floor(num2);
        TextView text = (TextView)this.findViewById(R.id.textView7);
        text.setText("定格寿命＝" + L + "rev");
    }

}
