/**
 * Project: Lab 2 - Monsters
 * Purpose Details: Concrete fire type monster class
 * Course: IST 242
 * Author: Joseph Shiju
 * Date Developed: 02/06/2026
 * Last Date Changed: 02/09/2026
 * Rev: 1
 */
package lab2;
public class FireMonster extends Monster {
    /**
     * Temperature of the monster's flames
     */
    private int flameTemperature;
    /**
     * Creates a FireMonster
     * @param name monster name
     * @param health monster health
     * @param level monster level
     * @param flameTemperature fire heat level
     */
    public FireMonster(String name, int health, int level, int flameTemperature) {
        super(name, health, level);
        this.flameTemperature = flameTemperature;
    }
    /**
     * Gets flame temperature
     * @return flameTemperature
     */
    public int getFlameTemperature() {
        return flameTemperature;
    }
    /**
     * Sets flame temperature
     * @param flameTemperature new temperature
     */
    public void setFlameTemperature(int flameTemperature) {
        this.flameTemperature = flameTemperature;
    }
    /**
     * Executes fire monster special attack
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " shoots a massive fire blast at " + flameTemperature + " degrees!");
    }
}


