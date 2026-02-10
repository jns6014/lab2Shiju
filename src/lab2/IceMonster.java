/**
 * Project: Lab 2 - Monsters
 * Purpose Details: Concrete ice type monster class
 * Course: IST 242
 * Author: Joseph Shiju
 * Date Developed: 02/06/2026
 * Last Date Changed: 02/09/2026
 * Rev: 1
 */
package lab2;
public class IceMonster extends Monster {
    public IceMonster(String name, int health, int level) {
        super(name, health, level);
    }

    /**
     * Executes ice monster special attack
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " freezes the enemy solid!");
    }
}