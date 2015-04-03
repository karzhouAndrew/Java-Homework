SELECT idExpense, paydate, nameReceiver, value
    FROM expenses,  receivers
    WHERE receiver = receivers.idReceiver
    AND value > 10000;