import java.rmi.*;
public interface AddRem extends Remote{
    public int add(int x , int y)throws RemoteException ;
    public int sub(int x ,int y) throws RemoteException;

    public int div(int x ,int y) throws RemoteException;
    public int mult(int x ,int y) throws RemoteException;

}