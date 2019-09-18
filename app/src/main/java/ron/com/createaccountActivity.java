package ron.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class createaccountActivity extends AppCompatActivity {

    EditText    ETusername, ETpassword, ETReenterPassword, ETfullname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);

        ETusername.findViewById(R.id.ETusername);
        ETpassword.findViewById(R.id.ETpassword);
        ETReenterPassword.findViewById(R.id.ETReenterPassword);
        ETfullname.findViewById(R.id.ETfullname);
    }
}
