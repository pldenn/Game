package manager;

import domain.Ship;

import java.util.ArrayList;

public class Code {
    Ship ship = new Ship();

    public static void main(String[] args) {
        //TODO: тут должна быть собранаа вся игра
    }


    public void autoGenerateV2() {
        ArrayList<String> test = new ArrayList<>();
        int first = (int) (Math.random() * 5);

        test.add(Integer.toString(first));
        test.add(Integer.toString(++first));
        test.add(Integer.toString(++first));

        ship.setLocation(test);
        //TODO: Данный метод должен генерировать ячейки корабля для ArrayList
    }


    public String checkYourselfV2(String userInput) {

        String result = "Мимо";

        int index = ship.getLocation().indexOf(userInput);
        if (index >= 0) {
            ship.getLocation().remove(userInput);
            if (ship.getLocation().isEmpty()) {
                result = "Убил";
            } else
                result = "Попадание";
        }
        return result;
    }
}
