package giovanni;

import giovanni.dao.AttendancesDAO;
import giovanni.dao.EventsDAO;
import giovanni.dao.LocationsDAO;
import giovanni.dao.PeopleDAO;
import giovanni.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("query");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        AttendancesDAO attendancesDAO= new AttendancesDAO(em);
        EventsDAO eventsDAO= new EventsDAO(em);
        LocationsDAO locationsDAO= new LocationsDAO(em);
        PeopleDAO peopleDAO= new PeopleDAO(em);

        Location location1 = new Location("dakar" , "daaakkkaar");
        locationsDAO.save(location1);

    }
}
