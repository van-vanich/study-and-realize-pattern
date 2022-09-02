public class RealObjectProxy extends RealObjectImpl{
    @Override
    public void doSomething() {
        System.out.println("delegate work with real object!!!");
        super.doSomething();
    }
}
