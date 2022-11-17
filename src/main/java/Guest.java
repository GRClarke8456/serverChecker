import DrinkList.Drinks;

import java.util.List;

public class Guest {

    //    Properties
    private String name;
    private int age;
    private double money;
    private int sobrietyMark;
    private String bannedOrNot;
    private char localCurrency;
    private List<Drinks> favouriteDrink;

//    Constructor
    public Guest(String name, int age, double money, int sobrietyMark,
                 String bannedOrNot, char localCurrency){
        this.name = name;
        this.age = age;
        this.money = money;
        this.sobrietyMark = sobrietyMark;
        this.bannedOrNot = bannedOrNot;
        this.localCurrency = localCurrency;
        this.favouriteDrink = favouriteDrink;
    }

//    Method
//    Need to check how much money the guest has
//    More than price

    public boolean canGuestBuyDrink(){
        //        how much does guest need
//        how much do they have
        double price = 5.00;
        double money = this.money;
//        does the guest have enough money
//        money is >= price
        if (money >= price){
            return true;
        }
        return false;
    }

    public boolean isTheGuestSober(){
        int sobrietyMark = this.sobrietyMark;
        if (sobrietyMark >= 50){
            return true;
        }
        return false;
    }

    public boolean isGuestBannedFromPub(){
        String bannedOrNot = this.bannedOrNot;
        if (bannedOrNot.equals("Allowed in")){
            return  true;
        }
        return false;
    }

    public boolean doesGuestHaveLocalCurrency(){
        char localCurrency = this.localCurrency;
        if (localCurrency == '£' || localCurrency == '€'){
            return true;
        }
        return false;
    }
//    Attempt at extension
    public List<Drinks> guestFavouriteDrink(){
//        List<Drinks> favouriteDrink = this.favouriteDrink;
        return this.favouriteDrink;
    }

//    Getters & Setters
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getMoney (){
        return money;
    }
    public void setMoney(double money){
        this.money = money;
    }

    public List<Drinks> getFavouriteDrink(){
        return favouriteDrink;
    }
}
