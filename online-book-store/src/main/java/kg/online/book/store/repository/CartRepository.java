package kg.online.book.store.repository;

import kg.online.book.store.entity.Cart;
import kg.online.book.store.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserAccount(UserAccount userAccount);
}
