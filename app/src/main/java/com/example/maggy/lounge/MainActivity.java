package com.example.maggy.lounge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , SearchView.OnQueryTextListener {
    
    Fragment fragment,fash,hotspo ,influ,Life_style,buaty,ev;
    LinearLayout linearLayout ;
    Button fashion ;
    Button beauty ;
    Button celebrities ;
    Button influencers ;

    Button lifestyle ;
    Button events ;
    Button hotspot ;
    Button horoscofes;







     SliderLayout w ;
       int [] sliderPhoto = {R.drawable.lounge2,R.drawable.lounge3,R.drawable.lounge4,R.drawable.lounge5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linear);











        fashion=findViewById(R.id.fashion_btn);
        beauty=findViewById(R.id.beauty);
        celebrities =findViewById(R.id.celebrities);
        influencers = findViewById(R.id.influencers);
        lifestyle = findViewById(R.id.life);
        events = findViewById(R.id.events_btn);
        hotspot =findViewById(R.id.hotspot);
        horoscofes =findViewById(R.id.horoscofes);







        w = findViewById(R.id.slider);
        for (int i = 0 ; i <sliderPhoto.length ; i++){
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView.setScaleType(BaseSliderView.ScaleType.CenterCrop);
            textSliderView.image(sliderPhoto[i]);
            w.addSlider(textSliderView);

        }

        
        
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            super.onBackPressed();
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        int a = item.getItemId();
        switch (a) {
            case R.id.items:
                Intent b = new Intent(getApplicationContext(), searchtest.class);
                startActivity(b);

                break;

        }



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


          if (id == R.id.nav_Sign_In) {
Intent b = new Intent(this,Sign_in.class);
startActivity(b);

        } else if (id == R.id.nav_About_us) {
            Intent a = new Intent(this,About_us.class);
            startActivity(a);

          } else if (id == R.id.nav_face) {
              Toast.makeText(this, "Share face", Toast.LENGTH_SHORT).show();
              Intent facebookIntent = openFacebook(MainActivity.this);
              startActivity(facebookIntent);


          } else if (id == R.id.nav_mail) {
              Toast.makeText(this, "Share mail", Toast.LENGTH_SHORT).show();

    } else if (id == R.id.Home) {

              Intent a =new Intent(this,MainActivity.class);
              startActivity(a);
              finish();

    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.serach_menu,menu);
        SearchView searchview = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.search));
        searchview.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
        return true;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }



    public static Intent openFacebook(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/376227335860239"));
        } catch (Exception e){

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com"));
        }


    }

    public void change_color() {

        beauty.setBackgroundResource(R.drawable.background);
        beauty.setTextColor(getResources().getColor(R.color.textColor));

        fashion.setBackgroundResource(R.drawable.background);
        fashion.setTextColor(getResources().getColor(R.color.textColor));

        celebrities.setBackgroundResource(R.drawable.background);
        celebrities.setTextColor(getResources().getColor(R.color.textColor));

        influencers.setBackgroundResource(R.drawable.background);
        influencers.setTextColor(getResources().getColor(R.color.textColor));

        lifestyle.setBackgroundResource(R.drawable.background);
        lifestyle.setTextColor(getResources().getColor(R.color.textColor));

        events.setBackgroundResource(R.drawable.background);
        events.setTextColor(getResources().getColor(R.color.textColor));

        horoscofes.setBackgroundResource(R.drawable.background);
        horoscofes.setTextColor(getResources().getColor(R.color.textColor));

        hotspot.setBackgroundResource(R.drawable.background);
        hotspot.setTextColor(getResources().getColor(R.color.textColor));

    }


    public void fashion(View view) {
        change_color();
        fragment = new BlankFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, fragment);
        ft.commit();
        fashion.setBackgroundResource(R.drawable.backgroundonclick);
        fashion.setTextColor(getResources().getColor(R.color.white));
    }


    public void beauty(View view) {
        change_color();
        buaty = new Beauty();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, buaty);
        ft.commit();
        beauty.setBackgroundResource(R.drawable.backgroundonclick);
        beauty.setTextColor(getResources().getColor(R.color.white));
    }

    public void celebrities(View view) {
        change_color();
        fash = new fashion();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, fash);
        ft.commit();
        celebrities.setBackgroundResource(R.drawable.backgroundonclick);
        celebrities.setTextColor(getResources().getColor(R.color.white));
    }

    public void lifestyle(View view) {
        change_color();
        Life_style = new Life_style();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, Life_style);
        ft.commit();
        lifestyle.setBackgroundResource(R.drawable.backgroundonclick);
        lifestyle.setTextColor(getResources().getColor(R.color.white));
    }

    public void events(View view) {
        change_color();
        ev = new events();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, ev);
        ft.commit();
        events.setBackgroundResource(R.drawable.backgroundonclick);
        events.setTextColor(getResources().getColor(R.color.white));
    }

    public void hotspot(View view) {
        change_color();
        hotspo = new Hotspot();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, hotspo);
        ft.commit();
        hotspot.setBackgroundResource(R.drawable.backgroundonclick);
        hotspot.setTextColor(getResources().getColor(R.color.white));

    }

    public void horoscofes(View view) {
        change_color();
        horoscofes.setBackgroundResource(R.drawable.backgroundonclick);
        horoscofes.setTextColor(getResources().getColor(R.color.white));
    }

    public void influencers(View view) {
        change_color();
         influ = new influencer();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, influ);
        ft.commit();
        influencers.setBackgroundResource(R.drawable.backgroundonclick);
        influencers.setTextColor(getResources().getColor(R.color.white));

    }
}
