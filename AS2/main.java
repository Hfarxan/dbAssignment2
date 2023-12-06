import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

    
    private static final String user = "postgres";
    private static final String pass = "1111";
     private static final String dbname = "postgres";
    private static final String JDBC_URL = ("jdbc:postgresql://localhost:5432/" + dbname);


    public static void main(String[] args) {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        try (
      
            Connection connection = DriverManager.getConnection(JDBC_URL, user, pass); 
        ) {
            
            String query = "SELECT * FROM Models.Books";
            try (
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
            ) {

                while (resultSet.next()) {
                    int bookId = resultSet.getInt("book_id");
                    String title = resultSet.getString("title");
                    int publicationYear = resultSet.getInt("publication_year");
                    int stock = resultSet.getInt("stock");

                    System.out.println("Book ID: " + bookId);
                    System.out.println("Title: " + title);
                    System.out.println("Publication Year: " + publicationYear);
                    System.out.println("Stock: " + stock);
                    System.out.println("-----------------------");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
