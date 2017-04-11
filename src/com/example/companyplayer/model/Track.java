package com.example.companyplayer.model;

/**
 * Created by claudio on 4/10/17.
 */
public class Track implements Comparable<Track>, Playable {
    private String title;
    private String artist;
    private int lengthSeconds;
   

    public Track(String title, String artist, int lengthSeconds) {
		super();
		this.title = title;
		this.artist = artist;
		this.lengthSeconds = lengthSeconds;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getLengthSeconds() {
		return lengthSeconds;
	}
	
	public String getLengthHMS() {
        int hour = getLengthSeconds() / 3600;
        int min = (getLengthSeconds()  % 3600) / 60;
        int sec = getLengthSeconds() % 60;
        return hour + "h "+min + "m "+sec + "s";
    }
    
//	@Override
//    public String toString() {
//    	String info = "title:"
//                + this.getTitle()
//                + "-artist:" + this.getArtist()
//                + "-length:" + this.getLengthHMS();
//        return info;
//    }
	
	

	@Override
	/** 
	 * Compare two tracks:
	 *  - first sort by artist name
	 *  - then sort by title name
	 */
	public int compareTo(Track o) {
		int artistCompare = this.getArtist().compareTo(o.getArtist());
		int titleCompare = this.getTitle().compareTo(o.getTitle());
		
		if ( artistCompare != 0) {
			return artistCompare;
		} else {
			return titleCompare;
		}
	}
	
	
	
	

	@Override
	public String toString() {
		return "Track [title=" + title + ", artist=" + artist + ", length=" + getLengthHMS() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + lengthSeconds;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Track other = (Track) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (lengthSeconds != other.lengthSeconds)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		// TRACK specific play
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
//		TRACK specific stop
	}
    
    
}
