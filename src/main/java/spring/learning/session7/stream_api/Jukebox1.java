package spring.learning.session7.stream_api;

import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        Jukebox1.go();
    }

    public static void go() {
        List<String> songList = MockSongs.getSongStrings();
        int size = songList.size();
        System.out.println(size);
    }
}
