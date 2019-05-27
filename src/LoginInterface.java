
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginInterface  extends Remote
{    
    boolean checkLogin(String id,String pwd)throws RemoteException;
}
