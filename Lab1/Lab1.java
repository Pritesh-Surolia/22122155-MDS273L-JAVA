import java.util.*; 

 public class Lab1 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       int age = obj.nextInt();
       obj.nextLine();
       String name = obj.nextLine();
       String gender = obj.nextLine();
       String state = obj.nextLine();

       System.out.println("The age is: " + age);
       System.out.println("The name is: " + name); 
       System.out.println("The gender is: " + gender); 
       System.out.println("The state is: " + state);

       if (gender.equals("m")) {
        System.out.println("Gender: MALE");
    } else if (gender.equals("f")) {
        System.out.println("Gender: FEMALE");
    }
    switch (state) {
        case "Tamil Nadu":
        case "Kerala":
        case "Andhra Pradesh":
        case "Karnataka":
            System.out.println("The Student is from the southern state of India");
            System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);
            break;
        case "Rajasthan":
        case "Haryana":
        case "Jammu & Kashmir":
            System.out.println("The student is from Northern state of India");
            System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);
            break;
        case "Gujarat":
        case "Goa":
        case "Maharashtra":
             System.out.println("The student is from Western state of India");
             System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);
             break;
        case "Assam":
        case "Bihar":
        case "Nagaland":
        case "Mizoram":
             System.out.println("The student is from Eastern state of India");    
             System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);    
        default:    
            System.out.println("Other region");
    }
      
    }
 }
 