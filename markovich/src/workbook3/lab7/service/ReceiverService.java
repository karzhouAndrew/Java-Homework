package workbook3.lab7.service;

import workbook3.lab7.database.dao.ReceiverDAO;
import workbook3.lab7.database.dao.ReceiverDAOImpl;
import workbook3.lab7.entity.Receiver;

import java.util.List;

public class ReceiverService {
    private ReceiverDAO receiverDAO;

    public ReceiverService() {
        receiverDAO = new ReceiverDAOImpl();
    }

    public void addReceiver(Receiver receiver) {
        receiverDAO.addReceiver(receiver);
    }

    public void deleteReceiver(Receiver receiver) {
        receiverDAO.deleteReceiver(receiver);
    }

    public void updateReceiver(Receiver receiver) {
        receiverDAO.updateReceiver(receiver);
    }

    public List<Receiver> getReceivers() {
        return receiverDAO.getReceivers();
    }
}
