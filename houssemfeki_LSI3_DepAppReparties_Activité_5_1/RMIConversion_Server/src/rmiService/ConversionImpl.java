package rmiService;

import java.rmi.RemoteException;

public class ConversionImpl implements IConversion {

    public double convertirMontant(double mt) throws RemoteException {
        return mt * 1.17;
    }

}

