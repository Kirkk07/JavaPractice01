package Interfaces2;

public class Utils {
    public static void runLoggers(Logger[] loggers,String message){
        for (Logger logger:loggers
        ) {logger.log(message);

        }

    }
}
