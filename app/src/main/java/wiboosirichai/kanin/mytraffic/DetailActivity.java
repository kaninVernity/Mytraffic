package wiboosirichai.kanin.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
//Ecplicit
    private TextView titleTextView, detailTextView;
    private ImageView IconImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        bindwigget();
        showView();

    } // main method

    private void showView() {
        String strTitle = getIntent().getStringExtra("title");
        titleTextView.setText(strTitle);
        String strDetail = getIntent().getStringExtra("detail");
        detailTextView.setText(strDetail);
        int intImage = getIntent().getIntExtra("Image",R.drawable.traffic_01);
        IconImageView.setImageResource(intImage);
    }

    private void bindwigget() {
        titleTextView = (TextView) findViewById(R.id.textView2);
        detailTextView = (TextView) findViewById(R.id.textView3);
        IconImageView = (ImageView) findViewById(R.id.imageView);
    }
}// main class
