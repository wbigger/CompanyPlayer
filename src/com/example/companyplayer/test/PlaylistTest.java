package com.example.companyplayer.test;

import java.util.Arrays;

import com.example.companyplayer.TracksRepository;
import com.example.companyplayer.model.Player;
import com.example.companyplayer.model.Playlist;
import com.example.companyplayer.model.Track;

/**
 * Created by claudio on 4/10/17.
 */
public class PlaylistTest {
	
	void test1() {
		System.out.println("Main: running test1");
		
		final Track[] tracks = {TracksRepository.BohemianRhapsodyTrack,TracksRepository.SomebodyToLoveTrack};
		
		Playlist playlist = new Playlist("My favourite playlist",tracks);
        System.out.println("MAIN: getInfoWithFor");
        System.out.println(playlist);

	}
	
	public void test2() {
		System.out.println("Main: running test2");
		final Track[] tracks = {
				TracksRepository.BohemianRhapsodyTrack,
				TracksRepository.SomebodyToLoveTrack};
		
		Arrays.sort(tracks);
	
		System.out.println(Arrays.toString(tracks));
		
		System.out.println();
	}
	
	public void test3() {
		System.out.println("Main: running test3");
		final Track[] tracks = {
				TracksRepository.SomebodyToLoveTrack,
				TracksRepository.BohemianRhapsodyTrack};
		
		Arrays.sort(tracks);
		for (int i=0;i<tracks.length;i++) {
			System.out.println(tracks[i]);
		}
		System.out.println();
	}
	
	public void test4() {
		System.out.println("Main: running test4");
		final Track[] tracks = {
				TracksRepository.SomebodyToLoveTrack,
				TracksRepository.BohemianRhapsodyTrack,
				TracksRepository.BohemianRhapsodyTrack
				};
		
		Arrays.sort(tracks);
		for (int i=0;i<tracks.length;i++) {
			System.out.println(tracks[i]);
		}
		System.out.println();
	}
	
	public void test5() {
		System.out.println("Main: running test5");
		final Track[] tracks = {
				TracksRepository.SomebodyToLoveTrack,
				TracksRepository.BarcelonaTrack,
				TracksRepository.BohemianRhapsodyTrack
				};
		
		Arrays.sort(tracks);
		for (int i=0;i<tracks.length;i++) {
			System.out.println(tracks[i]);
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
    	PlaylistTest playlistTest = new PlaylistTest();
    	playlistTest.test1();
    	playlistTest.test2();
    	playlistTest.test3();
    	playlistTest.test4();
    	playlistTest.test5();
    }

}
