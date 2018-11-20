package capstone1.dtu.f4.sosapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Button;

public class Off_Report extends AppCompatActivity {
    private RadioGroup radioGroupReport;
    private Button buttonVote;
    private String LOGTAG = "AndroidRadioDemo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_report);
        Button buttonVote = (Button) findViewById(R.id.btnVote);
        buttonVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Off_Report.this,"Đã báo cáo xong",Toast.LENGTH_SHORT).show();
            }
        });



    }

}
