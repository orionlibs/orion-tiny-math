package io.github.orionlibs.orion_tiny_math;

import java.util.TimeZone;

public class ATest
{
    static
    {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        System.setProperty("active.execution.profile", OrionDomain.testing);
    }
}
