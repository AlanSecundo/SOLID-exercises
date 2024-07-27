public class UserRepository {
    private MySQLDatabase database;

    public UserRepository() {
        this.database = new MySQLDatabase();
    }

    public void addUser(String user) {
        database.connect();
        database.saveUser(user);
        database.disconnect();
    }
}