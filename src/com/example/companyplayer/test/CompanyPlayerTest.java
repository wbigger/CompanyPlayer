package com.example.companyplayer.test;

import com.example.companyplayer.TracksRepository;
import com.example.companyplayer.model.Player;
import com.example.companyplayer.model.Track;

/**
 * Created by claudio on 4/10/17.
 */
public class CompanyPlayerTest {
	
	
	private void test1() {
		System.out.println("Main: running test1");
		
		Track bohemianRhapsodyTrack = TracksRepository.BohemianRhapsodyTrack;
        
        Player player = new Player();
        System.out.println("Main: play track");
        player.play(bohemianRhapsodyTrack);
        System.out.println("Main: stop track");
        player.stop();
        
        System.out.println();
	}
	
	private void test2() {
		System.out.println("Main: running test2");
		
		Track bohemianRhapsodyTrack = TracksRepository.BohemianRhapsodyTrack;
        Track somebodyToLoveTrack = TracksRepository.SomebodyToLoveTrack;
        
        Player player = new Player();
        System.out.println("Main: play track");
        player.play(bohemianRhapsodyTrack);
        System.out.println("Main: play track");
        player.play(somebodyToLoveTrack);
        System.out.println("Main: toggle track");
        player.togglePlay();
        System.out.println("Main: toggle track");
        player.togglePlay();
        System.out.println("Main: stop track");
        player.stop();
        System.out.println("Main: stop track");
        player.stop();
        
        System.out.println();
	}
	
	private void test3() {
		System.out.println("Main: running test3");
		
		Track bohemianRhapsodyTrack = TracksRepository.BohemianRhapsodyTrack;
		Player player = new Player();
		String[] commands = {"Play", "play","stop","toggle","blablabla"};
		
		for (int i = 0; i<5; i++) {
	        String commandString = commands[i];
	        System.out.println("MAIN: running command "+commandString);
	        switch (commandString.toLowerCase()) {
	            case "play":
	                player.play(bohemianRhapsodyTrack);
	                break;
	            case "stop":
	                player.stop();
	                break;
	            case "toggle":
	                player.togglePlay();
	                break;
	            default:
	                System.out.println("Main: unknown command. Try 'play'|'stop'|'toggle'");
	                break;
	        }
        }
		
		System.out.println();
	}
    public static void main(String[] args) {

    	CompanyPlayerTest companyPlayerTest = new CompanyPlayerTest();
    	companyPlayerTest.test1();
    	companyPlayerTest.test2();
    	companyPlayerTest.test3();
    }
}