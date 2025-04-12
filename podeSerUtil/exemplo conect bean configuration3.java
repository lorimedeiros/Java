/*
usando variáveis de ambiente (a melhor forma ainda é a 1ª, mas cá está outra, caso vc queira MUITO MESMO botar essas porra na mão sem o .yml)

Configure nas "Run Configurations" > "Environment variables".
*/

package io.github.lorimedeiros.livraria_api.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    // Nomes das variáveis de ambiente (customizáveis)
    private static final String ENV_DB_URL = "DB_URL";
    private static final String ENV_DB_USER = "DB_USER";
    private static final String ENV_DB_PASSWORD = "DB_PASSWORD";
    private static final String ENV_DB_DRIVER = "DB_DRIVER";

    // Valores padrão (caso as variáveis de ambiente não existam)
    private static final String DEFAULT_DB_URL = "jdbc:postgresql://localhost:5432/livraria";
    private static final String DEFAULT_DB_USER = "postgres";
    private static final String DEFAULT_DB_PASSWORD = "postgres";
    private static final String DEFAULT_DB_DRIVER = "org.postgresql.Driver";

    @Bean
    public DataSource hikariDataSource() {
        HikariConfig config = new HikariConfig();

        // Obtém valores das variáveis de ambiente ou usa os padrões
        String dbUrl = getEnvOrDefault(ENV_DB_URL, DEFAULT_DB_URL);
        String dbUser = getEnvOrDefault(ENV_DB_USER, DEFAULT_DB_USER);
        String dbPassword = getEnvOrDefault(ENV_DB_PASSWORD, DEFAULT_DB_PASSWORD);
        String dbDriver = getEnvOrDefault(ENV_DB_DRIVER, DEFAULT_DB_DRIVER);

        config.setJdbcUrl(dbUrl);
        config.setUsername(dbUser);
        config.setPassword(dbPassword);
        config.setDriverClassName(dbDriver);

        // Configurações do pool de conexões
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(1);
        config.setPoolName("livreria-db-pool");
        config.setMaxLifetime(600000);
        config.setConnectionTimeout(100000);
        config.setConnectionTestQuery("SELECT 1");

        return new HikariDataSource(config);
    }

    /**
     * Método auxiliar para ler variáveis de ambiente ou retornar um valor padrão.
     */
    private String getEnvOrDefault(String envVar, String defaultValue) {
        String value = System.getenv(envVar);
        return (value != null && !value.isEmpty()) ? value : defaultValue;
    }
}
