/**
 * COMP90041 Programming and Software Developing Assignment 1:
 * Nim is a two-player game that the first one who remove the last one stone will lose
 *
 * @author Yuan
 * Name: Yuan Hung Lin
 * StudentID: 1119147
 * Username: yuanhungl
 */

public class NimPlayer {

    // set the variable name
    public String name;

    /**
     * func to print the remove sentence and return amount of removal
     *
     * @return
     */
    public int removeStone() {
        System.out.printf("\n%s's turn - remove how many?\n", this.name);
        return Nimsys.scan.nextInt();
    }

}
