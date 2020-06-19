package some.example.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import some.example.hibernate.model.Bar;

@Repository
public interface BarRepository extends JpaRepository<Bar, Integer> {
}
