package manager;

import domain.Ship;
import input.GameHelper;

import java.io.IOException;
import java.util.Random;

public class Code {
    Ship ship = new Ship();

    public static void main(String[] args) throws IOException {
        GameHelper helper = new GameHelper();
        System.out.println(helper.input("введите значение"));
        //TODO: этот метод используется для ввода значения пользователем
        //TODO: осталось понять как его использовать в коде
    }

    public void autoGenerate() {
        int Random = (int) (Math.random() * 5);
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
