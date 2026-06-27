create or replace function CalculateAge(DOB in number)
return number
as
    age number;
begin
    age := 2026-DOB;
    return age;
end;
/