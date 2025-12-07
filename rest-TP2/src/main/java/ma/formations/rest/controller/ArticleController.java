package ma.formations.rest.controller;



import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.formations.rest.domaine.ArticleDTO;
import ma.formations.rest.service.IService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
@AllArgsConstructor
public class ArticleController {

    private IService service;

    @GetMapping(value = "/all", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public List<ArticleDTO> getAll() {
        return service.getAll();
    }

    // http://localhost:7777/api/articles/id/1
    @GetMapping(value = "/id/{id}")
    public ResponseEntity<Object> getArticleById(@PathVariable("id") Long id) {
        ArticleDTO articleFound = service.getById(id);
        return new ResponseEntity<>(articleFound, HttpStatus.OK);
    }

    // http://localhost:7777/api/articles?id=1
    @GetMapping
    public ResponseEntity<Object> getArticleByIdUsingParam(@RequestParam("id") Long id) {
        ArticleDTO articleFound = service.getById(id);
        return new ResponseEntity<>(articleFound, HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createArticle(@Valid @RequestBody ArticleDTO dto) {
        service.create(dto);
        return new ResponseEntity<>("Article is created successfully", HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Object> updateArticle(@PathVariable("id") Long id, @RequestBody ArticleDTO dto) {
        service.update(id, dto);
        return new ResponseEntity<>("Article is updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Object> deleteArticle(@PathVariable("id") Long id) {
        service.deleteById(id);
        return new ResponseEntity<>("Article is deleted successfully", HttpStatus.OK);
    }
}

