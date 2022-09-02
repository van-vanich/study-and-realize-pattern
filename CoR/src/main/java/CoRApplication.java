import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoRApplication {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@petproject.com", "admin");
        server.register("user@petproject.com", "user");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success = false;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Enter password: ");
            String password = reader.readLine();
            success = server.login(email, password);
        } while (!success);
    }
}
