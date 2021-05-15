package Database;

import java.sql.Connection;
import java.sql.SQLException;

public class Testt {
    public static void main(String[] args) {
        try {
            Database database = new Database("root", "root");
            database.showConnect();
            Connection connection = null;
//            database.insert("10", "123", "123", "123");
//            System.out.println(database.getUser("10"));
//            UserData userData = new UserData();

            System.out.println(database.check("1", "1"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
