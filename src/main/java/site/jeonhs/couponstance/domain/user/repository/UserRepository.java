package site.jeonhs.couponstance.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.jeonhs.couponstance.domain.user.domain.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
