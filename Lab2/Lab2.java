import java.util.Scanner;

public class Lab2 {
  static String[] names = new String[1024];
  static int names_count = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int option;

    do {
      System.out.println("\nMenu");  // giving options for the menu driven code
      System.out.println("1. Enter a name");
      System.out.println("2. Search for a name");
      System.out.println("3. Remove a name");
      System.out.println("4. Show all names");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
        case 1:
          System.out.print("Enter a name: "); // adding the name into the program
          names[names_count] = scanner.nextLine();
          names_count += 1;
          System.out.println("Name added successfully");
          break;
        case 2:
          System.out.print("Enter a name to search: ");
          String searchName = scanner.nextLine();

          boolean name_found = false; // checking if the name to search is present
          int index = -1;
          for (int i = 0; i < names_count; i++) {
            if (names[i].equals(searchName)) {
              name_found = true;
              index = i;
              break;
            }
          }

          if (name_found) { 
            System.out.println("Name found at index: " + index); //checking for the name at the particular index
          } else {
            System.out.println("Name not found");
          }
          break;
        case 3:
          System.out.print("Enter a name to remove: ");
          String name_remove = scanner.nextLine();

          name_found = false;   // checking if the name to remove is present
          index = -1;
          for (int i = 0; i < names_count; i++) {
            if (names[i].equals(name_remove)) {
              name_found = true;
              index = i;
              break;
            }
          }

          if (name_found) {
            for (int i = index; i < names_count - 1; i++) {
              names[i] = names[i + 1];
            }
            names_count--;
            System.out.println("Name removed successfully !");
          } else {
            System.out.println("Name  is not in the list :(");
          }
          break;
        case 4:
          if (names_count == 0) {
            System.out.println("No names to show !!");
          } else {
            System.out.println("The list of all names is: ");
            for (int i = 0; i < names_count; i++) {
              System.out.println(names[i]);
            }
          }
          break;
        case 5:
          System.out.println("Exiting the code!");
          break;
        default:
          System.out.println("Invalid choice. Try again");
        }
      } while (option != 5);
    }
  }