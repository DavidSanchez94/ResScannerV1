package website.timrobinson.opencvtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ayudaBien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda_bien);
    }

    public void btnIrAyudaMal (View view)
    {
        Intent intent = new Intent(ayudaBien.this, ayudaError.class);
        startActivity(intent);
    }

}
