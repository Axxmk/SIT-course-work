package decorator;

import template.Playlist;
import template.Track;

import java.util.ArrayList;

public class Genre extends FilterDecorator{
    Playlist playlist;
    String type;

    public Genre(Playlist playlist, String type) {
        this.playlist = playlist;
        this.type = type;
    }

    public ArrayList<Track> filter() {
        ArrayList<Track> result = new ArrayList<>();
        for(Track track: playlist.getTracks()){
            if (track.genre.equalsIgnoreCase(type)) {
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
        int duration = 0;
        for (Track track: filter()) {
            duration+=track.duration;
        }
        return duration;
    }
}
