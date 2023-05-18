package q2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.toSet;

public class Main {
    public static void main(String[] args) {
        List<Album> albums = List.of(SampleData.aLoveSupreme, SampleData.manyTrackAlbum, SampleData.sampleShortAlbum);
        Filter filter = new Filter();
        System.out.println("Long tracks: " + filter.findLongTracks(albums));
        System.out.println("Long tracks with stream: " + filter.findLongTracksWithStream(albums));
    }
}

class Filter {
    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        for(Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLength() > 60) {
                    String name = track.getName();
                    trackNames.add(name);
                }
            }
        }
        return trackNames;
    }

    public Set<String> findLongTracksWithStream(List<Album> albums) {
        return albums.stream()
                     .flatMap(Album::getTracks)
                     .filter(track -> track.getLength() > 60)
                     .map(Track::getName).collect(toSet());
    }
}
