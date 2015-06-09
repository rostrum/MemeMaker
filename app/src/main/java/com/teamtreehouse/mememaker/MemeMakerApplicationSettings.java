package com.teamtreehouse.mememaker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.teamtreehouse.mememaker.utils.StorageType;

/**
 * Created by Evan Anger on 8/13/14.
 */
public class MemeMakerApplicationSettings {
    SharedPreferences mSharePreferences;

    public MemeMakerApplicationSettings(Context context) {
            mSharePreferences = PreferenceManager.getDefaultSharedPreferences(context);

    }

    public String getStoragePreference() {
        return mSharePreferences.getString("Sorage", StorageType.INTERNAL);
    }

    public void setSharePreferences(String storageType) {
       mSharePreferences
               .edit()
               .putString("Storage", storageType)
               .commit();
    }
}
