package io.jenkins.plugins.view.calendar.event;

import hudson.model.Job;
import io.jenkins.plugins.view.calendar.time.Moment;
import io.jenkins.plugins.view.calendar.time.MomentRange;

public interface CalendarEvent {
    String getId();

    Job getJob();

    Moment getStart();

    Moment getEnd();

    String getUrl();

    String getTitle();

    long getDuration();

    String getTimestampString();

    String getDurationString();

    String getIconClassName();

    boolean isInRange(MomentRange range);

    CalendarEventState getState();
}
