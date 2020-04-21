package com.duminda.dremio.model;

public class Reminder {

    String idReminder;
    int reminderNo;
    int reminderLevel;
    String idForm;
    String reminderCode;
    String reminderShortDescriptionENG;
    String reminderShortDescriptionFIN;
    String reminderDescription;

    public Reminder(){

    }

    public Reminder(String idReminder, int reminderNo, int reminderLevel, String idForm, String reminderCode,
                    String reminderShortDescriptionENG, String reminderShortDescriptionFIN, String reminderDescription) {
        this.idReminder = idReminder;
        this.reminderNo = reminderNo;
        this.reminderLevel = reminderLevel;
        this.idForm = idForm;
        this.reminderCode = reminderCode;
        this.reminderShortDescriptionENG = reminderShortDescriptionENG;
        this.reminderShortDescriptionFIN = reminderShortDescriptionFIN;
        this.reminderDescription = reminderDescription;
    }

    public String getIdReminder() {
        return idReminder;
    }

    public void setIdReminder(String idReminder) {
        this.idReminder = idReminder;
    }

    public int getReminderNo() {
        return reminderNo;
    }

    public void setReminderNo(int reminderNo) {
        this.reminderNo = reminderNo;
    }

    public int getReminderLevel() {
        return reminderLevel;
    }

    public void setReminderLevel(int reminderLevel) {
        this.reminderLevel = reminderLevel;
    }

    public String getIdForm() {
        return idForm;
    }

    public void setIdForm(String idForm) {
        this.idForm = idForm;
    }

    public String getReminderCode() {
        return reminderCode;
    }

    public void setReminderCode(String reminderCode) {
        this.reminderCode = reminderCode;
    }

    public String getReminderShortDescriptionENG() {
        return reminderShortDescriptionENG;
    }

    public void setReminderShortDescriptionENG(String reminderShortDescriptionENG) {
        this.reminderShortDescriptionENG = reminderShortDescriptionENG;
    }

    public String getReminderShortDescriptionFIN() {
        return reminderShortDescriptionFIN;
    }

    public void setReminderShortDescriptionFIN(String reminderShortDescriptionFIN) {
        this.reminderShortDescriptionFIN = reminderShortDescriptionFIN;
    }

    public String getReminderDescription() {
        return reminderDescription;
    }

    public void setReminderDescription(String reminderDescription) {
        this.reminderDescription = reminderDescription;
    }
}
