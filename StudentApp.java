// Import ArrayList from java.util package to store multiple Student objects

// Import Scanner from java.util package to take input from the user

// Create a class named StudentApp

// Inside the class, write the main method

// Inside the main method:
// Create an empty ArrayList to store Student objects
// Create a Scanner object to take user input

// Use an infinite loop (while true) so the menu keeps repeating

// Display the menu options:
// 1. Add Student
// 2. View Students
// 3. Update Student
// 4. Delete Student
// 5. Exit

// Ask the user to enter their choice

// Use a switch statement to perform actions based on the user's choice


// --------------------------------------------------
// OPTION 1: ADD STUDENT
// Ask the user to enter:
// - Id (integer)
// - Name (string)
// - Age (integer)
// - Course (string)

// Use sc.nextLine() after numeric input:
// To clear the input buffer before reading String values

// Create a new Student object using the entered details

// Add the new Student object to the ArrayList

// Display confirmation message:
// "Student added successfully!"
// --------------------------------------------------


// --------------------------------------------------
// OPTION 2: VIEW STUDENTS
// Print a heading like "Student List:"

// Use a for-each loop to:
// Access each Student object from the ArrayList
// Print each Student using System.out.println()

// Note for students:
// Printing the object directly will call the toString() method
// --------------------------------------------------


// --------------------------------------------------
// OPTION 3: UPDATE STUDENT
// Ask the user to enter the Student ID to update

// Search for the student inside the ArrayList using a loop

// If no student matches the given ID:
// Print "Student not found!"

// If the student is found:
// Ask the user to enter new values for:
// - Name
// - Age
// - Course

// Use setter methods to update the student details:
// setName()
// setAge()
// setCourse()

// Display confirmation message:
// "Student updated successfully!"
// --------------------------------------------------


// --------------------------------------------------
// OPTION 4: DELETE STUDENT
// Ask the user to enter the Student ID to delete

// Search for the student inside the ArrayList using a loop

// If no student matches the given ID:
// Print "Student not found!"

// If the student is found:
// Remove the student object from the ArrayList

// Display confirmation message:
// "Student deleted successfully!"
// --------------------------------------------------


// --------------------------------------------------
// OPTION 5: EXIT
// Print exit message:
// "Exiting program..."

// Stop the program using System.exit(0)
// --------------------------------------------------


// If the user enters any invalid option:
// Display "Invalid choice. Try again."
