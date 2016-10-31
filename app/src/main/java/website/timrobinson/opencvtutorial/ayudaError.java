package website.timrobinson.opencvtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ayudaError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda_error);
    }

    public void btnIrAyudaBien (View view)
    {
        Intent intent = new Intent(ayudaError.this, ayudaBien.class);
        startActivity(intent);
    }

    public void btnIrPrincipal (View view)
    {
        Intent intent = new Intent(ayudaError.this, MainActivity.class);
        startActivity(intent);
    }

}
