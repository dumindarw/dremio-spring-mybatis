package com.duminda.dremio.controller;

import com.duminda.dremio.model.Reminder;
import com.duminda.dremio.providers.ReminderProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    ReminderProvider reminderProvider;

    @RequestMapping(value = "/{level}", method = RequestMethod.GET)
    public List<Reminder> getMovie(@PathVariable int level) {
        return reminderProvider.getReminderLevels(level);
    }
}
