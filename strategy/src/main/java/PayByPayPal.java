import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedId;

    static {
        DATA_BASE.put("vanya", "vanya@gmail.com");
        DATA_BASE.put("test", "test@gmail.com");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedId) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedId) {
                System.out.println("Enter email: ");
                email = READER.readLine();
                System.out.println("Enter a password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful!");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedId(email.equals(DATA_BASE.get(password)));
        return signedId;
    }

    public void setSignedId(boolean signedId) {
        this.signedId = signedId;
    }
}
