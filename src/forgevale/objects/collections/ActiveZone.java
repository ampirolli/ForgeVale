package forgevale.objects.collections;

import forgevale.objects.Card;
import forgevale.objects.CardCollection;
import java.util.ArrayList;

/**
 *
 * @author ampirolli
 */
public class ActiveZone extends CardCollection{
    
    private final Integer maxSize = 8;
    
    public ActiveZone(){
        this.setCollection(new ArrayList<Card>());
    }
    
    public void addCard(Card card, Hand hand){
        
        if(this.getCollection().size() < maxSize){
            this.getCollection().add(card);
            hand.getCollection().remove(card);
        }else{
            System.out.println("Cannot set more than 8 cards...");
        }
    
    }
    
    public void refreshCollection(GraveYard grave){
        
        ArrayList<Card> deadCards = new ArrayList<Card>();
        for(Card card : this.getCollection()){
            if(!card.isActive()){
                deadCards.add(card);
                grave.getCollection().add(card);
                
            }
        }
        for(Card deadCard : deadCards){
            
            this.getCollection().remove(deadCard);
        }
        
        
        
    }
    
}
