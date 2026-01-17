// Import ArrayList from java.util package to store multiple Student objects

// Import Scanner from java.util package to take input from the user

// Create a class named StudentApp

// Inside the class, write the main method

// Inside the main method:
// Create an empty ArrayList to store Student objects
// Create a Scanner object for user input

// Use an infinite loop (while true) so the menu keeps repeating

// Display the menu options to the user:
// 1. Add Student
// 2. View Students
// 3. Update Student
// 4. Exit

// Ask the user to enter their choice

// Use a switch statement to perform actions based on the user's choice

// --------------------------------------------------
// If choice is 1 (Add Student):
// Ask the user to enter:
// - Id (integer)
// - Name (string)
// - Age (integer)
// - Course (string)

// Use sc.nextLine() after reading numbers:
// To clear the input buffer before reading String input

// Create a new Student object using the entered values

// Add the Student object to the ArrayList

// Display a success message:
// "Student added successfully!"
// --------------------------------------------------


// --------------------------------------------------
// If choice is 2 (View Students):
// Print a heading like "Student List:"

// Use a for-each loop to:
// Access each Student object from the ArrayList
// Print each student using System.out.println()

// Note for students:
// Printing the object directly will call the toString() method
// --------------------------------------------------


// --------------------------------------------------
// If choice is 3 (Update Student):
// Ask the user to enter the Student ID to update

// Search for the student inside the ArrayList using a loop

// If no matching student is found:
// Print "Student not found!"

// If the student is found:
// Ask the user to enter new values for:
// - Name
// - Age
// - Course

// Use setter methods to update the student data:
// setName()
// setAge()
// setCourse()

// Display confirmation message:
// "Student updated successfully!"
// --------------------------------------------------


// --------------------------------------------------
// If choice is 4 (Exit):
// Print exit message
// Stop the program using System.exit(0)
// --------------------------------------------------


// If the user enters any invalid option:
// Display "Invalid choice. Try again."


