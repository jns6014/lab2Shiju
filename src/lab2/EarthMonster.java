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
    /**
     * Strength of rock armor defense
     */
    private int rockArmor;
    /**
     * Creates an EarthMonster
     * @param name monster name
     * @param health monster health
     * @param level monster level
     * @param rockArmor armor strength
     */
    public EarthMonster(String name, int health, int level, int rockArmor) {
        super(name, health, level);
        this.rockArmor = rockArmor;
    }
    /**
     * Gets armor strength
     * @return rockArmor
     */
    public int getRockArmor() {
        return rockArmor;
    }
    /**
     * Sets armor strength
     * @param rockArmor new armor value
     */
    public void setRockArmor(int rockArmor) {
        this.rockArmor = rockArmor;
    }
    /**
     * Executes earth monster special attack
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " summons earth armor with strength " + rockArmor + "!");
    }
}