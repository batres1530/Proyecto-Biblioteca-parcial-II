package bd;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/bdbiblioteca";
    private static final String USUARIO = "SDBM15";
    private static final String PASSWORD = "a123456789A.";

    private static HikariDataSource dataSource;

    // Bloque estático para inicializar el pool
    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(URL);
        config.setUsername(USUARIO);
        config.setPassword(PASSWORD);
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(30000);
        config.setMaxLifetime(200000);
        config.setConnectionTimeout(10000);

        dataSource = new HikariDataSource(config);
    }

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection(); 
    }

    
    public static void closePool() {
        if (dataSource != null) {
            dataSource.close(); 
        }
    }
}
