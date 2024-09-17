package io.github.orionlibs.orion_tiny_math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class NumberPrinterTest extends ATest
{
    @Test
    void test_printScientificForm()
    {
        assertEquals("4 x 10^-3", NumberPrinter.printScientificForm(0.004d));
        assertEquals("6.4004 x 10^1", NumberPrinter.printScientificForm(64.004d));
        assertEquals("6.400412345678912 x 10^1", NumberPrinter.printScientificForm(64.004123456789123456789d));
        assertEquals("8 x 10^3", NumberPrinter.printScientificForm(8000));
        assertEquals("8.638 x 10^3", NumberPrinter.printScientificForm(8638));
    }
}
