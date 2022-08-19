SELECT a.dept_code "Department Code", count(a.staff_code) "Total Number of Managers"
FROM staff_master a, staff_master b 
WHERE a.staff_code=b.mgr_code
GROUP BY a.dept_code;