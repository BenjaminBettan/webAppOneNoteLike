package demo.domain.page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PageRepository extends CrudRepository<Page, Long> {

	Page findByNomPage(@Param("nomPage") String nomPage);

}