package untitled;

public class Mp3Adapter implements MediaPlayer {
    private OldMp3Player oldPlayer;

    public Mp3Adapter() {
        oldPlayer = new OldMp3Player();
    }

    @Override
    public void play(String fileName) {
        oldPlayer.playMp3(fileName);
    }
}
