package java8.character.lambda.entity;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Set;
>>>>>>> bfc4a774f3fcd967368b466dd5ee5dbd68b08d73

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

<<<<<<< HEAD
    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Artist> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Artist> musicians) {
=======
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
>>>>>>> bfc4a774f3fcd967368b466dd5ee5dbd68b08d73
        this.musicians = musicians;
    }
}
