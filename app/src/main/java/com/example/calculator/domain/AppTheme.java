package com.example.calculator.domain;

import com.example.calculator.R;

public enum AppTheme {

    DAY(R.style.ThemesDay, "day"),
    NIGHT(R.style.ThemesNight, "night"),
    MINT(R.style.ThemesMint, "mint");

    private final int theme;
    private final String key;

    AppTheme(int value, String key) {
        this.theme = value;
        this.key = key;
    }

    public int getTheme() {
        return theme;
    }

    public String getKey() {
        return key;
    }
}
