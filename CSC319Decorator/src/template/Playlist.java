package template;

import java.util.ArrayList;

public abstract class Playlist {
    protected ArrayList<Track> tracks = new ArrayList<>();

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public abstract double duration();

    @Override
    public String toString() {
        return "playlist tracks:\n" + getTracks() +
                "\nTotal duration: " + duration() + " seconds";
    }
}
