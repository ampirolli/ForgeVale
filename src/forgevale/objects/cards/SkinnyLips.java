package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class SkinnyLips extends Card{
    
     public SkinnyLips() {
        this.setName("Skinny Lips");
        this.setDescription("Growing up with no friends or family, Skinny Lips\n"
                          + "has had no one. He trusts no one, only his faithful\n"
                          + "Hounds.");
        this.setPassiveAbilityDescription("Man's Best Friend: When Skinny Lips dies,\n"
                                        + "summon a 2/2 Hound.");
        this.setAttack(2);
        this.setHealth(3);
        this.setManaCost(3);
        this.setActive(true);
     }

}
