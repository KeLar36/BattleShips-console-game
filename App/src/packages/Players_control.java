package packages;

import java.util.*;
/**
 * This class represents basic game mechanics like playerTurn and computerTurn and this class represents main game sequence.
 * @author User
 */
public class Players_control {
/**
 * 
 * @param BattleShips
 * @param BattleShipsComputer 
 * This method describes every possible case of your event like if you shoot at the right place you;ll get a message that you dunk the ship and so on.
 */
  public static void playerTurn(Ship BattleShips, Ship BattleShipsComputer) {
    System.out.println("\nYOUR TURN");
    int x = -1, y = -1;
    do {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter X coordinate: ");
      x = input.nextInt();
      System.out.print("Enter Y coordinate: ");
      y = input.nextInt();

      if (
        (x >= 0 && x < BattleShips.numRows) &&
        (y >= 0 && y < BattleShips.numCols)
      ) { //valid guess
        if (BattleShips.grid[x][y] == "'") { //if computer ship is already there; computer loses ship
          System.out.println("Boom! You sunk the ship!");
          BattleShips.grid[x][y] = "!"; //Hit mark
          --BattleShips.computerShips;
        } else if (BattleShips.grid[x][y] == "@") {
          System.out.println("Oh no, you sunk your own ship :(");
          BattleShips.grid[x][y] = "x";
          --BattleShips.playerShips;
          ++BattleShips.computerShips;
        } else if (BattleShips.grid[x][y] == " ") {
          System.out.println("Sorry, you missed");
          BattleShips.grid[x][y] = "-";
        }
      } else if (
        (x < 0 || x >= BattleShips.numRows) ||
        (y < 0 || y >= BattleShips.numCols)
      ) System.out.println( //invalid guess
        "You can't place ships outside the " +
        BattleShips.numRows +
        " by " +
        BattleShips.numCols +
        " grid"
      );
    } while (
      (x < 0 || x >= BattleShips.numRows) || (y < 0 || y >= BattleShips.numCols)
    ); //keep re-prompting till valid guess
  }
/**
 * 
 * @param BattleShips 
 * Same as pLayerTurn but instead of manual quesses it uses Math.random.
 */
  public static void computerTurn(Ship BattleShips) {
    System.out.println("\nCOMPUTER'S TURN");
    //Guess co-ordinates
    int x = -1, y = -1;
    do {
      x = (int) (Math.random() * 10);
      y = (int) (Math.random() * 10);

      if (
        (x >= 0 && x < BattleShips.numRows) &&
        (y >= 0 && y < BattleShips.numCols)
      ) { //valid guess
        if (BattleShips.grid[x][y] == "@") { //if player ship is already there; player loses ship
          System.out.println("The Computer sunk one of your ships!");
          BattleShips.grid[x][y] = ".";
          --BattleShips.playerShips;
          ++BattleShips.computerShips;
        } else if (BattleShips.grid[x][y] == "'") {
          System.out.println("The Computer sunk one of its own ships");
          BattleShips.grid[x][y] = "!";
        } else if (BattleShips.grid[x][y] == " ") {
          System.out.println("Computer missed");
          //Saving missed guesses for computer
          if (
            BattleShips.missedGuesses[x][y] != 1
          ) BattleShips.missedGuesses[x][y] = 1;
        }
      }
    } while (
      (x < 0 || x >= BattleShips.numRows) || (y < 0 || y >= BattleShips.numCols)
    ); //keep re-prompting till valid guess
  }
}
