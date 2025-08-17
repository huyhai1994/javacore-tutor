package spring.learning.session7.stream_api;

import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        Jukebox2 jukebox2 = new Jukebox2();
        jukebox2.go();
    }

    public void go() {
        List<SongV2> songList = MockSongs.getSongV2();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        // static <T extends Comparable<? super T>> void sort (List <T> list)
        // static void sort (List<T extends Comparable<? super T>> list);
    }

}
