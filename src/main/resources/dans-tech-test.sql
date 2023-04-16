
--1. Recapitulation of number of accounts owned by every customer.
select distinct
(c.cust_id),concat(c.cust_firstname,' ',c.cust_lastname) ,a.acc_number ,a.acc_date_created ,a.acc_balance
from public.customer c
inner join public.account a on c.cust_id = a.acc_owner

--All transactions created by John Michael sorted by account number and transaction date
select * from public."transaction" t
inner join public.account a on t.trs_from_account = a.acc_number
inner join customer c on c.cust_id = a.acc_owner
where c.cust_firstname = 'John' and c.cust_lastname = 'Michael' order by a.acc_number , t.trs_date