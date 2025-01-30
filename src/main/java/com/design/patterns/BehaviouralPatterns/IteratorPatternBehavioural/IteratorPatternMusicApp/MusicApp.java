package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural.IteratorPatternMusicApp;

public class MusicApp {
    public static void main(String[] args) {
        PlaylistCollection playList = new PlaylistCollection();
        playList.add(new Song("Jeene Laga Hoon", "Atif Aslam"));
        playList.add(new Song("Tum Hi Ho", "Arijit Singh"));

        Iterator<Song> iterator = playList.iterator();
        while(iterator.hasNext()){
              Song song = iterator.next();
                System.out.println("title: " + song.getTitle() + ", Artist: " + song.getArtist());
        }


    }
}
