package com.duminda.dremio.controller;

import com.duminda.dremio.model.Reminder;
import com.duminda.dremio.providers.ReminderProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    private static Logger LOGGER = LoggerFactory.getLogger(ReminderController.class);

    @Autowired
    ReminderProvider reminderProvider;

    @RequestMapping(value = "/{level}", method = RequestMethod.GET)
    public List<Reminder> getRemindersByLevel(@PathVariable int level) {
        return reminderProvider.getReminderLevels(level);
    }

    @RequestMapping(value = "/test/", method = RequestMethod.GET)
    public Reminder getReminder() {
        LOGGER.info("Calling /test method");
        return new Reminder("001", 543, 1, "101", "CRT",
                "Critical Bug", "Critical Bug", "Bug");
    }

}
