package iuh.fit.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired OrderRepository repo;

    @PostMapping public Order create(@RequestBody Order o) { o.setStatus("CREATED"); return repo.save(o); }
    @GetMapping("/{id}") public Order get(@PathVariable Long id) { return repo.findById(id).orElse(null); }
}
