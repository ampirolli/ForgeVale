package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class BoneATor extends Card{
    
    public BoneATor(){
        this.setName("Bone-A-Tor");
        this.setDescription("Bone-A-Tor is a being evil to the very core, set on enslaving\n"
                             + "all of Forgevale. With the help of his HenchMen,"
                             + "he may stand a chance.");
        this.setPassiveAbilityDescription("HenchMen: Bone-A-Tor summons three loyal\n" 
                                        + "1/1 henchmen when played.");
        this.setAttack(5);
        this.setHealth(2);
        this.setManaCost(5);
        this.setActive(true);
    }
    
}
