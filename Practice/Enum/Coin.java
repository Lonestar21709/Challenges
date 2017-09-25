package Enum;

public enum Coin {

	HEADS, TAILS;
	
	public static Coin flip(){
		if(Math.random() < .5){
			return Coin.HEADS;
		}
		else{
			return Coin.TAILS;
		}
	}
}
