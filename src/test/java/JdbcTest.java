import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class JdbcTest {
    public Connection getConnection() throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:./target/user", "sa", "");
        return conn;
    }

    @BeforeEach
    @Test
    public void loadJdbcDriver() {

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException var2) {
            Assertions.fail(var2);
        }
        }

    @Test
    public void connectToDatabase() {
        try {
            Class.forName("org.h2.Driver");
            Connection var1 = DriverManager.getConnection("jdbc:h2:./target/user", "sa", "");
        } catch (Exception var2) {
            Assertions.fail(var2);
        }

    }

    @Test
    public void executeSQLStatement() {
        try {
            Connection conn = this.getConnection();
            Statement statement = conn.createStatement();
            ResultSet var3 = statement.executeQuery("select * from users");
        } catch (Exception var4) {
            Assertions.fail(var4);
        }

    }


}