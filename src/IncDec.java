public class IncDec {
    public static void main(String[] args) {
        int a= 0;
        int b= a++;
        int c= a;
        int d= ++a;
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
        System.out.println("b="+b+"c="+c+"d="+d);
    }
}
