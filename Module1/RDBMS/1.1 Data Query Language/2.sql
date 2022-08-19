USE labassignmentdb;
SELECT sm.staff_code "Staff Code", sm.staff_name "Name", dm.dept_code  "Department Number" 
FROM staff_master sm, department_master dm
WHERE datediff(curdate(),sm.hiredate)>=18
ORDER BY datediff(curdate(),sm.hiredate);