import java.util.Scanner;

public class student{

    public static void main(String[]args){

        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        String [] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }

        for(int i=0;i<n;i++){
            System.out.println("Student at index "+(i+1)+ "is " + names[i] );
                        

        }
        sc.close();

    }
}