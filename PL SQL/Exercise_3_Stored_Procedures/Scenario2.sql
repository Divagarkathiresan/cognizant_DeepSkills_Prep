create or replace procedure UpdateEmployeeBonus
(
    dept varchar2,
    bonus number
)
as 
begin
    update Employees 
    set Salary=Salary+bonus
    where Department=dept;
    commit;
    dbms_output.put_line('Employee salary updated');
end;
/

exec UpdateEmployeeBonus('Finance',1000);

