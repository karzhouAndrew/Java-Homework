package workbook3.test456.dao;

import workbook3.test456.entity.Receiver;

import java.util.ArrayList;

/**
 * Created by Natashka on 07.04.2015.
 */
public interface ReceiversDAO {
    Receiver getReceiver(int id);

    void addReceiver(Receiver receiver);

    ArrayList<Receiver> getReceivers();
}
