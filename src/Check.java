
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Check extends UnicastRemoteObject implements LoginInterface{
    
    public Check()throws Exception{}
    
    @Override
    public boolean checkLogin(String id,String pwd) throws RemoteException
    {
        if(id.equals("bharat") && pwd.equals("123"))
            return true;
        else
            return false;
    }
    
}
