import java.util.Scanner;

public class Exercise1_1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("enter total subjects");
        int total_sub = inp.nextInt();
        System.out.print("enter total mark of each subject");
        int marks = inp.nextInt();
        int total_marks = total_sub*marks;
        int score=0;
        for (int i=0; i<total_sub;i++){
            System.out.print("enter your mark of you obtain :");
            score+= inp.nextInt();
        }
        float percentage = ((float) score /total_marks)*100;
        System.out.print("the percentage you have scored is :"+percentage);


    }
}
