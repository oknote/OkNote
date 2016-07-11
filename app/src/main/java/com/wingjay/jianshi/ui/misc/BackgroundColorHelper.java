package com.wingjay.jianshi.ui.misc;

import android.content.Context;

import com.wingjay.jianshi.storage.UserPrefs;

/**
 * Provide different color customized by user.
 */
public class BackgroundColorHelper {

    public static int getBackgroundColorResFromPrefs(Context context) {
        UserPrefs userPrefs = new UserPrefs(context);
        return userPrefs.getBackgroundColor();
    }

}
