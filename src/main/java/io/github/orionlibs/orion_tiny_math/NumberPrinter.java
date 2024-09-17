package io.github.orionlibs.orion_tiny_math;

import java.text.DecimalFormat;

public class NumberPrinter
{
    private static final DecimalFormat scientificFormat;

    static
    {
        scientificFormat = new DecimalFormat("0.###############E0");
    }

    public static String printScientificForm(double number)
    {
        String formatted = scientificFormat.format(number);
        return printScientificForm(formatted);
    }


    public static String printScientificForm(long number)
    {
        String formatted = scientificFormat.format(number);
        return printScientificForm(formatted);
    }


    private static String printScientificForm(String formattedNumber)
    {
        String[] parts = formattedNumber.split("E");
        String base = parts[0];
        int exponent = Integer.parseInt(parts[1]);
        return base + " x 10^" + exponent;
    }
}
