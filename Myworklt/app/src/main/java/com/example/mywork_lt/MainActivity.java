package com.example.mywork_lt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Fragment BlankFragment = new BlankFragment();
    private Fragment friendFragment = new friendFragment();
    private Fragment lianxirenFragment = new lianxirenFragment();
    private Fragment shezhiFragment = new shezhiFragment();

    private FragmentManager fragmentManager;

    private LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4;
    private ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linearLayout1 = findViewById(R.id.linearLayout1);
        linearLayout2 = findViewById(R.id.linearLayout2);
        linearLayout3 = findViewById(R.id.linearLayout3);
        linearLayout4 = findViewById(R.id.linearLayout4);



        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);

        initFragment();
        showfragment(0);

        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);


    }

    private void initFragment() {
        fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.id_content, BlankFragment);
        transaction.add(R.id.id_content, shezhiFragment);
        transaction.add(R.id.id_content, lianxirenFragment);
        transaction.add(R.id.id_content, friendFragment);
        transaction.commit();

    }

    private void hideFragment(FragmentTransaction transaction) {

        transaction.hide(BlankFragment);
        transaction.hide(lianxirenFragment);
        transaction.hide(friendFragment);
        transaction.hide(shezhiFragment);


    }

    @Override
    public void onClick(View v) {
        resetimg();
        switch (v.getId()) {
            case R.id.linearLayout1:
                showfragment(0);
                break;
            case R.id.linearLayout2:
                showfragment(1);
                break;
            case R.id.linearLayout3:
                showfragment(2);
                break;
            case R.id.linearLayout4:
                showfragment(3);
                break;
            default:
                break;

        }

    }

    private void resetimg() {
        imageView1.setImageResource(R.drawable.blank_b);
        imageView2.setImageResource(R.drawable.lianxi_b);
        imageView3.setImageResource(R.drawable.friend_b);
        imageView4.setImageResource(R.drawable.shezhi_b);

    }

    private void showfragment(int i) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (i) {
            case 0:
                transaction.show(BlankFragment);
                imageView1.setImageResource(R.drawable.blank_a);
                break;
            case 1:
                transaction.show(lianxirenFragment);
                imageView2.setImageResource(R.drawable.lianxi_a);
                break;
            case 2:
                transaction.show(friendFragment);
                imageView3.setImageResource(R.drawable.friend_a);
                break;
            case 3:
                transaction.show(shezhiFragment);
                imageView4.setImageResource(R.drawable.shezhi_a);
                break;
            default:
                break;
        }
        transaction.commit();
    }
  

}