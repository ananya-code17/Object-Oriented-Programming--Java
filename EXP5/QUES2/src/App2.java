// Superclass
class Player {
    protected String name;
    protected int age;
    protected String position;

    public Player(){}
    // Constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Common method to display player details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Position: " + position);
    }

    // Methods to be overridden
    public void play() {
        System.out.println(name + " is playing the sport.");
    }

    public void train() {
        System.out.println(name + " is training for the sport.");
    }
}

// Cricket Player subclass
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super();  
        this.name=name;
        this.age=age;
        this.position=position;

    }

    public void play() {
        System.out.println(name + " is playing cricket as a " + position + ".");
    }

    public void train() {
        System.out.println(name + " is practicing batting and bowling.");
    }
}

// Football Player subclass
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is playing football as a " + position + ".");
    }

    public void train() {
        System.out.println(name + " is working on dribbling and shooting.");
    }
}

// Hockey Player subclass
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is playing hockey as a " + position + ".");
    }

    public void train() {
        System.out.println(name + " is improving stick handling and speed.");
    }
}

// Main class
public class App2 {
    public static void main(String[] args) {
        // Creating objects for each player type
        Cricket_Player cricketer = new Cricket_Player("Virat", 35, "Batsman");
        Football_Player footballer = new Football_Player("Messi", 36, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan", 25, "Midfielder");

        // Display details and perform actions
        cricketer.displayDetails();
        cricketer.play();
        cricketer.train();

        System.out.println();

        footballer.displayDetails();
        footballer.play();
        footballer.train();

        System.out.println();

        hockeyPlayer.displayDetails();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}