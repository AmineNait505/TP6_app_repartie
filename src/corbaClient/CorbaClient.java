package corbaClient;

import javax.naming.Context;
import javax.naming.InitialContext;

import corbaConversion.IconversionRemote;
import corbaConversion.IconversionRemoteHelper;
public class CorbaClient {

    public static void main(String[] args) {
        try {
            Context ctx =new InitialContext();
            Object ref=ctx.lookup("0D");
            IconversionRemote stub=IconversionRemoteHelper.narrow((org.omg.CORBA.Object)ref);
            double result = stub.convertirMontnant(100.0); // Replace with your actual method and arguments
            double result2 = stub.convertirMontnant(70.0); // Replace with your actual method and arguments
            System.out.println("Result1 from remote method: " + result);
            System.out.println("Result2 from remote method: " + result2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
