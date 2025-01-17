import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;

    public Music(String title, String auteur, String ISBN, double price,String artist) {
        super(title, auteur, ISBN, price);

        this.artist = artist;

    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void listen(User user){
        user.getPurchasedMediaList();
    }
    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        List<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(artist)) {
                playlist.add(music);
            }
        }
        return playlist;
}
    public String getMediaType(){
        if(getPrice()>=10){
            return "premium music";
        }

        return "music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}'+super.toString();
    }
}
