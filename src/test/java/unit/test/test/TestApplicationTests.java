package unit.test.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.springframework.boot.test.system.*;
import org.springframework.http.*;
import unit.test.test.controller.*;
import unit.test.test.dto.request.*;
import unit.test.test.entity.*;
import unit.test.test.mapper.*;
import unit.test.test.repository.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith({MockitoExtension.class, OutputCaptureExtension.class})
class TestApplicationTests {

    @InjectMocks
    private StudentController controller;

    @Mock
    private StudentRepository repository;

    @Mock
    private StudentMapper mapper;

    @Test
    void contextLoads() {
    }

    @Test
    void getStudent_BasedOnHostelName_ResponseDto() {
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

        when(repository.findAllByBedSpaceRoomHostelHostelName(matches("test1")))
                .thenReturn(List.of(student1, student2, student3));
        ResponseEntity<?> studentRes = controller.findAll(Optional.of("test1"), Optional.empty());

        assertEquals(ResponseEntity.ok(Stream.of(student1, student2, student3)
                .map(mapper::entityToResponse)
                .collect(Collectors.toList())), studentRes);
        assertEquals(3, Arrays.asList(student1, student2, student3).size());
    }

    @Test
    void getStudent_BasedOnRoomId_ResponseDto() {
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

        when(repository.findAllByBedSpaceRoomRoomId(0)).thenReturn(List.of(student1, student2));
        ResponseEntity<?> studentRes = controller.findAll(Optional.empty(), Optional.of(0));

        assertEquals(ResponseEntity.ok(Stream.of(
                        student1, student2)
                .map(mapper::entityToResponse)
                .collect(Collectors.toList())), studentRes);
        assertEquals(2, Arrays.asList(student1, student2).size());
    }

    @Test
    void requestStudent_BedSpace_Response() {
        Student student1 = Student.builder()
                .studentId(0)
                .bedSpaceId(0)
                .genderId(0)
                .build();

        when(repository.save(ArgumentMatchers.argThat(student -> student1.getStudentId().equals(student.getStudentId())
                && student1.getBedSpaceId().equals(student.getBedSpaceId()))))
                .thenReturn(student1);
        ResponseEntity<?> student = controller.requestBedSpace(0, 0);

        assertEquals(ResponseEntity.ok("the student reserve bed Space successfully"), student);
        assertEquals(1, List.of(student1).size());

    }
    @Test
    void create_StudentRequest_StudentResponse() {
        StudentRequest studentRequest = StudentRequest
                .builder()
                .studentId(12)
                .bedSpaceId(1)
                .genderId(0)
                .fullName("test")
                .email("test@boutiqaat.com")
                .build();

        ResponseEntity<?> studentResponse = controller.create(studentRequest);

        assertEquals(ResponseEntity.ok("Student Added successfully"), studentResponse);
    }
}
