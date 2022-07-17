package unit.test.test.controller;

import lombok.*;
import org.apache.coyote.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.*;
import unit.test.test.dto.request.*;
import unit.test.test.entity.*;
import unit.test.test.mapper.*;
import unit.test.test.repository.*;

import javax.annotation.*;
import javax.persistence.criteria.*;
import javax.servlet.http.*;
import java.util.*;
import java.util.stream.*;

import static org.springframework.http.ResponseEntity.created;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody StudentRequest studentRequest) {
        Student student = mapper.toEntity(studentRequest);
        repository.save(student);
        return ResponseEntity.ok("Student Added successfully");
    }

    @GetMapping("all")
    public ResponseEntity<?> findAll(@RequestParam("hostelName") Optional<String> hostelName,
                                     @RequestParam("roomId") Optional<Integer> roomId) {

        return hostelName.map(s -> ResponseEntity.ok(repository
                .findAllByBedSpaceRoomHostelHostelName(s)
                .stream()
                .map(mapper::entityToResponse)
                .collect(Collectors.toList()))).orElseGet(() -> roomId.map(integer -> ResponseEntity.ok(repository
                .findAllByBedSpaceRoomRoomId(integer)
                .stream()
                .map(mapper::entityToResponse)
                .collect(Collectors.toList()))).orElseGet(() -> ResponseEntity.ok(repository.findAll()
                .stream()
                .map(mapper::entityToResponse)
                .collect(Collectors.toList()))));
    }

    @PostMapping("/requestBedSpace")
    public ResponseEntity<?> requestBedSpace(@RequestParam Integer studentId, @RequestParam Integer bedSpaceId) {
        Student student = new Student();
        student.setStudentId(studentId);
        student.setBedSpaceId(bedSpaceId);
        repository.save(student);
        return ResponseEntity.ok("the student reserve bed Space successfully");
    }
}
