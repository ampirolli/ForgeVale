package forgevale.objects.collections;

import forgevale.objects.Card;
import forgevale.objects.CardCollection;
import forgevale.objects.Player;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author ampirolli
 */
public class Deck extends CardCollection{
    
    private final Integer maxSize = 20;
    
    public Deck(){
        this.setCollection(new ArrayList<Card>());
    }
    
    public void addCard(Card card, Player player){
        if(this.getCollection().size() < maxSize){
            card.setPlayer(player);
            this.getCollection().add(card);
            
        }
    }
    
        public void buildCollection(ArrayList<Integer> cardNoList){
        for(Integer card: cardNoList){
            
        }
    }
    
    public void shuffleDeck(){
        long seed = System.nanoTime();
        Collections.shuffle(this.getCollection(), new Random(seed));
    }
    
    
    
}
