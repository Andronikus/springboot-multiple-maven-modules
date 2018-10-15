package pt.andronikus.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.andronikus.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
