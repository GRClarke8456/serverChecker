import DrinkList.Drinks;

import java.util.ArrayList;
import java.util.List;

public class Server {

    private String name;
    private List<Drinks> drinksAvailable;


    public Server(String name, List<Drinks> drinksAvailable){
        this.name = name;
        this.drinksAvailable = new ArrayList<>();
    }

    public boolean canServeGuest(Guest guest){
        if (guest.getAge() >= 18 && guest.canGuestBuyDrink()
        && guest.isTheGuestSober() && guest.isGuestBannedFromPub()
        && guest.doesGuestHaveLocalCurrency()){
            return true;
        }

        return false;
    }

    public boolean whichDrinksServerMakes(Guest guest){
        if (guest.guestFavouriteDrink().equals(drinksAvailable)){
            return true;
        }
        return false;
    }


}
