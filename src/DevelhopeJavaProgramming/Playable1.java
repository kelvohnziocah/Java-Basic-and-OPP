package DevelhopeJavaProgramming;

public interface Playable1 {
    void play();
    void pause();
    void stop();
    class Song implements Playable1{
        private String songArtist;
        private String songTitle;
        public Song (String songArtist, String songTitle){
            this.songArtist = songArtist;
            this.songTitle = songTitle;
        }
        //implement play, pause, stop method

        public void play(){
            System.out.println("play:"+ songTitle + "song by:" + songArtist);
        }
        public void pause(){
            System.out.println("pause:"+ songTitle + "song by:" + songArtist);
        }
        public void stop(){
            System.out.println("play:"+ songTitle + "song by:" + songArtist);
        }

    }
}
