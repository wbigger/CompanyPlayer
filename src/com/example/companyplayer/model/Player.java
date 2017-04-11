package com.example.companyplayer.model;

/**
 * Created by claudio on 4/10/17.
 */
public class Player {
    private boolean isPlaying = false;
    private Playable playingMedia;

    public boolean togglePlay() {
        if (isPlaying) {
            stop();
        } else {
            play(playingMedia);
        }
        return isPlaying;
    }

    public boolean stop() {
        if (!isPlaying) {
            System.out.println("Nothing to stop.");
        } else {
            playingMedia.stop();
            System.out.println("Song successfully stopped.");
            isPlaying  = false;
        }
        return isPlaying;
    }

    public boolean play(Playable playable) {
        if (isPlaying) {
            System.out.println("Already playing "+playingMedia+". Please stop this first.");
        } else if (playable != null){
        	playingMedia = playable;
        	playingMedia.play();
            System.out.println("Start playing "+playingMedia);
            isPlaying  = true;
        } else {
            System.out.println("Cannot play this media. Maybe input media is null.");
        }
        return isPlaying;
    }

	@Override
	public String toString() {
		// The following is to test instanceof
		if (this.playingMedia instanceof Track) {
			((Track)playingMedia).getTitle();
			Track track = (Track)playingMedia;
			return "Player [isPlaying:" + isPlaying + ", playing track:" + track.getTitle() + "]";
		} else if (this.playingMedia instanceof Playlist) {
			return "Player [isPlaying:" + isPlaying + ", playing playlist:" + ((Playlist)playingMedia).getName() + "]";
		} else {
			return "Player [isPlaying:" + isPlaying + ", playing media:" + playingMedia + "]";
		}
	}
    
    
}
