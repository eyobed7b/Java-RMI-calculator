import java.net.*;
import java.rmi.*;
import java.io.*;
import java.util.*;

public class AddClient{
    public static void main(final String[] args) throws RemoteException, MalformedURLException, NotBoundException {
       
        final String host = "localhost";
        final Scanner in = new Scanner(System.in);
        int ch;
        System.out.printf("1. Add \n 2. sub \n 3. div \n 4. mult \n");
        ch = in.nextInt();

        int num1, num2;
    

       

     System.out.printf(" \n Enter the first number \n");
     num1 = in.nextInt();
     System.out.printf("  Enter the first number \n");
     num2 = in.nextInt();
     try{
        AddRem remobj = (AddRem) Naming.lookup("rmi://" + host + "/AddRem");
        switch(ch){
            case 1:
            System.out.printf("the result is "+ remobj.add(num1, num2));
            break;
            case 2:
            System.out.printf("the result is "+ remobj.sub(num1, num2));
            break;
            case 3:
            System.out.printf("the result is "+ remobj.div(num1, num2));
            break;
            case 4:
            System.out.printf("the result is "+ remobj.mult(num1, num2));
            break;

        }
     }catch(RemoteException e){
         System.out.print(e);
     }

// switch(ch){
//     case 1:
//     System.out.printf(" \n Enter the first number \n");
//      num1 = in.nextInt();
//      System.out.printf("  Enter the first number \n");
//      num2 = in.nextInt();
//      try{
//         System.out.printf("\n The result is "+ remobj.add(num1,num2));
//      }catch(RemoteException e){
//          System.out.print(e);
//      }

//     break;
//     case 2:
//     System.out.printf(" \n Enter the first number \n");
//      num1 = in.nextInt();
//      System.out.printf("  Enter the first number \n");
//      num2 = in.nextInt();
//     break;
//     case 3:
//     System.out.printf(" \n Enter the first number \n");
//      num1 = in.nextInt();
//      System.out.printf("  Enter the first number \n");
//      num2 = in.nextInt();
//     break;
//     case 4:
//     System.out.printf(" \n Enter the first number \n");
//      num1 = in.nextInt();
//      System.out.printf("  Enter the first number \n");
//      num2 = in.nextInt();
//     break;



}

    }

