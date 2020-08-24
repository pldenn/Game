package manager;

import domain.Ship;

public class Code {
    Ship ship = new Ship();

    public String checkYourself(String where) {

        int whereFormatToInt = Integer.parseInt(where);
        String result = "Мимо";
        int sizeOfShip = ship.getLocationCells().length;

        for (int cells : ship.getLocationCells()) {
            if (cells == whereFormatToInt) {
                ship.setNumOfHits(ship.getNumOfHits() + 1);
                result = "Попал";
                if (ship.getNumOfHits() == sizeOfShip)
                {
                    result = "Убил";
//                    return result = "Убил";
                }
//                return result = "Попал";
            }
        }
        return result;

    }
}
