-- -- adding the column to customers
alter table Customers
add IsVIP varchar(5);

DECLARE
    CURSOR add_vip_status IS
    SELECT CustomerID,Balance from Customers;

    id Customers.CustomerID%Type;
    balance Customers.Balance%Type;

BEGIN
    OPEN add_vip_status;
    loop
        fetch add_vip_status into id,balance;
        exit when add_vip_status%notfound;
        if balance > 10000 THEN
            update Customers
            set IsVIP='TRUE'
            where CustomerID=id;
        else
            update Customers
            set IsVIP='FALSE'
            where CustomerID=id;
        end if;
    end loop;
    CLOSE add_vip_status;

    commit;
END;
/