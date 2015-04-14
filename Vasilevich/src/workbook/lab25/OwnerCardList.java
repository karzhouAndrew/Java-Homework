package workbook.lab25;

import added.lab9.FirstNameEnum;
import added.lab9.LastNameEnum;

import java.util.ArrayList;

/**
 * Created by vasilevich on 03.03.2015.
 */
public class OwnerCardList {

    private ArrayList<OwnerCard> ownerCardSet = new ArrayList<OwnerCard>();


    public OwnerCardList() {

    }

    public OwnerCard addOwnerCard() {
        OwnerCard ownerCard;
        ownerCard = new OwnerCard(FirstNameEnum.generateFirstName(), LastNameEnum.generateLastName());
        if (ownerCardSet.add(ownerCard)) {
            return ownerCard;
        }
        return null;
    }


//    public boolean addCreditCardToOwner(String firstName, String secondName){
//        Iterable<OwnerCard> ownerCardIterable = (Iterable<OwnerCard>) ownerCardSet.iterator();
//
//        while (ownerCardIterable.iterator().hasNext()){
//            OwnerCard ownerCard =ownerCardIterable.iterator().next();
//            while (ownerCard.equals(new OwnerCard(firstName, secondName))){
//                ownerCard.addCreditCard()
//           }
//       }
//    }


}
