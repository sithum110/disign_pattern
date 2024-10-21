
// Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

// Target interface
interface Bird {
    void fly();
    void makeSound();
}

// Adaptee class
class Sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow flying...");
    }
    
    public void makeSound() {
        System.out.println("Chirp chirp");
    }
}

// Target interface
interface ToyDuck {
    void squeak();
}

// Adapter class
class BirdAdapter implements ToyDuck {
    Bird bird_1;
    
    public BirdAdapter(Bird bird_1) {
        this.bird_1 = bird_1;
    }
    
    public void squeak() {
        // Translate the Bird's makeSound to ToyDuck's squeak
        bird_1.makeSound();
    }
}

// Main class to test the Adapter
public class adapter {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new BirdAdapter(sparrow);
        
        // The toy duck now makes a sound like a sparrow
        toyDuck.squeak();
    }
}

