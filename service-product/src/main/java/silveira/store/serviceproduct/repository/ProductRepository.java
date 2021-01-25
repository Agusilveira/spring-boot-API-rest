package silveira.store.serviceproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import silveira.store.serviceproduct.entity.Category;
import silveira.store.serviceproduct.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
    public List<Product> findByName(String name);

}
