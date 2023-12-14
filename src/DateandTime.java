import  java.util.*;
class DateandTime{
    public static void main(String[] args){
        Date d= new Date();
        System.out.println("The current date is : " + d);

        Date d1= new Date(1621709639111l);
        System.out.println("The date calculated form miliseconds is : " + d1);

        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : " + System.currentTimeMillis());
        System.out.println("Date and Time");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);


        Date d2= new Date(2021,12, 24);  //both dates are different
        System.out.println(d2.compareTo(d));
        Date d3= new Date(2021,5,23);

        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d3.getTime() );
        System.out.println("The number of seconds passed since Jan 1, 1970 :" +d3.getTime()/1000 );
        System.out.println("The number of minutes passed since Jan 1, 1970 :" +d3.getTime()/1000/60 );
        System.out.println("The number of hours passed since Jan 1, 1970 :" +d3.getTime()/1000/60/60 );
        System.out.println("The number of days passed since Jan 1, 1970 :" +d3.getTime()/1000/60/60/24 );
        System.out.println("The number of years passed since Jan 1, 1970 :" +d3.getTime()/1000/60/60/24/365 );
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getTimezoneOffset());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear());

    }
}