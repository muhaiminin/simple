package testme;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import testme.dto.Client;

import java.util.List;

/**
 * @author muhaiminin
 */
@Configuration
@ConfigurationProperties(prefix = "simple")
@Getter
@Setter
public class SimpleConfiguration {
    private List<Client> clients;
}
