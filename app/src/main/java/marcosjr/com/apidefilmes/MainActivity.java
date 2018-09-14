package marcosjr.com.apidefilmes;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import marcosjr.com.apidefilmes.Fragments.Fragment1;
import marcosjr.com.apidefilmes.Fragments.Fragment2;
import marcosjr.com.apidefilmes.Fragments.Fragment3;
import marcosjr.com.apidefilmes.ViewAdapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout)findViewById(R.id.appbar);
        viewPager = (ViewPager) findViewById(R.id.viewoager);

        ViewPagerAdapter adapter= new ViewPagerAdapter(getSupportFragmentManager());

       //adicionando Fragmentos
        adapter.AddFragment(new Fragment1(),"Lista  1");
        adapter.AddFragment(new Fragment2(),"Lista  2");
        adapter.AddFragment(new Fragment3(),"Lista  3");

        //configuração do adapter
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
