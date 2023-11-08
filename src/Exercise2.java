import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //1. check output
        int a = 10;
        if (a==11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");
        //2. Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter mark of subject");
        int sub_mark = inp.nextInt();
        int total_marks= sub_mark*3;
        System.out.println("enter mark of subject:");
        int sub1= inp.nextInt();
        System.out.println(sub1);
        System.out.println("sub2:");
        int sub2 = inp.nextInt();
        System.out.println("sub3");
        int sub3 = inp.nextInt();

        float sub1_per = (float) sub1/sub_mark * 100;
        System.out.println(sub1_per);
        float sub2_per = (float) sub2/sub_mark*100;
        System.out.println(sub2_per);
        float sub3_per = (float)sub3/sub_mark*100;
        System.out.println(sub3_per);
        float score_per=(float) (sub1+sub2+sub3)/total_marks*100;
        System.out.println(score_per);
        String result;
        if(score_per>40&&sub1_per>33&&sub2_per>33&&sub3_per>33)
            result= "Pass";
        else
            result="fail";
        switch (result){
            case "Pass" :
                System.out.println("you are pass");
                break;
            case "fail":
                System.out.println("you are fail");
                break;
            default:
                System.out.println("no");

        }

    }
}
