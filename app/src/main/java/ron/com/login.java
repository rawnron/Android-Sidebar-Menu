package ron.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static ron.com.R.id.TVcreateaccount;

public class login extends AppCompatActivity implements View.OnClickListener {

        EditText    ETusername, ETpassword;
        Button  BTNlogin;
        TextView    TVcreateaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ETusername=findViewById(R.id.ETusername);
        ETpassword=findViewById(R.id.ETpassword);

        BTNlogin=findViewById(R.id.BTNlogin);

        TVcreateaccount=findViewById(R.id.TVcreateaccount);

        BTNlogin.setOnClickListener(this);

        TVcreateaccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.BTNlogin:

                break;

            case R.id.TVcreateaccount:
                Intent createaccountIntent = new Intent(this, createaccountActivity.class);
                startActivity(createaccountIntent);
                break;
        }
    }
}
