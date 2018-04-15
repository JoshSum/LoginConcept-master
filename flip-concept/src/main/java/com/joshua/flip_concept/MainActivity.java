package com.joshua.flip_concept;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joshua.flip_concept.AnimatedViewPager;
import com.joshua.flip_concept.AuthAdapter;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AnimatedViewPager pager= ButterKnife.findById(this,R.id.pager);
        pager.setAdapter(new AuthAdapter(getSupportFragmentManager(),pager));
    }
}
