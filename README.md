# Travel Cost Calculator Project

## Overview
This project is a simple Java program that calculates the travel cost based on user inputs for distance, age, and type of journey. The program factors in age-based discounts and provides an additional discount for round trips. This project serves as a good learning experience for beginners in Java, focusing on conditional logic, user input handling, and basic arithmetic operations.

## Features
- Prompts the user to enter travel distance, age, and type of journey.
- Calculates the normal cost of travel and applies age-based discounts.
- Applies an additional discount for round-trip travel.
- Displays the total discounted fare or an error message if inputs are invalid.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A Java code editor or IDE (e.g., IntelliJ, Eclipse, NetBeans, or VS Code).

### Running the Project
1. **Clone the Repository (Optional):** If the code is in a repository, clone it using:
   ```sh
   git clone <repository-url>
   ```

2. **Open the Code Editor/IDE:** Open your preferred Java IDE or code editor and create a new project named `TravelCostCalculator`.

3. **Create the Main Java File:** Create a new file named `Main.java` and copy the following code into it:
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           double mesafe;
           int yas;
           int yolculukTipi;
           double mesafeBasiUcret = 0.10, normalTutar;
           Scanner scanner = new Scanner(System.in);
           
           System.out.println("Enter the distance to be traveled (km): ");
           mesafe = scanner.nextDouble();
           
           System.out.println("Enter your age: ");
           yas = scanner.nextInt();
           
           double yasIndirimOrani = 0, yasIndirimi = 0, indirimliTutar = 0;
           System.out.println("Enter the type of journey (1 => One Way, 2 => Round Trip): ");
           yolculukTipi = scanner.nextInt();
           
           if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
               normalTutar = mesafe * mesafeBasiUcret;
               
               if (yas < 12) {
                   yasIndirimOrani = 0.5;
               } else if (yas >= 12 && yas < 24) {
                   yasIndirimOrani = 0.1;
               } else if (yas > 65) {
                   yasIndirimOrani = 0.3;
               }
               
               yasIndirimi = normalTutar * yasIndirimOrani;
               indirimliTutar = normalTutar - yasIndirimi;
               
               if (yolculukTipi == 2) {
                   indirimliTutar -= (indirimliTutar * 0.2);
                   indirimliTutar *= 2;
               }
               
               System.out.println("Total: " + indirimliTutar);
           } else {
               System.out.println("Invalid data entered!!");
           }
       }
   }
   ```

4. **Compile and Run:** Compile and run the program.
   ```sh
   javac Main.java
   java Main
   ```

5. **User Input:** The program will prompt you to enter the distance to be traveled, your age, and the type of journey. After entering the required information, it will calculate the total travel cost.

## Example
```
Enter the distance to be traveled (km):
300
Enter your age:
20
Enter the type of journey (1 => One Way, 2 => Round Trip):
2
Total: 48.0
```

## Explanation
- **Distance (km):** The user is prompted to enter the travel distance in kilometers.
- **Age:** The user's age is used to determine if they qualify for an age-based discount.
  - Under 12 years: 50% discount.
  - Between 12 and 24 years: 10% discount.
  - Over 65 years: 30% discount.
- **Journey Type:** The user can select either a one-way journey or a round trip.
  - If a round trip is selected, an additional 20% discount is applied and the total fare is doubled.
- The program calculates the final cost based on these inputs and displays the result.

## Author
- **Hekim Can Aktaş**

## License
This project is open-source and available under the [MIT License](LICENSE).

## Acknowledgments
- Thanks to the Java community for providing helpful resources and tutorials.
- Inspiration from basic Java exercises for learning conditionals and arithmetic operations.

