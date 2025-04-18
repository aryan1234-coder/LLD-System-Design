//import Product.car1Class;
//import Product.Vehicle;
//import Product.VehicleStatus;
//import Product.VehicleType;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//
//
//        List<User> users = addUser();
//        List<Vehicle> vehicles = addVehiclein();
//        List<Store> stores = addStore();
//
//        VehicleRentalSystem vehicleRentalSystem=new VehicleRentalSystem(stores,users);
//
//        //here user comes
//        User user =users.get(0);
//
//        //user search for location and change location
//
//        Location location=new Location("India","Bangalore","Electronic City Phase 1","Karnataka",560100);
//        Store store=vehicleRentalSystem.getStore(location);
//
//        List<Vehicle> list=store.getVehicles(VehicleType.car1);
//
//        System.out.println(list);
//        System.out.println(users.size());
//
//        Reservation reservation=store.createReservation(users.get(0),list.get(0));
//
//        Bill bill=new Bill(reservation);
//
//        Payment payment=new Payment();
//        payment.payBill();
//
//        store.completeReservation(reservation.reservationId);
//
//
//
//
//
//    }
//
//    private static List<Store> addStore() {
//
//        List<Store> stores = new ArrayList<>();
//        Store store1 = new Store();
//        store1.storeID = 123;
//        store1.storeName = "car1 Rental Garaze Potter";
//
//        List<Vehicle> vehicles =  addVehiclein();
//        store1.setVehicles(vehicles);
//
//        stores.add(store1);
//        return stores;
//
//    }
//
//    private static List<User> addUser() {
//
//        List<User> users = new ArrayList<>();
//        User user1 = new User();
//        user1.setUserId(1);
//        user1.setName("Aryan");
//        user1.setDrivingLicens(23233-3245-232333);
//
//
//        users.add(user1);
//
//        return users;
//
//    }
//
//    private static List<Vehicle> addVehiclein() {
//
//        List<Vehicle> vehicles=new ArrayList<>();
//        Vehicle vehicle1=new car1Class();
//        vehicle1.setVehicleId(12);
//        vehicle1.setVehicleNumber(3233-32323-32332);
//        vehicle1.setVehicleType(VehicleType.car1);
//        vehicle1.setVehicleStatus(VehicleStatus.ACTIVE);
//        vehicle1.setCompanyName("Toyoya");
//        vehicle1.setModelName("Toyo jf jefya");
//        vehicle1.setKmDriven(1020);
//        vehicle1.setManufactureDate(new Date());
//
//
//        vehicle1.setAverage(122);
//        vehicle1.setCc(121);
//
//        vehicle1.setDailyRentalCost(443);
//        vehicle1.setDailyRentalCost(23223);
//        vehicle1.setNoOfSeats(5);
//
//
//        vehicles.add(vehicle1);
//
//        return vehicles;
//    }
//}

import Product.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<User> users = addUser(scanner);
        List<Store> stores = addStores();

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        // Select user
        User user = users.get(0); // only one user for now

        // Select Location
        System.out.println("\nSelect your city:");
        for (int i = 0; i < stores.size(); i++) {
            System.out.println((i + 1) + ". " + stores.get(i).getLocation().getCity());
        }
        int locIndex = scanner.nextInt() - 1;
        Store selectedStore = stores.get(locIndex);

        // Select Vehicle Type
        System.out.println("\nSelect Vehicle Type:");
        VehicleType[] types = VehicleType.values();
        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i]);
        }
        int typeIndex = scanner.nextInt() - 1;
        VehicleType selectedType = types[typeIndex];

        List<Vehicle> availableVehicles = selectedStore.getVehicles(selectedType);

        if (availableVehicles.isEmpty()) {
            System.out.println("No " + selectedType + "s available in this location.");
            return;
        }

        // List available vehicles
        System.out.println("\nAvailable " + selectedType + "s:");
        for (int i = 0; i < availableVehicles.size(); i++) {
            Vehicle v = availableVehicles.get(i);
            System.out.println((i + 1) + ". " + v.getCompanyName() + " - " + v.getModelName() + " (ID: " + v.getVehicleId() + ")");
        }

        System.out.print("Select a vehicle to reserve: ");
        int vehicleChoice = scanner.nextInt() - 1;

        Reservation reservation = selectedStore.createReservation(user, availableVehicles.get(vehicleChoice));
        System.out.println("Reservation created. ID: " + reservation.reservationId);

        // Generate and display bill
        Bill bill = new Bill(reservation);
        System.out.println("Total Bill: ₹" + bill.ComputeBill(VehicleType.values()[vehicleChoice]));

        // Make payment
        Payment payment = new Payment();
        payment.payBill();

        // Complete reservation
        selectedStore.completeReservation(reservation.reservationId);
        System.out.println("Reservation completed!");

        scanner.close();
    }

    private static List<User> addUser(Scanner scanner) {
        List<User> users = new ArrayList<>();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your driving license number: ");
        int  license = scanner.nextInt();

        User user = new User();
        user.setUserId(1);
        user.setName(name);
        user.setDrivingLicens(license);

        users.add(user);
        return users;
    }

    private static List<Store> addStores() {
        List<Store> stores = new ArrayList<>();
        List<Location> locations = Arrays.asList(
                new Location("India", "Bangalore", "Electronic City Phase 1", "Karnataka", 560100),
                new Location("India", "Hyderabad", "Gachibowli", "Telangana", 500032),
                new Location("India", "Mumbai", "Andheri", "Maharashtra", 400053),
                new Location("India", "Delhi", "Connaught Place", "Delhi", 110001),
                new Location("India", "Chennai", "T Nagar", "Tamil Nadu", 600017)
        );

        for (int i = 0; i < locations.size(); i++) {
            Store store = new Store();
            store.storeID = 100 + i;
            store.storeName = "Rental Hub - " + locations.get(i).getCity();
            store.setLocation(locations.get(i));
            store.setVehicles(addVehiclesForStore(i));
            stores.add(store);
        }

        return stores;
    }

    private static List<Vehicle> addVehiclesForStore(int index) {
        List<Vehicle> vehicles = new ArrayList<>();

        // car1
        CarClass car1 = new CarClass();
        car1.setVehicleId(1000 + index);
        car1.setVehicleNumber(123000 + index);
        car1.setVehicleType(VehicleType.CAR);
        car1.setVehicleStatus(VehicleStatus.ACTIVE);
        car1.setCompanyName("Toyota");
        car1.setModelName("Corolla");
        car1.setKmDriven(1500 + index);
        car1.setManufactureDate(new Date());
        car1.setAverage(20);
        car1.setCc(1300);
        car1.setDailyRentalCost(3000);
        car1.setNoOfSeats(5);


        // car1
        CarClass car2 = new CarClass();
        car2.setVehicleId(1001+ index);
        car2.setVehicleNumber(1230002 + index);
        car2.setVehicleType(VehicleType.CAR);
        car2.setVehicleStatus(VehicleStatus.ACTIVE);
        car2.setCompanyName("BMW");
        car2.setModelName("BMW 4 series");
        car2.setKmDriven(15000 + index);
        car2.setManufactureDate(new Date());
        car2.setAverage(15);
        car2.setCc(13002);
        car2.setDailyRentalCost(30002);
        car2.setNoOfSeats(5);
        
        
        
        vehicles.add(car1);
        vehicles.add(car2);

        // BIKE
        BikeClass bike = new BikeClass(); // Replace with BikeClass if you have one
        bike.setVehicleId(2000 + index);
        bike.setVehicleNumber(456000 + index);
        bike.setVehicleType(VehicleType.BIKE);
        bike.setVehicleStatus(VehicleStatus.ACTIVE);
        bike.setCompanyName("Yamaha");
        bike.setModelName("FZ V3");
        bike.setKmDriven(800 + index);
        bike.setManufactureDate(new Date());
        bike.setAverage(45);
        bike.setCc(150);
        bike.setDailyRentalCost(800);
        bike.setNoOfSeats(2);
        vehicles.add(bike);

        return vehicles;
    }
}
