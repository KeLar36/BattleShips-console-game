package packages;
/**
 * This class  creates Ocean map
 * @author User
 */
public class Area_creation {
/**
  * This method is divided for making top,middle and bottom section of the map
 * @param BattleShips 
 */
  public static void createOceanMap(Ship BattleShips) {
    //First section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < BattleShips.numCols; i++) System.out.print(i);
    System.out.println();

    //Middle section of Ocean Map
    for (int i = 0; i < BattleShips.grid.length; i++) {
      for (int j = 0; j < BattleShips.grid[i].length; j++) {
        BattleShips.grid[i][j] = " ";
        if (j == 0) System.out.print(
          i + "|" + BattleShips.grid[i][j]
        ); else if (j == BattleShips.grid[i].length - 1) System.out.print(
          BattleShips.grid[i][j] + "|" + i
        ); else System.out.print(BattleShips.grid[i][j]);
      }
      System.out.println();
    }

    //Last section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < BattleShips.numCols; i++) System.out.print(i);
    System.out.println();
  }
}
