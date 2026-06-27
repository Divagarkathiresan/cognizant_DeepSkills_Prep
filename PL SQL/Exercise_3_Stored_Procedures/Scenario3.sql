create or replace procedure TransferFunds(senderAccount number,receiverAccount number,amount number)
as
    InvalidBalance exception;
    balance number;
begin 
    select Balance into balance
    from Accounts 
    where AccountID=senderAccount;

    if balance<amount then 
        raise InvalidBalance;
    else
        update Accounts 
        set Balance=Balance-amount
        where AccountID=senderAccount;

        update Accounts 
        set Balance=Balance+amount
        where AccountID=receiverAccount;

        commit;
        dbms_output.put_line('Updated');
    end if;

exception
    when InvalidBalance then
        dbms_output.put_line('Invalid balance');
end;
/

exec TransferFunds(101,102,500);