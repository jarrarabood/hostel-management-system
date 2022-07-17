package unit.test.test.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import unit.test.test.entity.*;

@Repository
public interface BedSpaceRepository extends JpaRepository<BedSpace, Integer> {
}
