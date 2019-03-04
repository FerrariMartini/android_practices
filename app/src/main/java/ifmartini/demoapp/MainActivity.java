package ifmartini.demoapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    function to get data from TextField and show an wait message.
    public void logInButton(View view) {

//        Get and store Name and Password into variables of type EditText
        EditText getUser = (EditText) findViewById(R.id.textFielName);
        EditText getPassword = (EditText) findViewById(R.id.textFieldPwd);

//        Show on IDE the name and password inputed by user.
        Log.i("Debug", getUser.getText().toString());
        Log.i("Debug", getPassword.getText().toString());

//        Ask for user hold on
        Toast.makeText(MainActivity.this, "Wait a second " + getUser.getText().toString() + ".\n We are checking....",
                Toast.LENGTH_LONG).show();

//        Replace the dog image when LogInButton is pressed.
        ImageView getImage = (ImageView) findViewById(R.id.sadDog);
        getImage.setImageResource(R.drawable.happy_dog);
    }

//    function to replace the Dog ImageView.
    public void happyDog(View view){
        ImageView getImage = (ImageView) findViewById(R.id.sadDog);
        getImage.setImageResource(R.drawable.happy_dog);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
