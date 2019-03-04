package ifmartini.demoapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void logInButton(View view) {

        EditText getUser = (EditText) findViewById(R.id.textFielName);
        EditText getPassword = (EditText) findViewById(R.id.textFieldPwd);
        Log.i("Debug", getUser.getText().toString());
        Log.i("Debug", getPassword.getText().toString());

        Toast.makeText(MainActivity.this, "Wait a second " + getUser.getText().toString(),
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
