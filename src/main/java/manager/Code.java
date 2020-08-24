package manager;

import domain.Ship;

public class Code {
    Ship ship = new Ship();

    public String checkYourself(String where) {
        int whereFormatToInt = Integer.parseInt(where);
        String result = "Мимо";

        for (int cells : ship.getLocationCells()) {
            if (cells == whereFormatToInt) {
                ship.setNumOfHits(ship.getNumOfHits() + 1);
                result = "Попал";
                break;
            }
        }
        if (ship.getNumOfHits() == ship.getLocationCells().length) {
            result = "Убил";
        }
        return result;
    }
}
