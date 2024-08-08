public class Main {
    public static void main(String[] args) {
        // Database mySQLDatabase = new MySQLDatabase();
        Database OracleDatabase = new OracleDatabase();
        UserRepository userRepository = new UserRepository(OracleDatabase);
        userRepository.addUser("John Doe");
    }
}