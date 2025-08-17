package spring.learning.session7.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class Jukebox2 {
    public static void main(String[] args) {
        Jukebox2 jukebox2 = new Jukebox2();
        jukebox2.go();
    }

    public void go() {
        List<SongV2> songList = MockSongs.getSongV2();
        Stream<SongV2> songStream = songList.stream();
        List<String> songName = songStream
                .map(SongV2::getTitle)
                .sorted()
                .limit(1)
                .toList();
        System.out.println(songName);
    }

}
