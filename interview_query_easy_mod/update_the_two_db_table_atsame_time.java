@Service
public class UserOrderService {

    @Autowired private UserRepository userRepo;
    @Autowired private OrderRepository orderRepo;

    @Transactional
    public void updateUserAndOrders(Long userId, String newName, String newStatus) {
        User user = userRepo.findById(userId).orElseThrow();
        user.setName(newName);
        userRepo.save(user); // updates user

        List<Order> orders = orderRepo.findByUserId(userId);
        for (Order order : orders) {
            order.setStatus(newStatus);
        }
        orderRepo.saveAll(orders); // updates all related orders
    }
}
