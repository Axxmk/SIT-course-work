package decorator;

import template.Playlist;
import template.Track;

import java.util.ArrayList;

public class LongDuration extends FilterDecorator {
    Playlist playlist;

    public LongDuration(Playlist playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Track> filter() {
        ArrayList<Track> result = new ArrayList<>();
        for(Track track: playlist.getTracks()){
            if (track.duration > 300){
                result.add(track);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Track> getTracks() {
        return filter();
    }

    @Override
    public double duration() {
        int duration =0;
        for (Track track: filter()){
            duration+=track.duration;
        }
        return duration;
    }
}
