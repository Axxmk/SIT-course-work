package decorator;

import template.Playlist;
import template.Track;

import java.util.ArrayList;

public class Name extends FilterDecorator {
    Playlist playlist;
    String search;

    public Name(Playlist playlist, String search) {
        this.playlist = playlist;
        this.search = search;
    }


    public ArrayList<Track> filter() {
        ArrayList<Track> result = new ArrayList<>();
       for(Track track: playlist.getTracks()){
           if (track.name.contains(search)) {
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
