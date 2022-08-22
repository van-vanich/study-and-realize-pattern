public class Singleton {
    private static Singleton instance;
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        sleep();

        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    private static void sleep() {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public String getValue() {
        return value;
    }
}
