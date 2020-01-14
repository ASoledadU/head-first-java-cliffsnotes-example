public class SimpleShipsTestDrive {
    public static void main(String[] args) {
        SimpleShips ship = new SimpleShips();
        int[] locations = { 2, 3, 4 };
        ship.setLocationCells(locations);
        String userGuess = "2";
        String result = ship.checkYourself(userGuess);
    }
}
