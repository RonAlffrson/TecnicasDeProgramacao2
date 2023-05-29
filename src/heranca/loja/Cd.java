package heranca.loja;

public class Cd extends Produto {
    private String artist;

    public Cd(int id, String description, double value, double weight, String artist) {
        super(id, description, value, weight);
        this.setArtist(artist);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if (!artist.isEmpty())this.artist = artist;
    }
}
