package iuh.fit.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired CustomerRepository repo;

    @PostMapping public Customer create(@RequestBody Customer c) { return repo.save(c); }
    @GetMapping("/{id}") public Customer get(@PathVariable Long id) { return repo.findById(id).orElse(null); }
}
