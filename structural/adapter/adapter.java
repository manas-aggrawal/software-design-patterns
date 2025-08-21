interface IMediaPlayer{
    public void play(String filename);
}
class VlcMediaPlayer{
    public void playVlc(String filename){
        System.out.println(filename+" Plays VLC media!");
    }
}
class Mp3MediaPlayer{
    public void playMp3(String filename){
        System.out.println(filename+" Plays Mp3 media!");
    }
}
class Mp4MediaPlayer{
    public void playMp4(String filename){
        System.out.println(filename+" Plays Mp4 media!");
    }
}
class MediaAdapter implements IMediaPlayer{
    private Mp3MediaPlayer mp3Player;
    private Mp4MediaPlayer mp4Player;
    private VlcMediaPlayer vlcPlayer;
    
    public MediaAdapter() {
        mp3Player = new Mp3MediaPlayer();
        mp4Player = new Mp4MediaPlayer();
        vlcPlayer = new VlcMediaPlayer();
    }
    
    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3")) {
            mp3Player.playMp3(filename);
        } else if (filename.endsWith(".mp4")) {
            mp4Player.playMp4(filename);
        } else if (filename.endsWith(".vlc")) {
            vlcPlayer.playVlc(filename);
        } else {
            System.out.println("Invalid media format: " + filename);
        }
    }
}

class Main {
    public static void main(String[] args) {
        IMediaPlayer mp = new MediaAdapter();
        mp.play("media1.mp3");
        mp.play("media2.mp4");
    }
}