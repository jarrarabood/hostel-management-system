package unit.test.test.dto.request;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;
import java.io.*;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest implements Serializable {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer studentId;

    @JsonProperty("full_name")
    private String fullName;

    private String email;

    @JsonProperty("bed_space_id")
    private Integer bedSpaceId;

    @JsonProperty("gender_id")
    private Integer genderId;
}
