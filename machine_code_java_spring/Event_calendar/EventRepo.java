// class EventRepo implements JPARepository<Event,UUID> {
//     super();

// }

@Repository
public interface EventRepo extends JpaRepository<Event, UUID> {
    Optional<Event> findByTitle(String title);
}
