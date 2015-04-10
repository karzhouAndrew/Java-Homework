package workbook3.lab7.database.dao;

import workbook3.lab7.entity.Receiver;

import java.util.List;

public interface ReceiverDAO {

    void addReceiver(final Receiver receiver);

    void deleteReceiver(final Receiver receiver);

    void updateReceiver(final Receiver receiver);

    List<Receiver> getReceivers();

}
