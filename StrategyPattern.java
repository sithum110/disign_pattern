// Strategy interface
interface WeaponStrategy {
    void useWeapon();
}

// Concrete Strategy for Sword
class SwordStrategy implements WeaponStrategy {
    public void useWeapon() {
        System.out.println("Swinging a sword!");
    }
}

// Concrete Strategy for Bow and Arrow
class BowAndArrowStrategy implements WeaponStrategy {
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow!");
    }
}

// Concrete Strategy for Knife
class KnifeStrategy implements WeaponStrategy {
    public void useWeapon() {
        System.out.println("Stabbing with a knife!");
    }
}

// Context class
class Character {
    private WeaponStrategy weaponStrategy;

    public void setWeaponStrategy(WeaponStrategy weaponStrategy) {
        this.weaponStrategy = weaponStrategy;
    }

    public void fight() {
        weaponStrategy.useWeapon();
    }
}

// Main class to test the Strategy Pattern
public class StrategyPattern {
    public static void main(String[] args) {
        Character character = new Character();

        // Use Sword
        character.setWeaponStrategy(new SwordStrategy());
        character.fight(); // Output: Swinging a sword!

        // Use Bow and Arrow
        character.setWeaponStrategy(new BowAndArrowStrategy());
        character.fight(); // Output: Shooting an arrow with a bow!

        // Use Knife
        character.setWeaponStrategy(new KnifeStrategy());
        character.fight(); // Output: Stabbing with a knife!
    }
}
