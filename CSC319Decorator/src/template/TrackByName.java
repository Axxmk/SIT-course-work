package template;

public class TrackByName extends Track implements Comparable<Track> {
    public TrackByName(Track track) {
        super(track.name, track.artist, track.duration, track.genre);
    }

    @Override
    public int compareTo(Track t) {
        return name.compareTo(t.name);
    }
}
