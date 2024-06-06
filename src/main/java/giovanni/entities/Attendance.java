package giovanni.entities;

import giovanni.enums.Stato;
import jakarta.persistence.*;

@Entity
@Table(name= "partecipazioni")
public class Attendance {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Person persona;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    public Event evento;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Attendance(){}

    public Attendance(Event evento, Stato stato, Person persona) {
        this.evento = evento;
        this.stato = stato;
        this.persona = persona;
    }

    public long getId() {
        return id;
    }

    public Person getPersona() {
        return persona;
    }

    public Event getEvento() {
        return evento;
    }

    public void setPersona(Person persona) {
        this.persona = persona;
    }



    public void setEvento(Event evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
