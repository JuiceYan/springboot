package java8.character.lambda.dao;

import java8.character.lambda.entity.Album;
import java8.character.lambda.entity.Artist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2017/7/9.
 */
public class DbData {
    public List<Album> getAlbums(int albumAmount,int musicianAmount){
        if(albumAmount < 2){
            albumAmount = 1;
        }
        Album album = new Album();
        album.setName("模特");
<<<<<<< HEAD
//        this.getMusicians(musicianAmount);
//        album.setMusicians();
=======
        this.getMusicians(musicianAmount);
        album.setMusicians();
>>>>>>> bfc4a774f3fcd967368b466dd5ee5dbd68b08d73
                
        return null;
    }



    public List<Artist> getArtists(int amount){
        if(amount < 2){
            amount = 1;
        }
        List<Artist> artists = new ArrayList<Artist>();
        for(int i = 0; i< amount; i++){
            Artist a = new Artist();
            a.setName("甲壳虫乐队"+i);
            a.setMembres(Arrays.asList(new String[]{"约翰"+i,"桥"+i,"列侬"+i,"卡尔"+i}));
            a.setOrigin("China"+i);
            artists.add(a);
        }
        return  artists;
    }
}
