create or replace function get_square(
    num number
)
return number
as
begin
    return num * num;
end;
/

select get_square(5) as square_of_5 from dual;