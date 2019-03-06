package com.londonappbrewery.destini;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.londonappbrewery.destini.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mActivityMainBinding;

    // TODO: Steps 4 & 8 - Declare member variables here:

    int mStroyIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mActivityMainBinding.buttonTop.setOnClickListener(this);

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mActivityMainBinding.buttonBottom.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == mActivityMainBinding.buttonTop.getId()){
            if(mActivityMainBinding.buttonTop.getText() == getString(R.string.T1_Ans1) || mActivityMainBinding.buttonTop.getText() == getString(R.string.T2_Ans1)){
                mActivityMainBinding.storyTextView.setText(R.string.T3_Story);
                mActivityMainBinding.buttonTop.setText(R.string.T3_Ans1);
                mActivityMainBinding.buttonBottom.setText(R.string.T3_Ans2);
            } else if(mActivityMainBinding.buttonTop.getText() == getString(R.string.T3_Ans1)){
                mActivityMainBinding.storyTextView.setText(R.string.T6_End);
                mActivityMainBinding.buttonBottom.setVisibility(View.GONE);
                mActivityMainBinding.buttonTop.setVisibility(View.GONE);
            }
        } else if (v.getId() == mActivityMainBinding.buttonBottom.getId()){
            if(mActivityMainBinding.buttonBottom.getText() == getString(R.string.T1_Ans2)){
                mActivityMainBinding.storyTextView.setText(R.string.T2_Story);
                mActivityMainBinding.buttonTop.setText(R.string.T2_Ans1);
                mActivityMainBinding.buttonBottom.setText(R.string.T2_Ans2);
            } else if(mActivityMainBinding.buttonBottom.getText() == getString(R.string.T2_Ans2)){
                mActivityMainBinding.storyTextView.setText(R.string.T4_End);
                mActivityMainBinding.buttonBottom.setVisibility(View.GONE);
                mActivityMainBinding.buttonTop.setVisibility(View.GONE);
            } else if(mActivityMainBinding.buttonBottom.getText() == getString(R.string.T3_Ans2)){
                mActivityMainBinding.storyTextView.setText(R.string.T5_End);
                mActivityMainBinding.buttonBottom.setVisibility(View.GONE);
                mActivityMainBinding.buttonTop.setVisibility(View.GONE);
            }
        }
    }
}
