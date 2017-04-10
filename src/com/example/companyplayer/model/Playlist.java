package com.example.companyplayer.model;

/**
 * Created by claudio on 4/10/17.
 */
public final class Playlist {
	public String name ="Unnamed Playlist";
	
    public Track[] tracks;
    public int length;

    public String getFullDetails() {
        String info = "";
        for (int i = 0; i < length; i++) {
            Track currentTrack = tracks[i];
            info += "Track[" + i + "]: title is "
                    + currentTrack.title
                    + ", artist is " + currentTrack.artist
                    + ", length is " + currentTrack.getLengthHMS() +"\n";
        }
        return info;
    }
}
