package extends1.ex1;

public class Album extends Item {
    String artist;

    public void Album(String name, int price, String artist) {
        this.artist = artist;
        this.price = price;
        this.name = name;
    }
}
