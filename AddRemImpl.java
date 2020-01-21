import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class AddRemImpl extends UnicastRemoteObject implements AddRem{

    /**
     *
     */
public AddRemImpl() throws RemoteException{};

    @Override
    public double add(final double x, final double y) throws RemoteException {
        // TODO Auto-generated method stub
        return x + y;
    }

    @Override
    public double sub(final double x, final double y) throws RemoteException {
        // TODO Auto-generated method stub
        return x - y;
    }

    @Override
    public double div(final double x, final double y) throws RemoteException {
        // TODO Auto-generated method stub
        if(y==0){
            return 0;
        }
        return x / y;
    }

    @Override
    public double mult(final double x, final double y) throws RemoteException {
        // TODO Auto-generated method stub
        return x*y;
    }

}
