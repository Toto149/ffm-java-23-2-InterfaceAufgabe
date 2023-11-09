package org.example;

public class Main {
    public static void main(String[] args) {
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);
        musicPlayer.play();
        videoPlayer.play();
        /* musicPlayer.music(); Gibt Fehler da MusicPlayer vom Typ Playable ist und die Methode music nicht im
        * Interface Playable definiert ist.
        */
    }
}