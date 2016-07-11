package com.wingjay.jianshi.ui;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


import com.wingjay.jianshi.R;
import com.wingjay.jianshi.ui.misc.BackgroundColorHelper;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    protected boolean isVisible = false;

    protected String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();

        setContainerBgColorFromPrefs();
    }

    protected void setContainerBgColorFromPrefs() {
        View containerView = findViewById(android.R.id.content);
        if (containerView != null) {
            containerView.setBackgroundResource(BackgroundColorHelper.getBackgroundColorResFromPrefs(this));
        }
    }
    protected void setContainerBgColor(int colorRes) {
        View containerView = findViewById(android.R.id.content);
        if (containerView != null) {
            containerView.setBackgroundResource(colorRes);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        isVisible = true;
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        isVisible = false;
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestory");
    }

    public boolean isUISafe() {
        return isVisible;
    }

}
