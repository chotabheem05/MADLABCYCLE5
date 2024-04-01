package in.udith.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    //Declaration
    EditText unmae, pswd;
    Button login, cancel;

    DbHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Typecasting
        unmae = findViewById(R.id.editText);
        pswd = findViewById(R.id.editText2);
        login = findViewById(R.id.button);
        cancel =  findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = unmae.getText().toString();
                String  password = pswd.getText().toString();

                int id =  checkUser(new User(name, password));

                if (id == -1)  {
                    Snackbar.make(v, "User " +name+ " Does not  Exists!", Snackbar.LENGTH_LONG).show();
                }
                else {
                    Snackbar.make(v, "User" +name+ "Esists", Snackbar.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        });

        db = new DbHandler(MainActivity.this);
        db.addUser(new User("Udith", "12345"));
    }
    public int checkUser(User user)
    {
        return db.checkUser(user);
    }
}