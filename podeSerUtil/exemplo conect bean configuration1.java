/*
levando em consideração que eu tenho esses valores em minha application.yml, por isso o uso de @Value
*/

package io.github.lorimedeiros.livraria_api.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    //classe de lógica não precisa de private nos atributos
    //@Value("${spring.datasource.url}") - esse comando busca essa propriedade no arquivo application
    //o datasource mais básico do spring boot é o Driver Manager DataSource (DriverManagerDataSource)

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Value("${spring.datasource.driverClassName}")
    String driver;

    /*
    não é recomendado em produções (uso profissional), mas é o mais básico para essa demonstração inicial
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();

        //setando suas informações
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setDriverClassName(driver);

        return ds;
    }
    */

    @Bean
    public DataSource hikariDataSource(){
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);

        //define que o máximo de conexões ativas simultâneas no pool de conexões do seu banco de dados é 10
        //em caso de lentidão é só aumentar esse número
        config.setMaximumPoolSize(10);
        //mínimo liberado já de início
        config.setMinimumIdle(1);
        //nome da pool que aparece no log
        config.setPoolName("livreria-db-pool");
        //600 mil milissegundos (ms) (10 minutos)
        config.setMaxLifetime(600000);
        //timeout para conseguir nova conexão
        config.setConnectionTimeout(100000);
        //teste para ver se o banco está funcionando (inutilmente irá retornar 1)
        config.setConnectionTestQuery("SELECT 1");

        return new HikariDataSource(config);
    }

}
