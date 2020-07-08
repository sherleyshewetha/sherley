import java.util.Scanner;

public class Seasons {
    public static void main(String args[]) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();
// if(number>12)
//{
//System.out.println("Season doesn't exist");
//}
//else
//{
switch(number)
{ 
case 1:
System.out.println("WINTER");
break;
case 2:
System.out.println("WINTER");
break;
case 3:
System.out.println("SPRING");
break;
case 4:
System.out.println("SPRING");
break;
case 5:
System.out.println("SPRING");
break;
case 6:
System.out.println("SUMMER");
break;
case 7:
System.out.println("SUMMER");
break;
case 8:
System.out.println("SUMMER");
break;
case 9:
System.out.println("AUTUMN");
break;
case 10:
System.out.println("AUTUMN");
break;
case 11:
System.out.println("AUTUMN");
break;
case 12:
System.out.println("WINTER");
break;
default: 
System.out.println("Season doesn't exist");
break; 
}
}
}
