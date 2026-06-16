-- update Loans set EndDate = Date '2024-01-10' where LoanID=201;
-- commit;

declare 
    cursor give_message_for_loan is 
    select CustomerID,StartDate,EndDate from Loans;

    id Loans.CustomerID%type;
    Sdate Loans.StartDate%type;
    Edate Loans.EndDate%type;
    days number;
begin 
    open give_message_for_loan;
    loop 
        fetch give_message_for_loan into id,Sdate,Edate;
        exit when give_message_for_loan%notfound;
        days:=floor(Edate-Sdate);
        if days < 30 then 
            DBMS_OUTPUT.PUT_LINE(
                'Message to ' || id || ' to pay the loan amount with in '||days
            );
        end if;
    end loop;
    close give_message_for_loan;
end;
/