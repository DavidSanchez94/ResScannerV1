package website.timrobinson.opencvtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import website.timrobinson.opencvtutorial.MainActivity;

public class Main4ActivityCalcular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_calcular);
    }

    public void RegrsaerPrincipal (View view)
    {
        Intent intent = new Intent(Main4ActivityCalcular.this, MainActivity.class);
        startActivity(intent);
    }
}
