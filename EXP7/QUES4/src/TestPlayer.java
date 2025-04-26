// Playable.java - Interface definition
interface Playable {
    void play();   // this is automatically public and abstract
                   // use default and static methods to provide method implementations inside the interface itself
    void pause();
    void stop();
}

// MusicPlayer.java - Implements Playable interface
class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing...");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }
}

// TestPlayer.java - Main class to test the functionality
public class TestPlayer {
    public static void main(String[] args) {
        // Creating a MusicPlayer object
        MusicPlayer player = new MusicPlayer();
        
        // Testing the Playable methods
        player.play();   // Output: Music is playing...
        player.pause();  // Output: Music is paused.
        player.stop();   // Output: Music is stopped.
    }
}
