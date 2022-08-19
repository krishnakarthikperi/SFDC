select sm.staff_name "Staff Name", sm.dept_code "Department Code", dm.dept_name "Department Name"
FROM staff_master sm
JOIN department_master dm
ON sm.dept_code=dm.dept_code
WHERE sm.staff_sal>20000;