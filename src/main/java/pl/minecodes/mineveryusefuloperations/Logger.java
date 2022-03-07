package pl.minecodes.mineveryusefuloperations;

public class Logger {

    private final String prefix;

    public Logger(String prefix) {
        this.prefix = "[" + prefix + "] ";
    }

    public static Logger getSystemLogger() {
        return new Logger("SYSTEM");
    }

    public void info(String text) {
        System.out.println(prefix + text);
    }

    public void error(String text) {
        System.err.println(prefix + text);
    }

}
