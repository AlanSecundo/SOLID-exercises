public class MySQLDatabase implements Database {
    public void connect() {
        // Lógica de conexão com MySQL
        System.out.println("Connected to MySQL");
    }

    public void disconnect() {
        // Lógica de desconexão do MySQL
        System.out.println("Disconnected from MySQL");
    }

    public void saveUser(String user) {
        // Lógica para salvar o usuário no banco de dados
        System.out.println("User saved in MySQL");
    }
}