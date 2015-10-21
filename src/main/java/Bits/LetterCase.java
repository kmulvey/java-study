package Bits;

public class LetterCase {
	public static enum Case { UPPER, LOWER};
	
	public static Case getCase(char input){
		if((input & 0x20) == 32) return Case.LOWER;
		return Case.UPPER;
	}
}
