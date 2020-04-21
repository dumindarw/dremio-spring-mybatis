package com.duminda.dremio.builders;

import com.duminda.dremio.filters.ReminderFilter;
import org.apache.ibatis.jdbc.SQL;

public class ReminderSqlBuilder {

    public String getAllReminders(ReminderFilter filter) {
        return new SQL() {{
            SELECT("R.idReminder, R.reminderNo, R.reminderLevel, R.idForm, R.reminderCode, " +
                    "R.reminderShortDescriptionENG, R.reminderShortDescriptionFIN, R.reminderDescription");
            FROM("VM_Reminder R");
            if (filter.getLevel() > 0) {
                WHERE("R.reminderLevel = " +filter.getLevel() + "");
            }
        }}.toString();
    }
}