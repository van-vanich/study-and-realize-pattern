public class SavingsAccount extends Component {
    private String accountNo;
    private float accountBalance;

    private AccountStatement currentStmt;

    public SavingsAccount(String accountNo, float accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public AccountStatement getCurrentStmt() {
        return currentStmt;
    }

    @Override
    public float getBalanced() {
        return accountBalance;
    }

    @Override
    public AccountStatement getStatement() {
        return currentStmt;
    }
}
