package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class KitPup extends Card{
    
    public KitPup(){
        this.setName("KitPup");
        this.setDescription("KitPup is the product of a horrible gene splicing experiment.\n"
                            + "The testing caused the fusion of a cat and a dog into one being.\n"
                            + "Still adjusting to their new body, the duo now seeks revenge\n"
                            + "on those that have wronged them.");
        this.setPassiveAbilityDescription("One Two: KituPup may attack twice per turn.");
        this.setAttack(4);
        this.setHealth(4);
        this.setManaCost(4);
        this.setActive(true);
    }
    
}
