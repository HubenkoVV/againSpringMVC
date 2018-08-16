package model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/15/2018.
 */
@Component
@Scope("prototype")
@Entity
@Data
@NoArgsConstructor
@ToString(exclude= {"cars", "fixed"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "owner")
    private List<Car> cars;

    @OneToMany(mappedBy = "mechanic")
    private List<Car> fixed;
}
