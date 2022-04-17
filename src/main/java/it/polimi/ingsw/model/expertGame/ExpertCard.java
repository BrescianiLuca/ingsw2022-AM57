package it.polimi.ingsw.model.expertGame;

/**
 * This class implements the expert card system
 * @author Lorenzo Corrado
 */
public abstract class ExpertCard {
    protected int price;
    protected boolean played = false;
    public ExpertCard(int price){
        this.price = price;
    }

    /**
     *
     * @return the current price of the card
     */
    public int getPrice() {
        return price;
    }

    /**
     * Play the effect of the card
     */
    public void effect() throws NotExistingStudentException {}

    /**
     *
     * @return if the card has been played or not
     */
    public boolean isPlayed(){
        return played;
    }
}
