package bd;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/BDBiblioteca";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "123456789";

    private static HikariDataSource dataSource;

    // Bloque estático para inicializar el pool
    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(URL);
        config.setUsername(USUARIO);
        config.setPassword(PASSWORD);
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(3000);
        config.setMaxLifetime(20000);
        config.setConnectionTimeout(1000);

        dataSource = new HikariDataSource(config);
    }

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection(); // CORREGIDO: renturn → return, datasocure → dataSource
    }

    // Método para cerrar el pool si se necesita
    public static void closePool() {
        if (dataSource != null) {
            dataSource.close(); // CORREGIDO: datasocuere → dataSource
        }
    }
}
