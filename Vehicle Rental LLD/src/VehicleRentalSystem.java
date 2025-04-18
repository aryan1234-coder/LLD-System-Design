import Product.Vehicle;

import java.util.List;

public class VehicleRentalSystem {

    List<Store> storeList;
    List<User> users;

    public VehicleRentalSystem(List<Store > storeList,List<User> users) {
        this.storeList = storeList;
        this.users = users;
    }

    public Store getStore(Location location ) {

        return storeList.get(0);
    }

}
