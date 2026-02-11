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
    /**
     * Strength of freezing ability
     */
    private int freezeLevel;
    /**
     * Creates an IceMonster
     * @param name monster name
     * @param health monster health
     * @param level monster level
     * @param freezeLevel freezing strength
     */
    public IceMonster(String name, int health, int level, int freezeLevel) {
        super(name, health, level);
        this.freezeLevel = freezeLevel;
    }
    /**
     * Gets freeze level
     * @return freezeLevel
     */
    public int getFreezeLevel() {
        return freezeLevel;
    }
    /**
     * Sets freeze level
     * @param freezeLevel new freeze strength
     */
    public void setFreezeLevel(int freezeLevel) {
        this.freezeLevel = freezeLevel;
    }
    /**
     * Executes ice monster special attack
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " freezes enemies with level " + freezeLevel + " ice!");
    }
}