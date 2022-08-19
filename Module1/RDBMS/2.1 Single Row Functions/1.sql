USE labassignmentdb;
SELECT staff_name "Staff Name", CONCAT('$',LPAD(staff_sal,15,0)) "Salary"
FROM staff_master;