package spring.learning.session7.stream_api;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

class Jukebox2Test {
    @Test
    void testFunctionInterface() {
        Function<SongV2, String>  getArtists = SongV2::getArtist;
        System.out.println(getArtists);
    }
}