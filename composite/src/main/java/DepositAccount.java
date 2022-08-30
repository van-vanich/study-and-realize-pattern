public class DepositAccount extends Component {

    private String accountNo;
    private float accountBalance;

    private AccountStatement currentStmt;

    public DepositAccount(String accountNo, float accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
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
