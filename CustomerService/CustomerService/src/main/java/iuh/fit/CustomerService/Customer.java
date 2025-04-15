package iuh.fit.CustomerService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String address;
}
