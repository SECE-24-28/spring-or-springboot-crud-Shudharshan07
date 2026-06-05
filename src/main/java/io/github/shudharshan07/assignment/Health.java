package io.github.shudharshan07.assignment;


import java.time.LocalTime;


public class Health {
    LocalTime start_time;
    boolean isRunning;

    public Health(LocalTime start_time, boolean isRunning) {
        this.start_time = start_time;
        this.isRunning = isRunning;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }
}
