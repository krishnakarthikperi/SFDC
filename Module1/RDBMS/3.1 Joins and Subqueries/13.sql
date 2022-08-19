SELECT dm.dept_code "Department#", dm.dept_name "Department", count(stf.staff_code)+count(std.student_code) "Strength"
FROM department_master dm
INNER JOIN student_master std
ON std.dept_code=dm.dept_code
INNER JOIN staff_master stf
ON stf.dept_code=dm.dept_code
GROUP BY dm.dept_code