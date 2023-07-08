import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateFareTest {

    @Test
    @DisplayName("Calculate fare for 1km as 10 rs")
    public void calculateFareFor1km(){
        CalculateFare fare = new CalculateFare();
        int cost = fare.calculateFare(1);

        assertEquals(10, cost);
    }
}