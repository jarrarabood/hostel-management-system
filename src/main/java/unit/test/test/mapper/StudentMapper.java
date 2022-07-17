package unit.test.test.mapper;

import org.mapstruct.*;
import org.springframework.stereotype.*;
import unit.test.test.dto.request.*;
import unit.test.test.dto.response.*;
import unit.test.test.entity.*;

@Mapper
@Component
public interface StudentMapper {

    StudentResponse entityToResponse(Student student);

    Student toEntity(StudentRequest model);
}
