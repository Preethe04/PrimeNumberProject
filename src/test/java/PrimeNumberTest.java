import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {
    @Test
    public void testPrimeNumber() {
        PrimeNumber obj = new PrimeNumber();
        assertTrue(obj.isPrime(7));
        assertTrue(obj.isPrime(2));
        assertFalse(obj.isPrime(4));
        assertFalse(obj.isPrime(1));
        assertFalse(obj.isPrime(-5));
    }
}
