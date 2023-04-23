import decorator.Artist;
import decorator.Genre;
import decorator.Name;
import decorator.TopFive;
import playlist.Party;
import template.Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist party = new Party();

        System.out.println("--- PARTY PLAYLIST ORIGINAL ---");
        System.out.println(party);

        System.out.println("--- PARTY PLAYLIST W/ GENRE FILTER ---");
        party = new Genre(party, "Pop");
        System.out.println(party);

        System.out.println("--- PARTY PLAYLIST W/ TRACK NAME CONTAINS 'I' FILTER ---");
        party = new Name(party, "I");
        System.out.println(party);

        System.out.println("--- TOP FIVE IN PARTY PLAYLIST SORTING BY DURATION ---");
        party = new TopFive(party, "duration");
        System.out.println(party);

        System.out.println("--- PARTY PLAYLIST W/ ARTIST FILTER ---");
        party = new Artist(party, "Taylor");
        System.out.println(party);
    }
}