package forgevale.objects;

import forgevale.objects.collections.GraveYard;
import forgevale.objects.collections.Deck;
import forgevale.objects.collections.Hand;

/**
 *
 * @author ampirolli
 */
public class Player {
    
    private String playerName;
    private Integer playerHealth;
    private Integer playerMana;
    private Integer playerScore;
    private Integer damageDone;
    private Integer manaUsed;
    private Integer cardsPlayed;
    private boolean hasDrawnFirstHand;
    
    private final Integer maxHealth = 30;
    private final Integer maxMana = 20;
    
    private Deck deck;
    private Hand hand;
    private GraveYard grave;
    
    public Player(String name){
        
        this.playerName = name;
        this.playerHealth = 30;
        this.playerMana = 10;
        this.playerScore = 0;
        this.damageDone = 0;
        this.manaUsed = 0;
        this.cardsPlayed = 0;
        hasDrawnFirstHand = false;
        
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(Integer playerHealth) {
        this.playerHealth = playerHealth;
    }
    
    public Integer getPlayerMana() {
        return playerMana;
    }

    public void setPlayerMana(Integer playerMana) {
        this.playerMana = playerMana;
    }

    public Integer getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(Integer playerScore) {
        this.playerScore = playerScore;
    }

    public Integer getDamageDone() {
        return damageDone;
    }

    public void setDamageDone(Integer damageDone) {
        this.damageDone = damageDone;
    }

    public Integer getManaUsed() {
        return manaUsed;
    }

    public void setManaUsed(Integer manaUsed) {
        this.manaUsed = manaUsed;
    }

    public Integer getCardsPlayed() {
        return cardsPlayed;
    }

    public void setCardsPlayed(Integer cardsPlayed) {
        this.cardsPlayed = cardsPlayed;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    public GraveYard getGrave() {
        return grave;
    }

    public void setGrave(GraveYard grave) {
        this.grave = grave;
    }
    
    public void accumulateMana(){
        if(this.playerMana < maxHealth){
            this.playerMana = this.playerMana + 1;
        }
    }
    
    
    
    public void drawCard(){
        
        if(!hasDrawnFirstHand){
            this.hand = new Hand();
            int i;
            for(i = 0; i < 5; i++){
                this.hand.drawCard(this.deck);
            }
            hasDrawnFirstHand = true;

        }else{
            this.hand.drawCard(this.deck);
        }
    
    }
    
    public void shuffleDeck(){
        this.deck.shuffleDeck();
    }
    
    
}
