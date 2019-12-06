package testme.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import testme.SimpleConfiguration;
import testme.api.ClientApi;
import testme.dto.Client;

import java.util.List;

/**
 * @author muhaiminin
 */
@RestController
public class ClientResource implements ClientApi {
    private SimpleConfiguration config;

    @Autowired
    public ClientResource(SimpleConfiguration config) {
        this.config = config;
    }

    @CrossOrigin
    @Override
    public ResponseEntity<List<Client>> list() {
        return ResponseEntity.ok(config.getClients());
    }

}
