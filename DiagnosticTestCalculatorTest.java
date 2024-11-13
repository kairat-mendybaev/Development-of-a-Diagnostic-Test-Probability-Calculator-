import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiagnosticTestCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testCalculatePositiveProbability_highSensitivity() {
        assertEquals(0.1666, DiagnosticTestCalculator.calculatePositiveProbability(0.01, 0.99, 0.95), DELTA);
    }

    @Test
    public void testCalculatePositiveProbability_lowSpecificity() {
        assertEquals(0.0434, DiagnosticTestCalculator.calculatePositiveProbability(0.01, 0.90, 0.80), DELTA);
    }

    @Test
    public void testCalculateNegativeProbability_highSpecificity() {
        assertEquals(1.0100, DiagnosticTestCalculator.calculateNegativeProbability(0.01, 0.90, 0.99), DELTA);
    }

    @Test
    public void testCalculateNegativeProbability_lowSensitivity() {
        assertEquals(1.0522, DiagnosticTestCalculator.calculateNegativeProbability(0.01, 0.70, 0.95), DELTA);
    }

    @Test
    public void testCalculatePositiveProbability_idealConditions() {
        assertEquals(1.0, DiagnosticTestCalculator.calculatePositiveProbability(0.50, 1.00, 1.00), DELTA);
    }

    @Test
    public void testCalculateNegativeProbability_idealConditions() {
        assertEquals(1.0, DiagnosticTestCalculator.calculateNegativeProbability(0.50, 1.00, 1.00), DELTA);
    }
}
