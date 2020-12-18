package datnguyen.lab.baithuchanh4application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewOrderAdapter orderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_drink);
        viewPager = findViewById(R.id.view_pager_drink_item);

        orderAdapter = new ViewOrderAdapter(getSupportFragmentManager());

        orderAdapter.addFragment(new GreenXmasFragment(), "Green Xmas");
        orderAdapter.addFragment(new IceBlendedFragment(), "Ice Blended");
        orderAdapter.addFragment(new TeaSodaFragment(), "Tea/ Soda");
        orderAdapter.addFragment(new PassioCoffeeFragment(), "Passio Coffe");
        orderAdapter.addFragment(new FreshEasyFragment(), "Fresh & Easy");

        viewPager.setAdapter(orderAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}