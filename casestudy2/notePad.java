package Assignment;

import java.io.FileWriter;

public class notePad {
    public static void main(String[] args) {

        try
        {
            FileWriter a=new FileWriter("C:\\Users\\hrachabattuni\\OneDrive - V-Soft Consulting Group, Inc\\Desktop\\Notpad program\\Hemanth.txt");
            a.write("Computer software, or just software, is a collection of computer programs and related data that provide the instructions for telling a computer what to do and how to do it.\n");
            a.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Success");
    }
}
