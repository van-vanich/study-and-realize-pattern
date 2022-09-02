public class RoleCheckMiddleware extends Middleware {

    public static final String ADMIN_EMAIL = "admin@petproject.com";

    @Override
    public boolean check(String email, String password) {
        if (email.equals(ADMIN_EMAIL)) {
            System.out.println("Hello, admin :)");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
