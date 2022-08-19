SELECT dept_code "Department Code", sum(staff_sal) "Sum of Salary of all Non-managers"
FROM staff_master
WHERE staff_code NOT IN 
	(SELECT a.dept_code
	FROM staff_master a, staff_master b 
	WHERE a.staff_code=b.mgr_code)
GROUP BY dept_code
HAVING sum(staff_sal)>20000;