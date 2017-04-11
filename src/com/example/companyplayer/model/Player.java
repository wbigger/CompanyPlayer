package com.example.companyplayer.model;

/**
 * Created by claudio on 4/10/17.
 */
public class Player {
    private boolean isPlaying = false;
    private Track playingTrack;

    public boolean togglePlay() {
        if (isPlaying) {
            stop();
        } else {
            play(playingTrack);
        }
        return isPlaying;
    }

    public boolean stop() {
        if (!isPlaying) {
            System.out.println("Nothing to stop.");
        } else {
            System.out.println("Song successfully stopped.");
            isPlaying  = false;
        }
        return isPlaying;
    }

    public boolean play(Track track) {
        if (isPlaying) {
            System.out.println("Already playing "+playingTrack.getTitle()+". Please stop this first.");
        } else if (track != null){
            System.out.println("Start playing track "+track.getTitle());
            playingTrack = track;
            isPlaying  = true;
        } else {
            System.out.println("Cannot play the track. Maybe input track is null.");
        }
        return isPlaying;
    }

	@Override
	public String toString() {
		return "Player [isPlaying=" + isPlaying + ", playingTrack=" + playingTrack + "]";
	}
    
    
}
