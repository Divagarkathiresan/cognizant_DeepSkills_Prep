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

select * from Loans;
