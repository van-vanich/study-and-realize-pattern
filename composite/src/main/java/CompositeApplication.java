public class CompositeApplication {
    public static void main(String[] args) {
        Component component = new CompositeAccount();

        component.add(new DepositAccount("DA1", 100));
        component.add(new DepositAccount("DA2", 150));
        component.add(new SavingsAccount("SA1", 200));

        float totalBalance = component.getBalanced();
        System.out.println("Total balance: " + totalBalance);

//        AccountStatement mergedStatement = component.getStatement();
        //todo create idea for merge and realize this
    }
}
