package miyawaki.yusuke.com.productculc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LinerGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_guide);
    }

    public void button1_onClick(View view){
        EditText c  = (EditText)this.findViewById(R.id.editText);
        EditText pc = (EditText)this.findViewById(R.id.editText2);
        EditText fh = (EditText)this.findViewById(R.id.editText3);
        EditText ft = (EditText)this.findViewById(R.id.editText4);
        EditText fc = (EditText)this.findViewById(R.id.editText5);
        EditText fw = (EditText)this.findViewById(R.id.editText6);
        Double C  = Double.parseDouble(c.getText().toString());
        Double Pc = Double.parseDouble(pc.getText().toString());
        Double Fh = Double.parseDouble(fh.getText().toString());
        Double Ft = Double.parseDouble(ft.getText().toString());
        Double Fc = Double.parseDouble(fc.getText().toString());
        Double Fw = Double.parseDouble(fw.getText().toString());
        Double num1 = Fh * Ft * Fc * C / Fw / Pc;
        Double num2 = num1 * num1 * num1 * 50d;
        int L = (int)Math.floor(num2);
        TextView text = (TextView)this.findViewById(R.id.textView7);
        text.setText("定格寿命=" + C + "Km");
    }
}
