import java.net.*;
import java.rmi.*;

public class AddServer {
    public static void main(String[] args) throws MalformedURLException, RemoteException, AlreadyBoundException {
        AddRemImpl locobj = new AddRemImpl();
        Naming.bind("rmi:///AddRem",locobj);
        System.out.print("Server is running");
        
    }
}