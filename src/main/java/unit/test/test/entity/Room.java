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
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    @Column
    private Integer hostelId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hostelId", referencedColumnName = "hostelId", updatable = false, insertable = false)
    private Hostel hostel;
}
