public class SingletonApplication {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("ONE");
        Singleton anotherSingleton = Singleton.getInstance("TWO");

        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }
}
