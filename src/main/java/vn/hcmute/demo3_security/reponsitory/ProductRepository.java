package vn.hcmute.demo3_security.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hcmute.demo3_security.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
