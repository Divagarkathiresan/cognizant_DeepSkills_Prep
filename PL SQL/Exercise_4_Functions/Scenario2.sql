create or replace function CalculateMonthlyInstallment(amount number,rate number,yeartopay number)
return number
as
    totalAmount number;
BEGIN
    totalAmount:=amount + (amount * ( rate / 100 ));
    return totalAmount/(yeartopay*12);
end;
/

-- DECLARE
--     amount number:=23000;
--     rate number:=3;
--     y number:=2;
-- BEGIN
--     dbms_output.put_line(CalculateMonthlyInstallment(amount,rate,y));
-- END;
-- /