public class Swimmer {
	// Private variables to store swimmer's information
	private String name;
	private String lastName;
	private int age;
	private int trainingUnits;

// Constructor to initialize a Swimmer object with the provided name, last name, and age
// It also calculates the training units based on the age
public Swimmer(String name, String lastName, int age) {
	this.name = name;
	this.lastName = lastName;
	this.age = age;
	this.trainingUnits = calculateTrainingUnits(age);
}

// Private method to calculate the number of training units based on the swimmer's age
// Based on knowlage from guide for coaches
private int  calculateTrainingUnits(int age) {
	if (age == 14 || age == 15) {
		return 8;
	} else if (age == 16 || age == 17) {
		return 11;
	} else if (age == 18) {
		return 12;
	} else if (age == 19) {
		return 13;
	} else if (age > 20 && age < 25) {
		return 14;
	} else {
		return -1;
	}
}

// Getter method for the swimmer's first name.
public String getName() {
	return name;
}

// Getter method for the swimmer's last name.
public String getLastName() {
	return lastName;
}

// Getter method for the swimmer's age.
public int getAge() {
	return age;
}

// Getter method for the swimmer's training units.
public int getTrainingUnits() {
	return trainingUnits;
}

// Overridden toString method to provide a string representation of the Swimmer object.
// It returns a message indicating the recommended training units or if the age is out of range.
@Override
public String toString() {
	if (trainingUnits == -1) {
		return "This program is for swimmers aged 14 to 25.";
	} else {
		return name + " " + lastName + " should have " + trainingUnits + " training units per week.";
	}
}
}
