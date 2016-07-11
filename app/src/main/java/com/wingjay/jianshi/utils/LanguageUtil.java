package com.wingjay.jianshi.utils;

import android.content.Context;
import android.content.res.Resources;

import com.wingjay.jianshi.R;

/**
 * Created by wingjay on 10/1/15.
 */
public class LanguageUtil {

    public static String getDiaryDateEnder(Context context, long dateSeconds) {
        FullDateUtil fullDateUtil = new FullDateUtil(dateSeconds);
        Resources resources = context.getResources();
        return resources.getString(R.string.space_of_date_record)
                + fullDateUtil.getFullDate()
                + resources.getString(R.string.record)
                + resources.getString(R.string.space_of_date_record);
    }

}
