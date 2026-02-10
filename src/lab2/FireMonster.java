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

    public FireMonster(String name, int health, int level) {
        super(name, health, level);
    }

    /**
     * Executes fire monster special attack
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " shoots a massive fire blast!");
    }
}