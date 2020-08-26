package manager;

import domain.Ship;
import input.GameHelper;

import java.io.IOException;
import java.util.ArrayList;

public class Code {
    Ship ship = new Ship();

    public static void main(String[] args) throws IOException {
        Code code = new Code();
        GameHelper helper = new GameHelper();
        int numOfHits = 0;
        code.autoGenerateV2();
        while (!code.ship.getLocation().isEmpty()) {
            System.out.println(code.checkYourselfV2(helper.input("Введите значение координаты выстрела в пределах 0 - 7")));
            ++numOfHits;
        }
        System.out.println("Игра окончена. Ваш счет: " + numOfHits);
        //TODO: тут должна быть собранаа вся игра
    }


    public void autoGenerateV2() {
        ArrayList<String> test = new ArrayList<>();
        int first = (int) (Math.random() * 5);

        test.add(Integer.toString(first));
        test.add(Integer.toString(++first));
        test.add(Integer.toString(++first));

        ship.setLocation(test);
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
