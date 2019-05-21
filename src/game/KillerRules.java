package game;

import visibleObjects.*;

/**
 * @author Alvaro & Christian
 */
public class KillerRules {

    // ***************************************************************************************************** //
    // *************************** [          Statistics Ships           ] ********************************* //
    // ***************************************************************************************************** //

    public static final int OCTANE_HEALTH = 100;
    public static final int OCTANE_DAMAGE = 20;
    public static final int BATMOBILE_HEALTH = 75;
    public static final int BATMOBILE_DAMAGE = 30;
    public static final int MARAUDER_HEALTH = 150;
    public static final int MARAUDER_DAMAGE = 10;
    public static final int SHOOT_COOLDOWN = 25; // Numero de loops de movimiento de la nave

    // ***************************************************************************************************** //
    // *************************** [          Collision Detector         ] ********************************* //
    // ***************************************************************************************************** //

    /**
     * @author Alvaro
     * @param game
     * @param alive
     * @param object
     */
    public static void collision(KillerGame game, Alive alive, VisibleObject object) {

        if (alive instanceof KillerShip) {
            KillerRules.collisionShip(game, (KillerShip) (alive), object);
        }

        if (alive instanceof Shoot) {
            KillerRules.collisionShoot(game, (Shoot) (alive), object);
        }

    }

    // ***************************************************************************************************** //
    // *************************** [            Collision Ship           ] ********************************* //
    // ***************************************************************************************************** //

    /**
     * @author Alvaro
     * @param ship
     * @param object
     */
    private static void collisionShip(KillerGame game, KillerShip ship, VisibleObject object) {

        // Collision with Asteroid
        if (object instanceof Asteroid) {

        }

        // Collision with BlackHole
        if (object instanceof BlackHole) {

        }

        // Collision with Nebulosa
        if (object instanceof Nebulosa) {

        }

        // Collision with Pacman
        if (object instanceof Pacman) {

        }

        // Collision with Planeta
        if (object instanceof Planeta) {

        }

        // Collision with PowerUp
        if (object instanceof PowerUp) {

        }

        // Collision with Ship
        if (object instanceof KillerShip) {
            KillerRules.collisionShipWithShip(game, ship, (KillerShip) (ship));
        }

        // Collision with Shot
        if (object instanceof Shoot) {
            KillerRules.collisionShipWithShoot(game, ship, (Shoot) (object));
        }

        // Collision with Wall
        if (object instanceof Wall) {
            KillerRules.collisionShipWithWall(game, ship, (Wall) (object));
        }

    }

    private static void collisionShipWithAsteroid(){}

    private static void collisionShipWithBlackHole(){}

    private static void collisionShipWithNebulosa(){}

    private static void collisionShipWithPacMan(){}

    private static void collisionShipWithPlaneta(){}

    private static void collisionShipWithPowerUp(){}

    private static void collisionShipWithShip(KillerGame game, KillerShip ship, KillerShip ship2) {}

    /**
     * @author Christian
     * @param shoot
     * @param ship
     */
    private static void collisionShipWithShoot(KillerGame game, KillerShip ship, Shoot shoot) {

        // Substract heatlh to ship
        ship.quitarVida(shoot.getDamage());
        
        // Calls die method from KillerShip
        if (ship.getHealth() <= 0) {
            ship.die();
        }

        // Remove shot from the array
        game.removeObject(shoot);

    }

    /**
     * @author Christian
     * @param game
     * @param ship
     * @param wall
     */
    private static void collisionShipWithWall(KillerGame game, KillerShip ship, Wall wall) {
        // Detect wall type
        if (wall.getType() == Wall.Limit.NORTH) {
            // Teleport to down
            ship.setY(0 + ship.getImgHeight());
        }
        if (wall.getType() == Wall.Limit.SOUTH) {
            // Teleport to top
            ship.setY((game.getHeight()) + (ship.getImgWidth()));
        }
        if (wall.getType() == Wall.Limit.EAST) {
            // Remove from the array
            game.removeObject(ship);
            // Send Ship to the prev module
            game.sendObjectToPrev(ship);
        }
        if (wall.getType() == Wall.Limit.WEST) {
            // Delete from the array
            game.removeObject(ship);
            // Send ship to the next module
            game.sendObjectToNext(ship);
        }
    }

    // ***************************************************************************************************** //
    // *************************** [            Collision Shoot          ] ********************************* //
    // ***************************************************************************************************** //

    /**
     * @author Alvaro
     * @param shoot
     * @param object
     */
    private static void collisionShoot(KillerGame game, Shoot shoot, VisibleObject object) {

        // Collision with Asteroid
        if (object instanceof Asteroid) {

        }

        // Collision with BlackHole
        if (object instanceof BlackHole) {

        }

        // Collision with Nebulosa
        if (object instanceof Nebulosa) {

        }

        // Collision with Pacman
        if (object instanceof Pacman) {

        }

        // Collision with Planeta
        if (object instanceof Planeta) {

        }

        // Collision with PowerUp
        if (object instanceof PowerUp) {

        }

        // Collision with Shot
        if (object instanceof Shoot) {
            KillerRules.collisionShootWithShoot(game, shoot, (Shoot) (object));
        }

        // Collision with Ship
        if (object instanceof KillerShip) {
            KillerRules.collisionShipWithShoot(game, (KillerShip) (object), shoot);
        }

        // Collision with Wall
        if (object instanceof Wall) {
            KillerRules.collisionShootWithWall(game, shoot, (Wall) (object));
        }

    }

    private static void collisionShootWithAsteroid(){}

    private static void collisionShootWithBlackHole(){}

    private static void collisionShootWithNebulosa(){}

    private static void collisionShootWithPacMan(){}

    private static void collisionShootWithPlaneta(){}

    private static void collisionShootWithPowerUp(){}

    /**
     * @author Christian
     * @param shoot
     * @param shoot2
     */
    private static void collisionShootWithShoot(KillerGame game, Shoot shoot, Shoot shoot2) {
        // reventar ambos shots
        game.removeObject(shoot);
        game.removeObject(shoot2);
    }

    /**
     * @author Christian
     * @param game
     * @param shoot
     * @param wall
     */
    private static void collisionShootWithWall(KillerGame game, Shoot shoot, Wall wall) {

        // Detect wall type
        if (wall.getType() == Wall.Limit.NORTH) {
            // Teleport to bottom
            shoot.setY((game.getHeight()) + (shoot.getImgWidth()));
        }
        if (wall.getType() == Wall.Limit.SOUTH) {
            // Teleport to top
            shoot.setY(0 + shoot.getImgHeight());
        }
        if (wall.getType() == Wall.Limit.EAST) {
            // Delete from the array
            game.removeObject(shoot);
            // Send shoot to the prev module
            game.sendObjectToPrev(shoot);
        }
        if (wall.getType() == Wall.Limit.WEST) {
            // Delete from the array
            game.removeObject(shoot);
            // Send shoot to the next module
            game.sendObjectToNext(shoot);
        }
    }

}
