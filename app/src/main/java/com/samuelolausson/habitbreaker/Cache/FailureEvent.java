package com.samuelolausson.habitbreaker.Cache;

import android.location.Location;

import java.util.Date;

public class FailureEvent extends Event {
    public FailureEvent(int day, String month, int year, EmotionalState[] emotionalState, String reasoning, String time, String amPm, double latitude,double longitude) {
        super(day, month, year, emotionalState, reasoning, time, amPm, latitude, longitude);
    }
}
