package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural.IteratorPatternMusicApp;

import java.util.ArrayList;
import java.util.List;


public class PlaylistCollection implements Iterable<Song>{
    List<Song> songs;

    public PlaylistCollection(){
        songs = new ArrayList<>();
    }

    public void add(Song song){
        songs.add(song);
    }
    
    // remove()

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator(songs);
    }
}
