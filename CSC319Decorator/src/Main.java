import decorator.Artist;
import decorator.LongDuration;
import decorator.Name;
import playlist.Party;
import template.Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist party = new Party();

        System.out.println("--- PARTY PLAYLIST ORIGINAL ---");
        System.out.println(party);

        System.out.println("--- PARTY PLAYLIST W/ LONG DURATION (>300) ---");
        party = new LongDuration(party);
        System.out.println(party);

        System.out.println("--- PARTY PLAYLIST W/ TRACK NAME CONTAINS 'S' FILTER ---");
        party = new Name(party, "S");
        System.out.println(party);

        System.out.println("--- PARTY PLAYLIST W/ ARTIST FILTER ---");
        party = new Artist(party, "Drake");
        System.out.println(party);
    }
}