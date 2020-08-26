package manager;

import domain.Ship;
import input.GameHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class SystemTest {
    Code code = new Code();

    @Test
    public void shouldCheckDoubleShoot() {
        ArrayList<String> location = new ArrayList<>();

        location.add("2");
        location.add("3");
        location.add("4");

        code.ship.setLocation(location);

        Assertions.assertEquals("Попадание", code.checkYourselfV2("2"));
        Assertions.assertEquals("Мимо", code.checkYourselfV2("2"));

    }

    @Disabled
    @Test
    public void shouldCheckInput() throws IOException {
        //TODO: реализовать проверку ввода
    }
}
