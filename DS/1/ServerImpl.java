import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
       
       
      public ServerImpl() throws RemoteException{
      
      }
      
      public double add(double num1,double num2)throws RemoteException{
                return num1+num2;
        }
   public double Sub(double num1,double num2)throws RemoteException{
            
            if(num1>num2){
                 return num1-num2;
            }
            else{
                 return num2-num1;
           }
   }
}
