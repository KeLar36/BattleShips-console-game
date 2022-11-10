package packages;
/**
 * This class represents two methods. First method "Battle" and second method "gameOver". 
 * @author User
 */
public class Game_mechanic {
/**
 * This method includes sequence of events like playerTurn, computerTurn and this method regenerates map each time you make a move.
 * @param BattleShips 
 * 
 */
  public static void Battle(Ship BattleShips) {
    Players_control.playerTurn(BattleShips, BattleShips);
    Players_control.computerTurn(BattleShips);

    BattleShips.printOceanMap();

    System.out.println();
    System.out.println(
      "Your ships: " +
      BattleShips.playerShips +
      " | Computer ships: " +
      BattleShips.computerShips
    );
    System.out.println();
  }
/**
 * This method represents a dialog when you finish a game and tells you whether you win or lost.
 * @param BattleShips 
 * 
 */
  public static void gameOver(Ship BattleShips) {
    System.out.println(
      "Your ships: " +
      BattleShips.playerShips +
      " | Computer ships: " +
      BattleShips.computerShips
    );
    if (
      BattleShips.playerShips > 0 && BattleShips.computerShips <= 0
    ) System.out.println(
      "Hooray! You won the battle :)"
    ); else System.out.println("Sorry, you lost the battle");
    System.out.println();
  }

}
