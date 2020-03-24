
public class NimPlayer {
    public String name;

    public int removeStone() {
        System.out.printf("\n%s's turn - remove how many?\n", this.name);
        return Nimsys.scan.nextInt();
    }

}
