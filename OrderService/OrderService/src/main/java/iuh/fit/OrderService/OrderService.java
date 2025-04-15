package iuh.fit.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;


@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public void createOrder(Long productId) {
        // Gọi sang product-service
        String url = "http://localhost:8081/products/" + productId;
        ResponseEntity<ProductDTO> response = restTemplate.getForEntity(url, ProductDTO.class);
        ProductDTO product = response.getBody();

        // Ví dụ in ra thông tin sản phẩm
        System.out.println("Tên SP: " + product.getName());
        System.out.println("Giá: " + product.getPrice());

        // TODO: xử lý lưu đơn hàng
    }
}
