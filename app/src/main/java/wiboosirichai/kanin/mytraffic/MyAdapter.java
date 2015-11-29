package wiboosirichai.kanin.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kanin on 11/29/2015.
 */
public class MyAdapter extends BaseAdapter {
    //explicit
    private Context objContext;
    private int[] iconInts;
    private String[] titelStrings;
    private String[] detailStrings;


    public MyAdapter(Context objContext, int[] iconInts, String[] titelStrings, String[] detailStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titelStrings = titelStrings;
        this.detailStrings = detailStrings;
    }   // constructor

    @Override
    public int getCount() {

        return titelStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.my_review, parent, false);

        ImageView iconimageView = (ImageView) objView.findViewById(R.id.imv_icon);

        iconimageView.setImageResource(iconInts[position]);

        TextView titleTextView = (TextView) objView.findViewById(R.id.txt_title);
        titleTextView.setText(titelStrings[position]);

        TextView detailTextView = (TextView) objView.findViewById(R.id.txt_detail);
        detailTextView.setText(detailStrings[position]);

        return objView;
    }
}/// main Class
