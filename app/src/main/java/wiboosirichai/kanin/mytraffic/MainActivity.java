package wiboosirichai.kanin.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView trafficsViewListView;
    private Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwig();

        buttonContorller();

        ///// create listview
        createListview();


    }

    private void createListview() {

        /// IconImage
        int[] intIcon = new int[20];
        intIcon[0] = R.drawable.traffic_01;
        intIcon[1] = R.drawable.traffic_02;
        intIcon[2] = R.drawable.traffic_03;
        intIcon[3] = R.drawable.traffic_04;
        intIcon[4] = R.drawable.traffic_05;
        intIcon[5] = R.drawable.traffic_06;
        intIcon[6] = R.drawable.traffic_07;
        intIcon[7] = R.drawable.traffic_08;
        intIcon[8] = R.drawable.traffic_09;
        intIcon[9] = R.drawable.traffic_10;
        intIcon[10] = R.drawable.traffic_11;
        intIcon[11] = R.drawable.traffic_12;
        intIcon[12] = R.drawable.traffic_13;
        intIcon[13] = R.drawable.traffic_14;
        intIcon[14] = R.drawable.traffic_15;
        intIcon[15] = R.drawable.traffic_16;
        intIcon[16] = R.drawable.traffic_17;
        intIcon[17] = R.drawable.traffic_18;
        intIcon[18] = R.drawable.traffic_19;
        intIcon[19] = R.drawable.traffic_20;

        String[] strtitle = new String[20];
        strtitle[0] = "หัวข้อที่1";
        strtitle[1] = "หัวข้อที่2";
        strtitle[2] = "หัวข้อที่3";
        strtitle[3] = "หัวข้อที่4";
        strtitle[4] = "หัวข้อที่5";
        strtitle[5] = "หัวข้อที่6";
        strtitle[6] = "หัวข้อที่7";
        strtitle[7] = "หัวข้อที่8";
        strtitle[8] = "หัวข้อที่9";
        strtitle[9] = "หัวข้อที่10";
        strtitle[10] = "หัวข้อที่11";
        strtitle[11] = "หัวข้อที่12";
        strtitle[12] = "หัวข้อที่13";
        strtitle[13] = "หัวข้อที่14";
        strtitle[14] = "หัวข้อที่15";
        strtitle[15] = "หัวข้อที่16";
        strtitle[16] = "หัวข้อที่17";
        strtitle[17] = "หัวข้อที่18";
        strtitle[18] = "หัวข้อที่19";
        strtitle[19] = "หัวข้อที่20";


        String[] strdetail = new String[20];
        strdetail[0] = "รายละเอียดที่ 1";
        strdetail[1] = "รายละเอียดที่ 2";
        strdetail[2] = "รายละเอียดที่ 3";
        strdetail[3] = "รายละเอียดที่ 4";
        strdetail[4] = "รายละเอียดที่ 5";
        strdetail[5] = "รายละเอียดที่ 6";
        strdetail[6] = "รายละเอียดที่ 7";
        strdetail[7] = "รายละเอียดที่ 8";
        strdetail[8] = "รายละเอียดที่ 9";
        strdetail[9] = "รายละเอียดที่ 10";
        strdetail[10] = "รายละเอียดที่ 11";
        strdetail[11] = "รายละเอียดที่ 12";
        strdetail[12] = "รายละเอียดที่ 13";
        strdetail[13] = "รายละเอียดที่ 14";
        strdetail[14] = "รายละเอียดที่ 15";
        strdetail[15] = "รายละเอียดที่ 16";
        strdetail[16] = "รายละเอียดที่ 17";
        strdetail[17] = "รายละเอียดที่ 18";
        strdetail[18] = "รายละเอียดที่ 19";
        strdetail[19] = "รายละเอียดที่ 20";


        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this,intIcon,strtitle,strdetail);
        trafficsViewListView.setAdapter(objMyAdapter);

    }///// create list view

    private void buttonContorller() {
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.phonton1);
                buttonPlayer.start();
                //////web view
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/KK9juxl_1LI"));
                startActivity(objIntent);

            } // Event
        });
    }

    private void bindwig() {
        trafficsViewListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);

    }


}
