package unit.test.test.entity;

import lombok.*;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hostel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hostelId;

    private String hostelName;

    private Integer genderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genderId", referencedColumnName = "genderId", updatable = false, insertable = false)
    private Gender gender;
}
