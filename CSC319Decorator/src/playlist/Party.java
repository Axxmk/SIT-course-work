package playlist;

import template.Playlist;
import template.Track;

import java.util.ArrayList;
import java.util.List;

public  class Party extends Playlist {
    public Party() {
        tracks = new ArrayList<>(
                List.of(new Track("Adrenaline", "Zeds Dead", 227, "electronic"),
                        new Track("I Gotta Feeling", "The Black Eyed Peas", 289, "Pop"),
                        new Track("24K Magic", "Bruno Mars", 225, "Funk"),
                        new Track("Bonfire", "Knife Party", 261, "electronic"),
                        new Track("Endlessly", "The Chemical Brothers", 417, "electronic"),
                        new Track("Can't Stop the Feeling!", "Justin Timberlake", 236, "Pop"),
                        new Track("Yeah!", "Usher ft. Lil Jon, Ludacris", 250, "Hip-hop"),
                        new Track("Get Lucky", "Daft Punk ft. Pharrell Williams", 369, "Disco"),
                        new Track("Don't Stop the Music", "Rihanna", 239, "Pop"),
                        new Track("Party in the U.S.A.", "Miley Cyrus", 205, "Pop"),
                        new Track("Window Seat", "Thom Yorke", 286, "electronic"),
                        new Track("Hotline Bling", "Drake", 267, "R&B"),
                        new Track("I Will Survive", "Gloria Gaynor", 198, "Disco"),
                        new Track("Rockafeller Skank", "Fatboy Slim", 344, "electronic"),
                        new Track("Ghosts 'n' Stuff", "Deadmau5", 318,"electronic"),
                        new Track("September", "Earth, Wind & Fire", 215, "Funk"),
                        new Track("This Is What You Came For", "Calvin Harris ft. Rihanna", 222, "EDM"),
                        new Track("Shake It Off", "Taylor Swift", 219, "Pop"),
                        new Track("I Knew You Were In Trouble", "Taylor Swift", 256, "Pop"),
                        new Track("Shut it down", "Drake", 419, "R&B"),
                        new Track("Fire & Desire", "Drake", 239, "R&B"))
        );
    }

    public double duration() {
        int total = 0;
        for(Track track: tracks){
            total += track.duration;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Party " + super.toString();
    }
}
