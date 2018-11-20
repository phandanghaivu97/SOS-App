package capstone1.dtu.f4.sosapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Receive_SOS extends AppCompatActivity {
    private ImageButton imbReport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_sos);
        imbReport = (ImageButton) findViewById(R.id.imbReport);
        imbReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               setContentView(R.layout.activity_off_report);
            }
        });
    }
}
