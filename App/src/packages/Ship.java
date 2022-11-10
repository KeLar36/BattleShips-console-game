package packages;
/**
 * In this class I created a app that regenerates each time you made a move and i made ships display on this map.
 * @author User
 */
public class Ship {

  public static int numRows = 10;
  public static int numCols = 10;
  public int playerShips;
  public int computerShips;
  public static String[][] grid = new String[numRows][numCols];
  public int[][] missedGuesses = new int[numRows][numCols];
/**
 * This method prints an updated ocean map each turn.
 */
  public void printOceanMap() {
    System.out.println();
    // First section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < numCols; i++)
      System.out.print(i);
    System.out.println();

    // Middle section of Ocean Map
    for (int x = 0; x < grid.length; x++) {
      System.out.print(x + "|");

      for (int y = 0; y < grid[x].length; y++) {

        if (grid[x][y].equals("'")) {
          System.out.print(" ");
        } else {
          System.out.print(grid[x][y]);
        }

      }

      System.out.println("|" + x);
    }

    // Last section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < numCols; i++)
      System.out.print(i);
    System.out.println();
  }
}
