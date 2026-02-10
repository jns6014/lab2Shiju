/**
 * Project: Lab 2 - Monsters
 * Purpose Details: Concrete earth type monster class
 * Course: IST 242
 * Author: Joseph Shiju
 * Date Developed: 02/06/2026
 * Last Date Changed: 02/09/2026
 * Rev: 1
 */
package lab2;
public class EarthMonster extends Monster {
    public EarthMonster(String name, int health, int level) {
        super(name, health, level);
    }

    /**
     * Executes earth monster special attack
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " causes a powerful earthquake!");
    }
}