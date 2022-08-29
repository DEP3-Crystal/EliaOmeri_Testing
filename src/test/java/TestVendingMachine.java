import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestVendingMachine {
    @Test
    public void checkGetChange_shouldReturnArrayofCoins() {
        VendingMachine machine1 = new VendingMachine();
        int[] change = VendingMachine.getChange(5, 0.99);
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 0, 0, 4}, change);
    }

    @Test
    public void checkGetChange_shouldReturnArrayofZeros() {
        VendingMachine vendingMachine = new VendingMachine();
        int[] change = VendingMachine.getChange(4, 4);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, change);
    }

    @Test
    public void checkGetChange_shouldReturnTotalMoney() {
        VendingMachine vendingMachine = new VendingMachine();
        int[] change = VendingMachine.getChange(5, 6);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 5}, change);
    }
}
