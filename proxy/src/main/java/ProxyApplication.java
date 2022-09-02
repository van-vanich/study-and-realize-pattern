public class ProxyApplication {
    public static void main(String[] args) {
        RealObject realObject = new RealObjectProxy();
        realObject.doSomething();
    }
}
