import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
String userName=	JOptionPane.showInputDialog("What is your name?");
if(userName.equalsIgnoreCase("Matt")) {
	JOptionPane.showMessageDialog(null, "Is super tall");
	
}
else if(userName.equalsIgnoreCase("Timmy")) {
	JOptionPane.showMessageDialog(null, "Loves Cats");
}

if(userName.equalsIgnoreCase("Cathy")) {
	JOptionPane.showMessageDialog(null, "Can kind of draw");
}
if(userName.equalsIgnoreCase("My")) {
	JOptionPane.showMessageDialog(null, "Can't draw either");
}
if(userName.equalsIgnoreCase("JC")) {
	JOptionPane.showMessageDialog(null, "Can kind of draw too");
}
if (userName.equalsIgnoreCase("Gabriel")){
	JOptionPane.showMessageDialog(null, "Can't Draw");
}

}
}
