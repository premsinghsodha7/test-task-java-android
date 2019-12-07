package example.com.test_task_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout flMainLayout;
    private EditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting components xml id's
        flMainLayout = findViewById(R.id.mainlayout);
        etSearch = findViewById(R.id.et_search);

        //Assign layout to FrameLayout that handle the report
        flMainLayout.addView(new ParentLayoutT(this));
    }
}
