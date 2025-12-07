package ma.formations.rest.integration;



import ma.formations.rest.domaine.ArticleDTO;
import ma.formations.rest.service.IService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ArticleControllerIT {

    @Autowired
    private IService service; // présent comme dans le TP (même si pas utilisé)

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    @Test
    void testGetById() {
        ArticleDTO expected = new ArticleDTO(1L, "PC PORTABLE HP I7", 15000d, 10d);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<ArticleDTO> result = this.restTemplate.exchange(
                "http://localhost:" + port + "/api/articles/id/" + expected.getId(),
                HttpMethod.GET,
                entity,
                ArticleDTO.class
        );

        assertThat(result).isNotNull();
        ArticleDTO dto = result.getBody();
        assertThat(dto).isNotNull();
        assertThat(dto.getId()).isEqualTo(expected.getId());
        assertThat(dto.getDescription()).isEqualTo(expected.getDescription());
        assertThat(dto.getPrice()).isEqualTo(expected.getPrice());
        assertThat(dto.getQuantity()).isEqualTo(expected.getQuantity());
    }
}

