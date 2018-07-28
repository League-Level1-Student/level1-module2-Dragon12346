import javax.swing.JOptionPane;

public class popcornMaker {
public static void main(String[] args) {
	/* Your mission and you have to accept it:
	 * Create a PopcornMaker class and add a main method to it that creates a bag of Popcorn and cooks it in the microwave.
	 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
	 *  Don't change the existing methods.
	 */
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn?");
	Popcorn P = new Popcorn(flavor);
	
	Microwave M = new Microwave();
	M.putInMicrowave(P);
	for (int i = 0; i < 21; i++) {
	P.applyHeat();
	}
	P.eat();
}
}
