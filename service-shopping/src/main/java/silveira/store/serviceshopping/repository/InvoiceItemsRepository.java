package silveira.store.serviceshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import silveira.store.serviceshopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
