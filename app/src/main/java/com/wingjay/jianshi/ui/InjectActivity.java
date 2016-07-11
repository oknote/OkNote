package com.wingjay.jianshi.ui;

import butterknife.ButterKnife;

/**
 * @author Alimy
 */

public abstract class InjectActivity extends BaseActivity {

    @Override
    public void onContentChanged() {
        ButterKnife.bind(this);
        super.onContentChanged();
    }
}
