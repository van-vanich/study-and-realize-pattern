public class CompositeAccount extends Component{


    private float totalBalance;
    private AccountStatement compositeStmt;
    private AccountStatement individualStmt;

    @Override
    public float getBalanced() {
        totalBalance = 0;
        for (Component component : list) {
            totalBalance += component.getBalanced();
        }
        return totalBalance;
    }

    @Override
    public AccountStatement getStatement() {
        for (Component f : list) {
            individualStmt = f.getStatement();
            compositeStmt.merge(individualStmt);
        }
        return compositeStmt;
    }
}
