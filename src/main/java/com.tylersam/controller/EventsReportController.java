package com.tylersam.controller;

import com.tylersam.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tyler on 1/12/2015.
 */

@RestController
public class EventsReportController {

    @RequestMapping(value = "/events")
    public List<Event> getEvents(){

        List<Event> events = new ArrayList<>();

        Event event1 = new Event();
        event1.setName("Java user group");

        events.add(event1);

        Event event2 = new Event();
        event2.setName("Angular user group");

        events.add(event2);

        return events;
    }
}
