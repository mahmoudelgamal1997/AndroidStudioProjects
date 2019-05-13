package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to put menu in bottomActionBar
        final BottomAppBar bottomAppBar=findViewById(R.id.bar);
        bottomAppBar.replaceMenu(R.menu.bottomappbar_menu);
        bottomAppBar.setTitle("Ramadan Kareem");
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Navigation", Toast.LENGTH_SHORT).show();
                BottomNavigation bottomNavigation=new BottomNavigation();

                bottomNavigation.show(getSupportFragmentManager(),"TAG");
            }
        });


        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){

                    case R.id.app_bar_fav:
                        Toast.makeText(getApplicationContext(), "Favourit", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.app_bar_search:
                        Toast.makeText(getApplicationContext(), "search", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.app_bar_settings:
                        Toast.makeText(getApplicationContext(), "setting", Toast.LENGTH_SHORT).show();
                        break;

                    case android.R.id.home:
                        Toast.makeText(getApplicationContext(), "home", Toast.LENGTH_SHORT).show();

                }

                return false;
            }
        });

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){

            case R.id.app_bar_fav:
                Toast.makeText(this, "Favourit", Toast.LENGTH_SHORT).show();

            break;

            case R.id.app_bar_search:
                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
            break;


            case R.id.app_bar_settings:
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
            break;

            case android.R.id.home:
                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();

        }


        return super.onOptionsItemSelected(item);
    }
}
