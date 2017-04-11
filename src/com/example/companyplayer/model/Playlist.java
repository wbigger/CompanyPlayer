package com.example.companyplayer.model;

/**
 * Created by claudio on 4/10/17.
 */
public final class Playlist implements Playable {
	public String name ="Unnamed Playlist";
	
    private Track[] tracks;
        
    public Playlist(String name, Track[] tracks) {
    	this.name = name;
    	this.tracks = tracks;
    }

    public int getLength() {
		return this.tracks.length;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Playlist [name=" + name + "]";
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		// PLAYLIST specific play
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		// PLAYLIST specific stop
	}
}
