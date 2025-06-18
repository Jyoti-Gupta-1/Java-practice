import java.util.Scanner;

public class age{
    public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
System.out.println("enter the number of students:");
int n = scanner.nextInt();

int [] ages = new int[n];

for (int i=0;i<n;i++){
    System.out.println("enter the age of student " + (i + 1) + ":");
    ages[i] = scanner.nextInt();    

    System.out.println("Student" + (i + 1) + " age is: " + ages[i]);
}
    scanner.close();

}
}