package unit.test.test.repository;

import org.springframework.data.jpa.repository.*;
import unit.test.test.entity.*;

import java.util.*;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByBedSpaceRoomHostelHostelName(String hostelName);

    List<Student> findAllByBedSpaceRoomRoomId(Integer roomId);
}
