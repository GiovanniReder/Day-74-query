package giovanni.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "partecipazioni")
public class Attendance {
    @Id
    @GeneratedValue
    private long id;

}
