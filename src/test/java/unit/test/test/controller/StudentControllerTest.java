package unit.test.test.controller;

import org.junit.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.springframework.http.*;
import unit.test.test.entity.*;
import unit.test.test.mapper.*;
import unit.test.test.repository.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @InjectMocks
    private StudentController controller;

    @Mock
    private StudentRepository repository;

    @Mock
    private StudentMapper mapper;

    @Test
    void getStudent_BasedOnHostelName_ResponseDto() {
        Gender gender1 = Gender.builder()
                .genderId(0)
                .genderType("male")
                .build();
        Gender gender2 = Gender.builder()
                .genderId(1)
                .genderType("female")
                .build();

        Hostel hostel1 = Hostel.builder()
                .hostelId(0)
                .hostelName("test1")
                .genderId(0)
                .build();
        Hostel hostel2 = Hostel.builder()
                .hostelId(1)
                .hostelName("test2")
                .genderId(1)
                .build();

        Room room1 = Room.builder()
                .roomId(0)
                .hostelId(0)
                .build();
        Room room2 = Room.builder()
                .roomId(1)
                .hostelId(0)
                .build();
        Room room3 = Room.builder()
                .roomId(2)
                .hostelId(1)
                .build();

        BedSpace bedSpace1 = BedSpace.builder()
                .bedSpaceId(0)
                .roomId(0)
                .build();
        BedSpace bedSpace2 = BedSpace.builder()
                .bedSpaceId(1)
                .roomId(0)
                .build();
        BedSpace bedSpace3 = BedSpace.builder()
                .bedSpaceId(2)
                .roomId(1)
                .build();
        BedSpace bedSpace4 = BedSpace.builder()
                .bedSpaceId(3)
                .roomId(2)
                .build();

        Student student1 = Student.builder()
                .studentId(0)
                .bedSpaceId(0)
                .genderId(0)
                .build();
        Student student2 = Student.builder()
                .studentId(1)
                .bedSpaceId(1)
                .genderId(0)
                .build();
        Student student3 = Student.builder()
                .studentId(2)
                .bedSpaceId(2)
                .genderId(1)
                .build();
        Student student4 = Student.builder()
                .studentId(3)
                .bedSpaceId(3)
                .genderId(1)
                .build();

        /*when(controller.findAll(Optional.of("test1"), Optional.empty()))
                .thenReturn((ResponseEntity.ok(Arrays.asList(
                student1, student2, student3))));*/
        assertEquals(3, Arrays.asList(student1, student2, student3));
    }
}