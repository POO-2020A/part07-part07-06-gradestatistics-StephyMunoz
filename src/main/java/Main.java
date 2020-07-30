
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        int sumGrades = 0;
        int counter = 0;
        int counterPassing = 0;
        int sumGradesPassing = 0;
        int c1 = 0, c2 = 0, c3 =0, c4 = 0, c5 = 0, c6 = 0;
        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());
            if (grade == -1) {
                break;
            } else if ((grade >= 0) && (grade <= 100)) {
                sumGrades += grade;
                counter++;
                if (grade >= 50) {
                    sumGradesPassing += grade;
                    counterPassing++;

                }
                if(grade < 50){
                    c1++;
                } else if(grade < 60){
                    c2++;
                } else if(grade < 70){
                    c3++;
                } else if(grade < 80){
                    c4++;
                } else if(grade < 90){
                    c5++;
                } else if(grade >= 90){
                    c6++;
                }
            }
            
        }
        double passing;
        double average;
        if(counter > 0){
            average = (double) sumGrades / counter;
           System.out.println("Point average (all): " + average); 
        }
        

        if (counterPassing == 0) {
            System.out.println("Point average (passing): -");
        } else if(counterPassing > 0) {
            passing = (double) sumGradesPassing / counterPassing;
            System.out.println("Point average (passing): " + passing);
        }

        if (counter > 0) {
            if(sumGrades > 0){
            double percentagePassing = (double)100 * counterPassing / counter;
            System.out.println("Pass percentage: " + percentagePassing);
            }
        } else if(counterPassing == 0){
            System.out.println("Pass percentage: 0.0");
    }
        System.out.println("Grade distribution: ");

        System.out.println("");
        System.out.print("5:");
        for(int i=1; i<=c6; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("4:");
        for(int i=1; i<=c5; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("3:");
        for(int i=1; i<=c4; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("2:");
        for(int i=1; i<=c3; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("1:");
        for(int i=1; i<=c2; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("0:");
        for(int i=1; i<=c1; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
