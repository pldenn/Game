package manager;

import domain.Ship;

import java.util.Random;

public class Code {
    Ship ship = new Ship();

    public void autoGenerate() {
        int Random = (int) (Math.random() * 4);
        int[] location = {Random, ++Random, ++Random};
        ship.setLocationCells(location);
        //TODO: Данный метод должен генерировать начальную ячейку корабля
    }

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
