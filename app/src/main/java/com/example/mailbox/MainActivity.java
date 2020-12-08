package com.example.mailbox;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeMail homeMail=new HomeMail();
        FragmentManager m=getSupportFragmentManager();
        m.beginTransaction().add(R.id.frame_container,homeMail).commit();



        bottomNav=findViewById(R.id.navigation1);
        bottomNav.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment=null;
                switch (menuItem.getItemId()){
                    case R.id.nav_mail:
                        selectedFragment=new HomeMail();
                        break;
                    case R.id.nav_change:
                        selectedFragment=new ChangeMail();
                        break;
                    case R.id.nav_search:
                        selectedFragment=new SreachMail();
                        break;
                    case R.id.nav_star:
                        selectedFragment=new StarMail();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,selectedFragment).commit();

            }
        });

    }



}