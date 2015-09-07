import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Chr_PrExercise1{  
static final double PI = 3.14156;   
    public static void main(String[] args) throws FileNotFoundException    
    {
        Scanner inFile = new Scanner(new FileReader("inData.txt"));
        PrintWriter outFile = new PrintWriter("outData.txt");
        
        double length, width, radius, balance, rate, area, perimeter, cirArea,
               circumference, balance_endmonth;
        int age;
        String first_name, last_name;
        char letter;
        length = inFile.nextDouble();
        width = inFile.nextDouble();
        radius = inFile.nextDouble();
        first_name = inFile.next();
        last_name = inFile.next();
        age = inFile.nextInt();
        balance = inFile.nextDouble();
        rate = inFile.nextDouble();
        letter = inFile.next().charAt(0);
        
        area = length * width;
        perimeter = 2 * (length + width);
        cirArea = PI * (radius * radius);
        circumference = 2 * PI * radius;
        balance_endmonth = balance * ((rate / 1200) + 1);
        
        
        
        outFile.printf("Rectangle: %nLength = %.2f, width = %.2f, area = %.2f," 
                     + " Perimeter: %.2f%n%n", length, width, area, perimeter);
        outFile.printf("Circle: %nRadius: %.2f, area = %.2f, circumference = "
                     + "%.2f%n%n", radius, cirArea, circumference);
        outFile.printf("Name: %s %s, age: %d %nBeginning balance = $%.2f, "
                     + "interest rate = %.2f %nBalance at the end of the month "
                     + "= $%.2f%n%n", first_name, last_name, age, balance, rate, 
                       balance_endmonth);
        outFile.printf("The character that comes after %c in the ASCII set is "
                     + "%c", letter, ++letter);
        outFile.close();
                        

        
    }
    
}
