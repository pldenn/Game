package manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SystemTest {
    Code code = new Code();

    @Test
    public void shouldCheckYourself() {

        int location[] = {1, 2, 3};
        code.ship.setLocationCells(location);

        Assertions.assertEquals("Мимо", code.checkYourself("0"));
        Assertions.assertEquals("Попал", code.checkYourself("1"));
        Assertions.assertEquals("Попал", code.checkYourself("2"));
        Assertions.assertEquals("Убил", code.checkYourself("3"));
    }
}
