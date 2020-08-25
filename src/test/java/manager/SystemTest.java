package manager;

import input.GameHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

class SystemTest {
    Code code = new Code();

    @Test
    public void shouldCheckYourself() {

        int[] location = {1, 2, 3};
        code.ship.setLocationCells(location);

        Assertions.assertEquals("Мимо", code.checkYourself("0"));
        Assertions.assertEquals("Попал", code.checkYourself("1"));
        Assertions.assertEquals("Попал", code.checkYourself("2"));
        Assertions.assertEquals("Убил", code.checkYourself("3"));
    }

    @Test
    public void shouldCheckRandom() {
        code.autoGenerate();
        System.out.println(code.checkYourself("0"));
        System.out.println(code.checkYourself("1"));
        System.out.println(code.checkYourself("2"));
        System.out.println(code.checkYourself("3"));
    }

    @Test
    public void shouldCheckReturn() {
        int[] location = {1, 2, 3};
        code.ship.setLocationCells(location);

        code.checkYourself("0");
        System.out.println(code.checkYourself("1"));
        System.out.println(code.checkYourself("2"));
        System.out.println(code.checkYourself("3"));
    }

    @Test
    public void shouldCheckInput() throws IOException {
        GameHelper helper = new GameHelper();


    }

//    @Test
//    public void shouldCheckInput() {
//        GameHelper helper = new GameHelper();
//        String[] test = {"0"};
//        helper.main(test);
//    }
//
//    public static void main(String[] args) {
//        GameHelper helper = new GameHelper();
//        helper.getUserInput();
//    }


}
