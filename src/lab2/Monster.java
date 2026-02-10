/**
 * Project: Lab 2 - Monsters
 * Purpose Details: Abstract parent class representing a monster
 * Course: IST 242
 * Author: Joseph Shiju
 * Date Developed: 02/06/2026
 * Last Date Changed: 02/09/2026
 * Rev: 1
 */
package lab2;
public abstract class Monster {

    /**
     * Monster name
     */
    private String name;

    /**
     * Monster health points
     */
    private int health;

    /**
     * Monster level
     */
    private int level;

    /**
     * Monster special power
     */
    private SpecialPower specialPower;

    /**
     * Constructs a Monster
     * @param name monster name
     * @param health monster health
     * @param level monster level
     */
    public Monster(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    /**
     * Gets monster name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets monster health
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets monster level
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets monster special power
     * @return specialPower
     */
    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    /**
     * Sets monster special power
     * @param specialPower the power to assign
     */
    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    /**
     * Performs the monster's special ability
     */
    public abstract void specialPowers();
}