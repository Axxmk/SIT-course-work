package decorator;

import template.Playlist;
import template.Track;

import java.util.ArrayList;

public abstract class FilterDecorator extends Playlist {
 public abstract ArrayList<Track> getTracks();
}
