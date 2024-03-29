package courses;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

	Collection<Course> findByTopicsContains(Topic topic);
	
	Collection<Course> findByTopicsId(long id);

	Course findByName(String courseName);

	Collection<Course> findAllByOrderByNameAsc();


}
