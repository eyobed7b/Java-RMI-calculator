import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class AddRemImpl extends UnicastRemoteObject implements AddRem{

    /**
     *
     */
public AddRemImpl() throws RemoteException{};

    @Override
    public int add(final int x, final int y) throws RemoteException {
        // TODO Auto-generated method stub
        return x + y;
    }

    @Override
    public int sub(final int x, final int y) throws RemoteException {
        // TODO Auto-generated method stub
        return x - y;
    }

    @Override
    public int div(final int x, final int y) throws RemoteException {
        // TODO Auto-generated method stub
        return x / y;
    }

    @Override
    public int mult(final int x, final int y) throws RemoteException {
        // TODO Auto-generated method stub
        return x*y;
    }

}
