import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class Jdbc {

    final String jdbcURL = "jdbc:h2:./target/user";
    Connection conn;

    String FIND_ALL_USERS_SQL ="select * from greet";

    PreparedStatement findAllUsers;

    public Connection jdbc ()  {
        try {
            Class.forName("org.h2.Driver");
            conn = getConnection(jdbcURL, "sa", "");
            System.out.println("connecting to database . . .");

            findAllUsers = conn.prepareStatement(FIND_ALL_USERS_SQL);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Jdbc() throws SQLException {
        conn = jdbc();
        PreparedStatement ps = conn.prepareStatement("select * from your_table where user = name");
        System.out.println(ps);
        ps.setString(1, "query_value");
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString("column_name"));
        }
    }


}
