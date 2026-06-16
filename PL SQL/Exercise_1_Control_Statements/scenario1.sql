declare
    cursor cust_cursor is select CustomerID ,DOB , LastModified from Customers;
    id Customers.CustomerID%Type;
    dob Customers.DOB%Type;
    dates Customers.LastModified%Type;
    age number;
BEGIN
    open cust_cursor;
    LOOP
        fetch cust_cursor into id,dob,dates;
        exit when cust_cursor%notfound;

        age:=floor(months_between(sysdate,dob)/12);

            update Loans 
            set InterestRate=InterestRate-((1/100)*InterestRate)
            where age>60 and CustomerID=id;

    end loop;
    close cust_cursor;
end;
/

