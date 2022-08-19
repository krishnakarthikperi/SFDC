SELECT sm.staff_code "Staff#", sm.staff_name "Staff", dpt.dept_name "Departmanet", dsg.design_name "Designation"
FROM staff_master sm
INNER JOIN department_master dpt
ON sm.dept_code = dpt.dept_code
INNER JOIN designation_master dsg
ON sm.design_code = dsg.design_code
WHERE timestampdiff(MONTH,hiredate,curdate())