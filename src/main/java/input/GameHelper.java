package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameHelper {

    public String input(String prompt) throws IOException {
        String inputLine = null;
        System.out.println(prompt);
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public String inputV2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение координаты выстрела в пределах 0 - 7");
        String input = sc.nextLine();
        return input;
    }
}
//TODO: этот метод используется для ввода значения пользователем
//TODO: осталось понять как его проверять в тестах JUnit
//TODO: только для использования в методе main????

