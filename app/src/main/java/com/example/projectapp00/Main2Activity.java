package com.example.projectapp00;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class Main2Activity extends AppCompatActivity {


     /**
      *
      */
     Development development_frag;
     Design design_frag;
     Markting markting_frag;

     @Override
     protected void onCreate (Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main2);

         development_frag = new Development();
         design_frag = new Design();
         markting_frag = new Markting();
         BottomNavigationView nav = findViewById(R.id.nav);
         final FrameLayout content = findViewById(R.id.content_layout);


         change_Fragment(development_frag);


         nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected (@NonNull MenuItem item) {

                 switch (item.getItemId()) {

                     case R.id.development:
                         //add development code
                         change_Fragment(development_frag);
                         Animation developmentv = AnimationUtils.loadAnimation(Main2Activity.this, R.anim.custom_animaion);
                         content.startAnimation(developmentv);
                         return true;

                     case R.id.design:
                         //add development code
                         change_Fragment(design_frag);
                         Animation design = AnimationUtils.loadAnimation(Main2Activity.this, R.anim.custom_animaion);
                         content.startAnimation(design);
                         return true;


                     case R.id.markting:
                         //add development code

                         change_Fragment(markting_frag);
                         Animation markting = AnimationUtils.loadAnimation(Main2Activity.this, R.anim.custom_animaion);
                         content.startAnimation(markting);
                         return true;


                     default:
                         return false;
                 }

             }
         });


     }

     private void change_Fragment (Fragment fragment) {
         FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
         fragmentTransaction3.replace(R.id.content_layout, fragment);
         fragmentTransaction3.commit();
     }
 }