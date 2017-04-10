package com.example.companyplayer;

import com.example.companyplayer.model.Track;

public class TracksRepository {
	
	public static final Track BohemianRhapsodyTrack = new Track();
	public static final Track SomebodyToLoveTrack = new Track();    
	public static final Track LivingOnMyOwnTrack = new Track();
    public static final Track BarcelonaTrack = new Track();
    public static final Track TimeTrack = new Track();
    
	
	static {
		BohemianRhapsodyTrack.title = "Bohemian Rhapsody";
		BohemianRhapsodyTrack.artist = "Freddie Mercury";
		BohemianRhapsodyTrack.lengthSeconds = 357;
		
		SomebodyToLoveTrack.title = "Somebody to Love ";
		SomebodyToLoveTrack.artist = "Freddie Mercury";
		SomebodyToLoveTrack.lengthSeconds = 497;
	    
	    LivingOnMyOwnTrack.title = "Living on My Own";
	    LivingOnMyOwnTrack.artist = "Freddie Mercury";
	    LivingOnMyOwnTrack.lengthSeconds = 201;
	    
	    BarcelonaTrack.title = "Living on My Own";
	    BarcelonaTrack.artist = "Freddie Mercury & Montserrat Caballé";
	    BarcelonaTrack.lengthSeconds = 228;
	    
	    TimeTrack.title = "Time";
	    TimeTrack.artist = "Freddie Mercury";
	    TimeTrack.lengthSeconds = 200;
	}
	
}
