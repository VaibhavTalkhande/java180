public class StringMethods {
    public static void main(String[] args) {
        String name = "Vaibhav";
        String sentence = "  i am good boy ";
        int val = name.length();
        String low = name.toLowerCase();
        String upp = name.toUpperCase();
        System.out.println(val);
        System.out.println(low);
        System.out.println(upp);
        System.out.println(sentence.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('v','r'));
        System.out.println(name.replace("V","bh"));
        System.out.println(name.startsWith("V"));
        System.out.println(name.endsWith("av"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('v'));
        System.out.println(name.lastIndexOf('i'));
        System.out.println(name.equals(sentence));
        System.out.println(name.equalsIgnoreCase(upp));
        System.out.println("I am escape sequence\tdouble quote");
        System.out.println(sentence.replace(' ','_'));
        String letter = "Dear   <|name|>,  Thanks a lot";
        System.out.println(letter.replace("<|name|>","vaibhav"));
        //Write a Java program to detect double and triple spaces in a string.
        System.out.println(letter.indexOf(" "));
        System.out.println(letter.indexOf("   "));
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}