package forgevale.objects.collections;

import forgevale.objects.Card;
import forgevale.objects.CardCollection;
import java.util.ArrayList;

/**
 *
 * @author ampirolli
 */
public class GraveYard extends CardCollection{
    
    public GraveYard(){
        this.setCollection(new ArrayList<Card>());
    }
    public void addCard(Card card){
        this.getCollection().add(card);
    }
    
   
    
}
