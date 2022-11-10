import packages.*;

public class App {
/**
 * Main void that launches the game
 * @param args 
 */
  public static void main(String[] args) {
    System.out.println("**** Welcome to Battle Ships game ****");
    System.out.println("Right now, sea is empty\n");

    var BattleShips = new Ship();

    //Step 1 – Create the ocean map
    Area_creation.createOceanMap(BattleShips);

    //Step 2 – Deploy player’s ships
    Ship_deploy.deployPlayerShips(BattleShips);

    //Step 3 - Deploy computer's ships
    Ship_deploy.deployComputerShips(BattleShips);

    //Step 4 Battle
    do {
      Game_mechanic.Battle(BattleShips);
    } while (BattleShips.playerShips != 0 && BattleShips.computerShips != 0);

    //Step 5 - Game over
    Game_mechanic.gameOver(BattleShips);
  }
}
