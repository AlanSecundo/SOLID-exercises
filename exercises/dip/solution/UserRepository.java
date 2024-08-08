public class UserRepository {
    private Database database;

    public UserRepository(Database database) {
        this.database = database;
    }

    public void addUser(String user) {
        database.connect();
        database.saveUser(user);
        database.disconnect();
    }
}