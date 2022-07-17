package unit.test.test.repository;

import org.springframework.data.jpa.repository.*;
import unit.test.test.entity.*;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
