package com.duminda.dremio.model;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import java.sql.JDBCType;

public class ReminderDynamicSqlSupport {

    public static final ReminderTable reminderVM = new ReminderTable();


    public static final SqlColumn<Integer> idReminder = reminderVM.idReminder;
    public static final SqlColumn<String> reminderNo = reminderVM.reminderNo;
    public static final SqlColumn<Integer> reminderLevel = reminderVM.reminderLevel;
    public static final SqlColumn<String> idForm = reminderVM.idForm;
    public static final SqlColumn<Boolean> reminderCode = reminderVM.reminderCode;
    public static final SqlColumn<String> reminderShortDescriptionENG = reminderVM.reminderShortDescriptionENG;
    public static final SqlColumn<String> reminderShortDescriptionFIN = reminderVM.reminderShortDescriptionFIN;
    public static final SqlColumn<String> reminderDescription = reminderVM.reminderDescription;

    public static final class ReminderTable extends SqlTable {

        public final SqlColumn<Integer> idReminder = column("idReminder", JDBCType.VARCHAR);
        public final SqlColumn<String> reminderNo = column("reminderNo", JDBCType.INTEGER);
        public final SqlColumn<Integer> reminderLevel = column("reminderLevel", JDBCType.INTEGER);
        public final SqlColumn<String> idForm = column("idForm", JDBCType.VARCHAR);
        public final SqlColumn<Boolean> reminderCode = column("reminderCode", JDBCType.VARCHAR);
        public final SqlColumn<String> reminderShortDescriptionENG = column("reminderShortDescriptionENG", JDBCType.VARCHAR);
        public final SqlColumn<String> reminderShortDescriptionFIN = column("reminderShortDescriptionFIN", JDBCType.VARCHAR);
        public final SqlColumn<String> reminderDescription = column("reminderDescription", JDBCType.VARCHAR);

        public ReminderTable() {
            super("VM_Reminder");
        }
    }
}
