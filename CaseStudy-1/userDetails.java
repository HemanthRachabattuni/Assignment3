package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class users {
    String PhoneNumber;
    String Email;
    String FirstName;
    String LastName;
    String Address;
    String Country;

    public users(String Email, String FirstName, String LastName, String Address, String Country, String PhoneNumber) {
        this.Email = Email;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Country = Country;
        this.PhoneNumber=PhoneNumber;
    }
}

public class userDetails
{
    public static void main(String args[])
    {
        users e1=new users("H@Gmail.com","Hemanth","R","Tenali","India","9581986516");
        users e2=new users("p@gmail.com","Praveen","K","Rajamundry","India","1111111111");
        users e3=new users("s@gmail.com","preetham","P","Hyderabad","India","2222222222");
        users e4=new users("m@gmail.com","sravani","M","Bapatla","India","3333333333");
        users e5=new users("t@gmail.com","Sneha","T","Tenali","India","4444444444");
        users e6=new users("a@gmail.com","Akanksha","R","Gudavalli","India","5555555555");
        users e7=new users("c@gmail.com","Priya","M","Gudavalli","India","6666666666");
        users e8=new users("n@gmail.com","Naresh","A","Tenali","India","7777777777");
        users e9=new users("rt@gmail.com","Teja","R","Tenali","India","8888888888");
        users e10=new users("mm@gmail.com","Madhavi","R","Tenali","India","9999999999");


        ArrayList<users>usr=new ArrayList<>();
        usr.add(e1);
        usr.add(e2);
        usr.add(e3);
        usr.add(e4);
        usr.add(e5);
        usr.add(e6);
        usr.add(e7);
        usr.add(e8);
        usr.add(e9);
        usr.add(e10);
        userDetails UD=new userDetails();
        UD.printUsers(usr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the phone Number ");
        String a=sc.next();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Email ");
        String b=sc1.next();
        UD.byEmailAndPhone(usr,a,b);


    }


    public void  printUsers(ArrayList<users>usr)
    {
        for (users i:usr)
        {
            System.out.println(i.FirstName+" "+i.LastName+" "+i.Email+" "+i.Address+" "+i.Country+" "+i.PhoneNumber);
        }
    }

    public void byEmailAndPhone(ArrayList<users>usr,String a,String b)
    {
        for(users j:usr)
        {
            if (((a).equals(j.PhoneNumber))&&(b).equals(j.Email))
            {
                System.out.println(" the details of user     "+j.FirstName+" "+j.LastName+" "+j.Email+" "+j.Address+" "+j.Address+" "+j.PhoneNumber);
            }
        }
    }

}
