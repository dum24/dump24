import java.rmi.*;
import java.util.*;
public class Client{

       public static void main(String args[]){
             try{
              
                Scanner sc = new Scanner(System.in);
               String serverurl = "rmi://127.0.0.1/server";
            ServerIntf serverintf = (ServerIntf) Naming.lookup(serverurl);
               System.out.println("ENter FIrst number:");
               double num1 = sc.nextDouble();
               
                System.out.println("ENter second number:");
               double num2 = sc.nextDouble();
               
               System.out.println("ADDition is:"+serverintf.add(num1,num2));
               System.out.println("\nsubtration is:"+serverintf.Sub(num1,num2));
             }
             catch(Exception e){

                  System.out.println("Exception is:"+e);
             }
               
      }
}
