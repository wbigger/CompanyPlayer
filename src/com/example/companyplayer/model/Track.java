package com.example.companyplayer.model;

/**
 * Created by claudio on 4/10/17.
 */
public class Track {
    public String title;
    public String artist;
    public int lengthSeconds;

    public String getLengthHMS() {
        int hour = lengthSeconds / 3600;
        int min = (lengthSeconds  % 3600) / 60;
        int sec = lengthSeconds % 60;
        return hour + "h "+min + "m "+sec + "s";
    }
}
