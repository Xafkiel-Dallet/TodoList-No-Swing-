import java.util.ArrayList;
import java.util.Scanner;
public class Todolist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <String> tasks=new ArrayList<>();
        
        int choice;
        
        do{
            System.out.println("Choose action: ");
            System.out.println("1. Create Tasks.");
            System.out.println("2. View Tasks.");
            System.out.println("3. Remove Tasks.");
            System.out.println("4. Terminate Session.");
            choice=sc.nextInt();
            
            switch (choice){
                case 1:
                System.out.println("Enter your task:  ");
                String task=sc.nextLine();
                tasks.add(task);
                System.out.println("Task added.");
                
                break;
                
                case 2:
                System.out.println("Your current tasks: ");
                if(tasks.isEmpty()){
                    System.out.println("There is no task/s yet.");
                }
                
                
                break;
                
                case 3:
                
                break;
                
                
                default:
                System.out.println("Invalid Input. Please choice from the choices only.");
                break;
                
                
            }
            
            
            
        }while(choice!=4);
        
        System.out.println("You terminate the program. Goodbye.");
        
    }
    
}
