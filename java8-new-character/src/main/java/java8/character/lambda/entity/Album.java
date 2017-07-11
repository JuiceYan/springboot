package java8.character.lambda.entity;

import java.util.List;
import java.util.Set;

/**
 * Created by admin on 2017/7/9.
 */
public class Album{
    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public Set<Artist> getMusicians() {
        return musicians;
    }

    public void setMusicians(Set<Artist> musicians) {
        this.musicians = musicians;
    }
}
