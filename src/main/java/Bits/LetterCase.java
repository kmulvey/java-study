package Bits;

public class LetterCase {
	public static enum Case { UPPER, LOWER};
	
	public static Case isLowercase(char input){
		if((input & 0x20) == 32) return Case.LOWER;
		return Case.UPPER;
	}
}
