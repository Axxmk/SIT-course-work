package template;

public class TrackByDuration extends Track implements Comparable<Track> {
    public TrackByDuration(Track track) {
        super(track.name, track.artist, track.duration, track.genre);
    }

    @Override
    public int compareTo(Track t) {
        if (duration == t.duration)
            return 0;
        else if (duration < t.duration)
            return 1;
        else return -1;
    }
}
