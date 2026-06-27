create or replace procedure ProcessMonthlyInterest
as 
begin 
    update Accounts
    set Balance = Balance + ( Balance * (1/100))
    where AccountType='Savings';

    commit;

    dbms_output.put_line('Accounts table updated');

end;
/

Exec ProcessMonthlyInterest;


select * from Accounts;