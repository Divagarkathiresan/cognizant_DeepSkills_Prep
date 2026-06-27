-- create or replace function generate_id
-- return number 
-- as 
-- max_id number;
-- BEGIN
--     select max(ID) into max_id from Student;
--     return max_id+1;
-- end;
-- /

-- DECLARE
--     v_id Student.ID%Type;
-- BEGIN
--     v_id:=generate_id;
--     insert into Student values(v_id , 'Student_' || v_id);
-- end;
-- /


-- select * FROM Student;

-- declare
--     total number;
-- begin
--     total:=10/0;
--     DBMS_OUTPUT.PUT_LINE('Total is ' || total);
-- exception
--     when others then
--         DBMS_OUTPUT.PUT_LINE('Cannot divide by zero');
-- end;
-- /

Create or replace procedure UpdateName(name in out varchar2)
AS
BEGIN
    name := 'Mr. '||name;
end;
/

DECLARE
    v_name VARCHAR2 := 'Diva';
BEGIN

    UpdateName(v_name);

    DBMS_OUTPUT.PUT_LINE(v_name);

END;
/

declare 
begin 

    update Customers 
    set Name=UpdateName('Divagar')
    where CustomerID=1;
    
    dbms_output.put_line('Updated');
    commit;
end;
/

select * from Customers;