package workbook3.test456.service;

import workbook3.test456.dao.ReceiversDAO;
import workbook3.test456.dao.impl.ReceiversDAOimpl;
import workbook3.test456.entity.Receiver;

import java.util.ArrayList;

/**
 * Created by Natashka on 08.04.2015.
 */
public class ReceiversService {
    private ReceiversDAO receiversDAO = new ReceiversDAOimpl();

    public Receiver getReceiver(int id) {
        return receiversDAO.getReceiver(id);
    }

    public void addReceiver(Receiver receiver) {
        receiversDAO.addReceiver(receiver);
    }

    public ArrayList<Receiver> getReceivers() {
        return receiversDAO.getReceivers();
    }

}
