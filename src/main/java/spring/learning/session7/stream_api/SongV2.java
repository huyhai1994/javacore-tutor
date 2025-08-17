package spring.learning.session7.stream_api;

public class SongV2 implements Comparable<SongV2> {
    private String tittle;
    private String artist;
    private int bpm;


    public SongV2(String tittle, String artist, int bpm) {
        this.tittle = tittle;
        this.artist = artist;
        this.bpm = bpm;
    }

    @Override
    public int compareTo(SongV2 song) {
        return tittle.compareTo(song.getTitle());
    }

    public String getTitle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return "Song{" + "tittle='" + tittle + '\'' + ", artist='" + artist + '\'' + ", bpm=" + bpm + '}';
    }


}
