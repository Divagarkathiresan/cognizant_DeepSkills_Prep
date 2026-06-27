create or replace function CalculateAge(dob in Date)
return number
as
    age number;
begin
    age:=floor(months_between(sysdate,dob)/12);
    return age;
end;
/