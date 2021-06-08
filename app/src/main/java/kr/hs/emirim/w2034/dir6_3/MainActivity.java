package kr.hs.emirim.w2034.dir6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec t1 = tabHost.newTabSpec("one").setIndicator("star");
        t1.setContent(R.id.img1);
        tabHost.addTab(t1);

        TabHost.TabSpec t2 = tabHost.newTabSpec("two").setIndicator("miniCar");
        t2.setContent(R.id.img3);
        tabHost.addTab(t2);

        TabHost.TabSpec t3 = tabHost.newTabSpec("three").setIndicator("universe");
        t3.setContent(R.id.img4);
        tabHost.addTab(t3);

        TabHost.TabSpec t4 = tabHost.newTabSpec("four").setIndicator("wedding");
        t4.setContent(R.id.img5);
        tabHost.addTab(t4);
    }
}