// Sangwon Song
// CMPE202 SJSU Spring 2019
// Lab1
import java.util.Arrays;

public class GumballMachine
{

    private int num_gumballs; // capcity of the gumball machine
    private int price_gumball; // price per gumballs
    private int[] coin_acceptable; // coins acceptable for each machine
    private int money_left; // left money in the machine 

    public GumballMachine( int capacity, int price, int[] acceptable )
    {
        // initialise instance variables
        this.num_gumballs = capacity;
        this.price_gumball = price;
        this.coin_acceptable = acceptable;
        this.money_left = 0;
    }

    public void insertQuarter(int coin)
    {
        if(Arrays.binarySearch(this.coin_acceptable, coin) >= 0){
            this.money_left += coin;
            System.out.println(coin + " cents are inserted");
        }
        else {
            System.out.println("The acceptable coins for this mahchine are " + Arrays.toString(this.coin_acceptable));
        }
    }

    public void turnCrank()
    {
    	if(this.price_gumball == this.money_left){
            if(this.num_gumballs > 0){
                this.num_gumballs--;
                System.out.println("You inserted "+this.money_left+" cents. Gumball Ejected!");
                this.money_left = 0; //set to default since the gumball has ejected;
            }
            else{
                System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
            }
        }
        else{
            System.out.println("Please insert coins for "+this.price_gumball+" cents.");
        }
    }
}
