package Enum;

public class CoinTest {
	public static void main(String [] args){
		for(int i = 0; i < 15; i++){
			System.out.println("Trial " + (i+1) + ": " + Coin.flip());
		}
	}
}
