package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural.IteratorPatternMusicApp;

import java.util.List;

public class SongIterator implements Iterator<Song> {
    private List<Song> songs;
    int index = 0;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        if(hasNext()) {
            return songs.get(index++);
        }
        throw new java.util.NoSuchElementException();
    }

}
