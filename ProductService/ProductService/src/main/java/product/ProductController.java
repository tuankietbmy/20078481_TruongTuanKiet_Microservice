package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired ProductRepository repo;

    @PostMapping public Product add(@RequestBody Product p) { return repo.save(p); }
    @GetMapping("/{id}") public Product get(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @GetMapping public List<Product> all() { return repo.findAll(); }
}
