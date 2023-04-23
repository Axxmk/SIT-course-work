package template;

public class Track {
    public String name;
    public String artist;
    public int duration;
    public String genre;

    public Track(String name, String artist, int duration, String genre) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String toString() {
        return name + " by " + artist + " (" + duration + " seconds)";
    }
    
}
