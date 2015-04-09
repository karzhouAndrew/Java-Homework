package classes.gift;

/**
 * Created by Natashka on 23.02.2015.
 */
public class Packager {


public Gift createGift (int itemsNumber){
    Gift gift=new Gift(itemsNumber);
   // gift.addItemToGift( );
    return gift;}
}