/**
 * 
 */
package keyboard;

/**
 * @author macdja38
 *
 */
public class KeyboardTester {
	public static void main(String args[]) {
		System.out.println("Please input an Integer.");
		System.out.println(Keyboard.getInteger());
		System.out.println("Please input an Integer between -5 and 5.");
		System.out.println(Keyboard.getInteger(-5,5));
		System.out.println("Please input an Integer between -500 and 500 that's 3 digits.");
		System.out.println(Keyboard.getInteger(-500,500,3));
		System.out.println("Please input an Integer that's 3 digits.");
		System.out.println(Keyboard.getInteger(3));
	}
}
