package io.github.orionlibs.orion_tiny_math;

import java.util.logging.Handler;
import java.util.logging.Logger;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewClass
{
    private final static Logger log;

    static
    {
        log = Logger.getLogger(NewClass.class.getName());
    }

    static void addLogHandler(Handler handler)
    {
        log.addHandler(handler);
    }


    static void removeLogHandler(Handler handler)
    {
        log.removeHandler(handler);
    }


    public static void test()
    {
        log.info("hello world");
    }
}
