package forgevale.objects.collections;

import forgevale.objects.Card;
import forgevale.objects.CardCollection;
import java.util.ArrayList;

/**
 *
 * @author anthonypirolli
 */
public class ActiveZone extends CardCollection{
    
    private final Integer maxSize = 8;
    
    public ActiveZone(){
        this.setCollection(new ArrayList<Card>());
    }
    
    public void addCard(Card card, Hand hand){
        
        if(this.getCollection().size() < maxSize){
            this.getCollection().add(card);
            hand.getCollection().remove(hand.getCollection().indexOf(card));
        }else{
            System.out.println("Cannot set more than 8 cards...");
        }
    
    }
    
}
