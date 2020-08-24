package manager;

import domain.Ship;
import org.junit.jupiter.api.Test;

class SystemTest {
    @Test
    public void df() {
        Code code = new Code();

        int location[] = {1, 2, 3};
        code.ship.setLocationCells(location);
        java.lang.System.out.println(code.checkYourself("0"));
        java.lang.System.out.println(code.checkYourself("2"));
        java.lang.System.out.println(code.checkYourself("3"));
        java.lang.System.out.println(code.checkYourself("1"));


    }
}