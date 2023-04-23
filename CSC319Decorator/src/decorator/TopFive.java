package decorator;

import template.Playlist;
import template.Track;
import template.TrackByDuration;
import template.TrackByName;

import java.util.ArrayList;

public class TopFive extends FilterDecorator {
    Playlist playlist;
    String compareBy;

    public TopFive(Playlist playlist, String compareBy) {
        this.playlist = playlist;
        this.compareBy = compareBy;
    }

    @Override
    public ArrayList<Track> getTracks() {
        if (compareBy.equals("name")) {
            ArrayList<TrackByName> result = new ArrayList<>();
            for (Track track : playlist.getTracks()) {
                result.add(new TrackByName(track));
            }
            result.sort(TrackByName::compareTo);

            if (result.size() < 5)
                return new ArrayList<>(result);
            else return new ArrayList<>(result.subList(0, 5));

        }
        else if (compareBy.equals("duration")) {
            ArrayList<TrackByDuration> result = new ArrayList<>();
            for (Track track : playlist.getTracks()) {
                result.add(new TrackByDuration(track));
            }
            result.sort(TrackByDuration::compareTo);

            if (result.size() < 5)
                return new ArrayList<>(result);
            else return new ArrayList<>(result.subList(0, 5));
        }
        else return null;
    }

    @Override
    public double duration() {
        int duration = 0;
        for (Track track: getTracks()){
            duration+=track.duration;
        }
        return duration;
    }
}
