package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.On();

        player.VolumeUp();
        player.VolumeUp();

        player.VolumeDown();

        player.PlayerStatus();

        player.Off();
    }
}
