CREATE TABLE receivers(
    idReceiver INT NOT NULL PRIMARY KEY,
    nameReceiver VARCHAR(255)
);

INSERT INTO receivers VALUES(1, 'Интернет-провайдер "Соло"');
INSERT INTO receivers VALUES(2, 'Гипермаркет "Корона"');
INSERT INTO receivers VALUES(3, 'МТС');

CREATE TABLE expenses(
    idExpense INT NOT NULL PRIMARY KEY,
    paydate DATE,
    receiver INT,
    value DEC
);

INSERT INTO expenses VALUES(1, '10.5.2011', 1, 20000.0);
INSERT INTO expenses VALUES(2, '10.5.2011', 2, 94200.0);
INSERT INTO expenses VALUES(3, '11.5.2011', 3, 10000.0);
INSERT INTO expenses VALUES(4, '11.5.2011', 2, 12950.0);
