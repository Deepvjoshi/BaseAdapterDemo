package com.deepjoshi.chocopyk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Ctyp extends AppCompatActivity {
    int[] Veg;
    String[] d={"dj"};
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctyp);
        ls=(ListView)findViewById(R.id.ds);
        int quotePosition = getIntent().getIntExtra("listquotes", -1);

        if (quotePosition==0){
            Veg=new int[]{R.drawable.ic_menu_camera};
CustomAdapter cd=new CustomAdapter(this,R.layout.ds,d,Veg);
ls.setAdapter(cd);
        }
        else if (quotePosition==1){
            //pass string array and image array of sub
            CustomAdapter cd=new CustomAdapter(this,R.layout.ds,d,Veg);
            ls.setAdapter(cd);

        }
    }
}
