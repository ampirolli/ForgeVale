package forgevale.objects;

/**
 *
 * @author Ampirolli & Helka
 */
public class Card {

    private Player player;
    
    private Integer cardNo;
    private String name;
    private String description;
    private String PassiveAbilityDescription;
    private Integer health;
    private Integer attack;
    private Integer manaCost;
    private boolean isInPlay;
    private boolean isActive;

    public Card(){
        //nothing
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassiveAbilityDescription() {
        return PassiveAbilityDescription;
    }

    public void setPassiveAbilityDescription(String PassiveAbilityDescription) {
        this.PassiveAbilityDescription = PassiveAbilityDescription;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getManaCost() {
        return manaCost;
    }

    public void setManaCost(Integer manaCost) {
        this.manaCost = manaCost;
    }

    public boolean isInPlay() {
        return isInPlay;
    }

    public void setInPlay(boolean isInPlay) {
        this.isInPlay = isInPlay;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void executeAttack(Card opponent){
        if(this.isActive() == true){
            attacked(opponent);
        }
        else{
            System.out.println(this.getName() + " cannot attack because this card is inactive");
        }

    }
    public void attacked(Card opponent) {
        opponent.takesDamage(this);
        this.takesDamage(opponent);
    }

    public void takesDamage(Card opponent){
        damagedBy(opponent);

        //Must be at the end of every takesDamage iteration.
        if(this.getHealth() <= 0){
            this.setActive(false);
            System.out.println(opponent.getName() + " has defeated " + this.getName());
        }

    }
    
    public void damagedBy(Card opponent){
        this.health = this.health - opponent.attack;
    }

    public void passiveAbility(){
    //to be overridden in child class
    }
    
    public void passiveAbility(Card opponent){
    //to be overridden in child class
    }
    
    public void set(){
        
        
    }

	
}
