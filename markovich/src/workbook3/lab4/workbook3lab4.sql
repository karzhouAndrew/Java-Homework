-- Вывести список получателей платежей, и сумму платежей по каждому из них.
SELECT nameReceiver, SUM(value) 
FROM expenses, receivers 
WHERE receiver = receivers.idReceiver GROUP BY receiver;

-- Вывести сумму платежей за тот день, когда был наибольший платеж
SELECT paydate, SUM(value) 
FROM expenses WHERE paydate = (
		SELECT paydate 
		FROM expenses WHERE value = (
				SELECT MAX(value) val 
				FROM expenses
		)
);

-- Вывести наибольший платеж за тот день, когда сумма платежей была наибольшей.
SELECT * FROM (
		SELECT paydate pd2, value val FROM expenses exp2, (
				SELECT exp1.pd pd1, MAX(exp1.sumval) FROM (
						SELECT paydate pd, SUM(value) sumval 
						FROM expenses exp1 GROUP BY pd
				) exp1
		) exp3 
		WHERE paydate = exp3.pd1
) exp4 ORDER BY exp4.val DESC LIMIT 1;