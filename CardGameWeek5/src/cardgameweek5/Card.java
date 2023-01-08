/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgameweek5;

/**
 *
 * @author Megha Patel
 * @author Daniel Reyes number Student 991639714
 
     * This property allows us to preserve our code and reuse it,
     * we use ENUM. In its simplest form, an enumeration is a list of named constants that define a new data type. 
     * An object of an enumeration type can only contain the values defined by the list.
     * So an ENUM gives you a way to precisely define a new data type that has a fixed number of valid values. 
     * This option allows us to reuse our code and only change constant values without altering our base code for the card game.
     
    
     * Our code complies with the Single Responsibility principle,this is because the task of our code is to deliver a hand of cards.
     * This allows us to reuse the code for a UNO game, where we only change the values of our cards and the number total cards our hand.
     * This is achieved because our code only has a final purpose.
     * 
     **/
 
public class Card {
    
    public enum Suit{
    RED,YELLOW,GREEN,BLUE
    }
    public enum Value{
        CERO,ONE, TWO, THREE,FOUR,FIVE,SIX,
        SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD
    }    
    
    //ENUM
    private final Suit suit;
    private final Value value;
    public Card(Suit suit,Value value)
    {
        this.suit=suit;
        this.value=value;
    }
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }
}
