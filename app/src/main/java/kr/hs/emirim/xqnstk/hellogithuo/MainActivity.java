package kr.hs.emirim.xqnstk.hellogithuo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnhello = (Button) findViewById(R.id.btnhello);
        btnhello.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "콰가가강", Toast.LENGTH_LONG).show();
    }
}
