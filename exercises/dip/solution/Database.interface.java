public interface Database {
    void connect();
    void disconnect();
    void saveUser(String user);
}