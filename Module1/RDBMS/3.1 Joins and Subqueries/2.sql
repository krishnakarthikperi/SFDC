select sm.staff_code "Staff#", sm.staff_name "Staff", dm.dept_name "Department Name", dm.dept_name "Department Name", sm2.staff_code "Mgr#", sm2.staff_name "Manager"
FROM staff_master sm
INNER JOIN department_master dm
ON sm.dept_code=dm.dept_code
JOIN staff_master sm2
ON sm.staff_code=sm2.mgr_code;
