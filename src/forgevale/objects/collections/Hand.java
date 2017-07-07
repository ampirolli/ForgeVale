package forgevale.objects.collections;

import forgevale.objects.Card;
import forgevale.objects.CardCollection;
import java.util.ArrayList;

/**
 *
 * @author ampirolli
 */
public class Hand extends CardCollection{

    private final Integer maxSize = 8;
    
    public Hand(){
        this.setCollection(new ArrayList<Card>());
    }
    
    public void addCard(Deck deck){
        if(this.getCollection().size() < maxSize){
            this.getCollection().add(deck.getCollection().get(0));
            deck.getCollection().remove(0);
        }else{
            System.out.println("Cannot draw more than 8 cards...");
        }
    }
    
    
    
    
    
}
