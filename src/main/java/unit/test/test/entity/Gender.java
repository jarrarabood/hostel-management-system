package unit.test.test.entity;

import lombok.*;

import javax.persistence.*;
import java.io.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Gender implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genderId;

    @Column
    private String genderType;
}
