package guru.springframework.config;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD

/**
 * Created by jt on 12/14/15.
 */
@Configuration
=======
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by jt on 12/14/15.
 */
@Configuration
@EnableJpaRepositories("guru.springframework.repositories")
>>>>>>> refs/remotes/origin/spring-data-jpa
public class CommonBeanConfig {

    @Bean
    public StrongPasswordEncryptor strongEncryptor(){
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        return encryptor;
    }
}
