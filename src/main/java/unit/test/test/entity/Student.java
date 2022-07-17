package unit.test.test.entity;

import lombok.*;
import unit.test.test.entity.*;

import javax.persistence.*;
import java.io.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String fullName;

    private String email;

    private Integer bedSpaceId;

    private Integer genderId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bedSpaceId", referencedColumnName = "bedSpaceId", insertable = false, updatable = false)
    private BedSpace bedSpace;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genderId", referencedColumnName = "genderId", updatable = false, insertable = false)
    private Gender gender;
}
