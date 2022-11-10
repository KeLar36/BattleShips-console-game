package packages;
import java.util.*;
/**
 * In this class you'll see the realization of deploying your ships(computer ships are deploying automatically).
 */

public class Ship_deploy {
/**
 * 
 * @param BattleShips 
 * Method used for deploying your ships
 */
  public static void deployPlayerShips(Ship BattleShips) {
    Scanner input = new Scanner(System.in);

    System.out.println("\nDeploy your ships:");
    //Deploying five ships for player
    BattleShips.playerShips = 5;
    for (int i = 1; i <= BattleShips.playerShips;) {
      System.out.print("Enter X coordinate for your " + i + " ship: ");
      int x = input.nextInt();
      System.out.print("Enter Y coordinate for your " + i + " ship: ");
      int y = input.nextInt();

      if (
        (x >= 0 && x < BattleShips.numRows) &&
        (y >= 0 && y < BattleShips.numCols) &&
        (BattleShips.grid[x][y] == " ")
      ) {
        BattleShips.grid[x][y] = "@";
        i++;
      } else if (
        (x >= 0 && x < BattleShips.numRows) &&
        (y >= 0 && y < BattleShips.numCols) &&
        BattleShips.grid[x][y] == "@"
      ) System.out.println(
        "You can't place two or more ships on the same location"
      ); else if (
        (x < 0 || x >= BattleShips.numRows) ||
        (y < 0 || y >= BattleShips.numCols)
      ) System.out.println(
        "You can't place ships outside the " +
        BattleShips.numRows +
        " by " +
        BattleShips.numCols +
        " grid"
      );
    }
    BattleShips.printOceanMap();
  }

  public static void deployComputerShips(Ship BattleShips) {
    System.out.println("\nComputer is deploying ships");
    //Deploying five ships for computer
    BattleShips.computerShips = 5;
    for (int i = 1; i <= BattleShips.computerShips;) {
      int x = (int) (Math.random() * 10);
      int y = (int) (Math.random() * 10);

      if (
        (x >= 0 && x < BattleShips.numRows) &&
        (y >= 0 && y < BattleShips.numCols) &&
        (BattleShips.grid[x][y] == " ")
      ) {
        BattleShips.grid[x][y] = "'";
        System.out.println(i + ". ship DEPLOYED");
        i++;
      }
    }
    BattleShips.printOceanMap();
  }
}
