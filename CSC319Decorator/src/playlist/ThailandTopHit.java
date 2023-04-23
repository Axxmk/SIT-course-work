package playlist;

import template.Playlist;
import template.Track;

import java.util.ArrayList;
import java.util.List;

public class ThailandTopHit extends Playlist {
    public ThailandTopHit() {
        tracks = new ArrayList<>(
                List.of(new Track("ไม่บอกเธอ", "Bedroom Audio", 214, "Rock"),
                        new Track("โต๊ะริม", "Nont Tanont", 299, "R&B"),
                        new Track("ผู้ถูกเลือกให้ผิดหวัง", "เรนิษรา", 250, "R&B"),
                        new Track("เลือดกรุ๊ปบี", "Chrrissa_p", 293, "R&B"),
                        new Track("พิจารณา", " Musketeers feat. Maiyarap", 293, "Pop"),
                        new Track("เธอ", " COCKTAIL", 278, "Pop"),
                        new Track("วาดไว้", "BOWKYLION", 272, "Pop"),
                        new Track("Fire Boy", "PP Krit", 165, "Pop"),
                        new Track("คู่ชีวิต", " COCKTAIL", 426, "Rock"),
                        new Track("ไม่เป็นรอง", " COCKTAIL", 303, "Rock"),
                        new Track("เจ็บที่ยังรู้สึก", "Nont Tanont", 243, "Pop"),
                        new Track("เธอมีคนเดียวบนโลก", "Nont Tanont", 235, "R&B")
                )
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
        return "Thailand Top Hit " + super.toString();
    }
}
