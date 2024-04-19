package projeto.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
