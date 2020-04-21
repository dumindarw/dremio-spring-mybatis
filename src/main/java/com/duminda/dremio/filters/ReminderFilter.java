package com.duminda.dremio.filters;

public class ReminderFilter {

    private int level;

    public ReminderFilter(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
