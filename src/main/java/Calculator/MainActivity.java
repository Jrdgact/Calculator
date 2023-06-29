package Calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity{

    EditText result;
    Button b_ac, b_inverse, b_root, b_division, b_mul, b_sub, b_add, b_dot, b_equal;
    Button b_0, b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9;
    boolean clr_flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

}