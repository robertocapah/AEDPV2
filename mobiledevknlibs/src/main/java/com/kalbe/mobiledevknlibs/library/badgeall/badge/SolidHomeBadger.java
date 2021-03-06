package com.kalbe.mobiledevknlibs.library.badgeall.badge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import com.kalbe.mobiledevknlibs.library.badgeall.viewbadger.BadgerShortCut;
import com.kalbe.mobiledevknlibs.library.badgeall.viewbadger.ShortcutBadgeException;

import java.util.Arrays;
import java.util.List;


/**
 * @author MajeurAndroid
 */
public class SolidHomeBadger implements BadgerShortCut {

    private static final String INTENT_ACTION_UPDATE_COUNTER = "com.majeur.launcher.intent.action.UPDATE_BADGE";
    private static final String INTENT_EXTRA_PACKAGENAME = "com.majeur.launcher.intent.extra.BADGE_PACKAGE";
    private static final String INTENT_EXTRA_COUNT = "com.majeur.launcher.intent.extra.BADGE_COUNT";
    private static final String INTENT_EXTRA_CLASS = "com.majeur.launcher.intent.extra.BADGE_CLASS";

    @Override
    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        Intent intent = new Intent(INTENT_ACTION_UPDATE_COUNTER);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_COUNT, badgeCount);
        intent.putExtra(INTENT_EXTRA_CLASS, componentName.getClassName());
        context.sendBroadcast(intent);
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.majeur.launcher");
    }
}
