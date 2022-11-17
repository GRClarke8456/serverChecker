import DrinkList.Drinks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest john;
    Guest kaiden;
    Guest alex;

    /*
    Over 18
    Enough money
    Sober
    Not banned
    Local currency
     */

    @BeforeEach
    public void setUp(){
        server = new Server();
        john = new Guest("John", 54, 89.50,75,
                "Allowed in", '£');
        kaiden = new Guest("Kaiden", 4, 2.49, 13,
                "Banned", '$');
        alex = new Guest("Alex", 19, 4.00, 23,
                "Banned", '£');
    }

    // TODO: test that guest can only get served if over 18

    @Test
    public void isGuestOver18___true(){
        boolean result = server.canServeGuest(john);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void isGuestOver18___false(){
        boolean result = server.canServeGuest(kaiden);
        assertThat(result).isEqualTo(false);
    }


    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void doesGuestHaveEnoughMoney___true(){
        assertThat(john.canGuestBuyDrink()).isEqualTo(true);
    }

    @Test
    public void doesGuestHaveEnoughMoney___false(){
        assertThat(kaiden.canGuestBuyDrink()).isEqualTo(false);
    }

    @Test
    public void doesGuestHaveEnoughMoney___false2(){
        assertThat(alex.canGuestBuyDrink()).isEqualTo(false);
    }


    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void isTheGuestSober___true(){
        assertThat(john.isTheGuestSober()).isEqualTo(true);
    }

    @Test
    public void isTheGuestSober___false(){
        assertThat(kaiden.isTheGuestSober()).isEqualTo(false);
    }


    // TODO: test that guest can only get served if guest is not banned from the pub

    @Test
    public void isGuestBannedFromPub___true(){
        assertThat(john.isGuestBannedFromPub()).isEqualTo(true);
    }

    @Test
    public void isGuestBannedFromPub___false(){
        assertThat(kaiden.isGuestBannedFromPub()).isEqualTo(false);
    }


    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void doesGuestHaveLocalCurrency___true(){
        assertThat(john.doesGuestHaveLocalCurrency()).isEqualTo(true);
    }

    @Test
    public void doesGuestHaveLocalCurrency___true2(){
        assertThat(alex.doesGuestHaveLocalCurrency()).isEqualTo(true);
    }

    @Test
    public void doesGuestHaveLocalCurrency___false(){
        assertThat(kaiden.doesGuestHaveLocalCurrency()).isEqualTo(false);
    }
    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink

    @Test
    public void canServerMakeGuestFavouriteDrink___true(){
        Server server1 = new Server("Georgia", );
//        john.getFavouriteDrink("Guinness");
        boolean guestFavouriteDrink = server.whichDrinksServerMakes(john);
        assertThat(guestFavouriteDrink).isEqualTo(true);
    }
    //  (give server a list of drinks (strings) it can make)

}
