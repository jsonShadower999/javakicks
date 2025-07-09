enum VehicleType{
    CAR,SUPERCAR,MINICAR,AUTO,CYCLE,BIKE;
}
enum Location{
    String Langitute;
    String Latitude;
    Region regional_site;
    Address current_loc_detail;
    Country country_name;
    City city_name;
    String pin_code;


}
class Person{
    String username;
    Location currentLoc;
    VehicleType chosenVehicleType;
    String phone_cnt;
    String email_cnt;
    PaymentMode paymode;
    PaymentStatus paystatus;

}
enum DriverState{
    BUSY,FREE,MISSING,HALF_COMPLETED,90_COMPLETED
}
class Driver{
    String driverName;
    String driverId;
    Location driverLoc;
    List<Vehicle> ownvehicle_list;
    String driveLicense;
    double driverRating;
    String phone;
    double currentPay;
    DriverState current_rider_state;
}
class Vehicle{
    String vehicleId;
    VehicleType type;
    String licenseplateurl;
    String licenseno;
    String isverified;
    String mantinance_level_%;
    String model;
    String vehicle_service_name;
    

}

class RideRequest {
    String requestId;
    Person requester;
    Location pickupLocation;
    Location dropLocation;
    VehicleType requestedVehicleType;
    LocalDateTime requestTimestamp;
    RideStatus status;  
}
class Ride{
    String rideId;
    Person rider;
    Driver driver;
    Location pickuploc;
    Location droploc;
    LocalDateTime ridestarttime;
    LocalDateTime ridestoptime;
    double distance_ride;//changes
    Duration time_ride;//changes
    double traffic_rate;
    double intial_cost;
    double variate_cost_pay;
    double plt_cost_pay;
    RideStatus ridestaus;
    Vehicle v_used;
    Payment pay_obj_ride;


}
enum PaymentMode{
    UPI,CASH,WALLET
}
class Payment{
    String payid;
    double amt;
    PaymentMode paymode; 
    boolean paystatus;
    LocalDateTime paytime;
    String trxid;
}
