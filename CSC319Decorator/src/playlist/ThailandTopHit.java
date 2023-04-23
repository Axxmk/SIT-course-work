package playlist;

import template.Playlist;
import template.Track;

import java.util.ArrayList;
import java.util.List;

public class ThailandTopHit extends Playlist {
    public ThailandTopHit() {
        tracks = new ArrayList<>(
                List.of(new Track("ไม่บอกเธอ", "Bedroom Audio", 214, "Rock"),
                        new Track("กลับไปด้วยกัน", "The Toys", 231, "Pop"),
                        new Track("ใจสั่งมา", "ไบร์ท วชิรวิชญ์", 249, "Pop"),
                        new Track("แสงสุดท้าย", "P-Hot, Punch", 249, "Rap/Hip-Hop"),
                        new Track("เลือกได้เถอะ", "Mild", 227, "Pop"),
                        new Track("ไปไม่ถึง", "Pop Pongkool", 215, "Pop"),
                        new Track("คิดฮอด", "Youngohm", 263, "Rap/Hip-Hop"))
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
