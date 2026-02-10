/**
 * Project: Lab 2 - Monsters
 * Purpose Details: Driver class to test monster objects
 * Course: IST 242
 * Author: Joseph Shiju
 * Date Developed: 02/06/2026
 * Last Date Changed: 02/09/2026
 * Rev: 1
 */
package lab2;
public class Main {

    /**
     * Program entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Monster m1 = new FireMonster("Blaze", 100, 5);
        Monster m2 = new IceMonster("Frost", 120, 6);
        Monster m3 = new EarthMonster("Terra", 150, 7);
        Monster m4 = new FireMonster("Inferno", 110, 4);
        Monster m5 = new IceMonster("Glacier", 130, 8);

        m1.setSpecialPower(SpecialPower.FIRE);
        m2.setSpecialPower(SpecialPower.ICE);
        m3.setSpecialPower(SpecialPower.EARTH);
        m4.setSpecialPower(SpecialPower.LIGHTNING);
        m5.setSpecialPower(SpecialPower.HEAL);

        Monster[] monsters = {m1, m2, m3, m4, m5};

        for (Monster m : monsters) {
            System.out.println("Name: " + m.getName());
            System.out.println("Health: " + m.getHealth());
            System.out.println("Level: " + m.getLevel());
            System.out.println("Power: " + m.getSpecialPower());
            m.specialPowers();
            System.out.println();
        }
    }
}