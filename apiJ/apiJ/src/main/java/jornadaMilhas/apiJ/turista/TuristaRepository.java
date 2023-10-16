package jornadaMilhas.apiJ.turista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TuristaRepository extends JpaRepository<Turista, Long> {
    Page<Turista> findAllByAtivoTrue(Pageable paginacao);
}
