import java.rmi.*;
public class Server{

 public static void main(String args[]){
               
              try{
                   ServerImpl serverimpl = new ServerImpl();
                   Naming.rebind("server",serverimpl);
              }
              catch(Exception e){

                 System.out.println("Exception is:"+e);
             }
  }

}
