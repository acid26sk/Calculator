package com.example.calculator.storage;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.calculator.domain.AppTheme;

public class ThemeStorage {

    private static final String BTN_THEME = "BTN_THEME";

    private Context context;

    private SharedPreferences sharedPreferences;

    public ThemeStorage(Context context) {
        this.context = context;

        sharedPreferences = context.getSharedPreferences("theme_storage", MODE_PRIVATE);
    }

    public AppTheme getAppTheme() {
        String value = sharedPreferences.getString(BTN_THEME, AppTheme.DAY.getKey());
        for (AppTheme theme : AppTheme.values()) {
            if (theme.getKey().equals(value)) {
                return theme;
            }
        }

        return AppTheme.DAY;

    }

    public void setAppTheme(AppTheme appTheme) {
        sharedPreferences.edit()
                .putString(BTN_THEME, appTheme.getKey())
                .apply();
    }
}
