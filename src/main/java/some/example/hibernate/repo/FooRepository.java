package some.example.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import some.example.hibernate.model.Foo;

@Repository
public interface FooRepository extends JpaRepository<Foo, Integer> {
}
