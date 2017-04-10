package com.example.companyplayer.test;

import com.example.companyplayer.TracksRepository;
import com.example.companyplayer.model.Playlist;
import com.example.companyplayer.model.Track;

/**
 * Created by claudio on 4/10/17.
 */
public class PlaylistTest {
	
	void test1() {
		System.out.println("Main: running test1");
		
		final Track[] tracks = {TracksRepository.BohemianRhapsodyTrack,TracksRepository.SomebodyToLoveTrack};
		
		Playlist playlist = new Playlist();
        playlist.tracks = tracks;
        playlist.length = 2;

        System.out.println("MAIN: getInfoWithFor");
        System.out.println(playlist.getFullDetails());

	}
	
    public static void main(String[] args) {
    	PlaylistTest playlistTest = new PlaylistTest();
    	playlistTest.test1();
    }

}
