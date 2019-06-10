import javax.swing.JOptionPane;//this import allows us to use the JOptionPane class which displays a graphical user interface to interact with.

public class BMICheck {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter name:");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
		// The two user inputs name and age are unnecessary to complete the BMI
		// calculation but are a good way to demonstrate string and int data types
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height (m):"));
		// User inputs their height which is then used to calculate their BMI, using the
		// double data type
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter weight (Kg):"));
		// User inputs their weight which is then used to calculate their BMI, using the
		// double data type
		double bmi = weight / (height * height);
		// This formula calculates the users BMI, using the double data type
		JOptionPane.showMessageDialog(null, "Hello " + name + "!"); // Shows earlier user input when asked for name
		JOptionPane.showMessageDialog(null, "You are " + age + " and your body mass index is " + bmi + ".");
		// Displays dialog box with age and their calculated BMI.

		//These if and else if statements take the BMI double and spit out a message depending on the value.
		//Alternatively you can just use all if statements, e.g
		// if bmi <=18.5{ x}
		// if bmi >=18.5 && bmi<=24.9{ x}
		// etc.
		if (bmi <= 18.5) {// Determining if their BMI is equal to or under 18.5 (meaning they are under
							// weight)
			JOptionPane.showMessageDialog(null, "This classifies you as under weight. ");
		}

		else if (bmi >= 18.5 && bmi <= 24.9) {
			// Using the 'logical and' to determine a range that is to be assigned as
			// healthy weight range
			// If BMI is equal to or larger than 18.5 but lower than or equal to 24.9,
			// they are assigned this classification.
			// This method is more accurate than using just <25 as you get the specific decimal places as well.
			// This means people who are on the cusp of either category can get a more accurate placement.
			JOptionPane.showMessageDialog(null, "You are in a healthy weight range!");
		}

		else if (bmi >= 25 && bmi <= 29.9) {// Same as above but with different ranges
			JOptionPane.showMessageDialog(null, "You are classified as being overweight.");
		}

		else { // if there is anything other than those ranges, apply 'obese' classification
			JOptionPane.showMessageDialog(null, "You are classified as being obese.");
		}

	}
}
