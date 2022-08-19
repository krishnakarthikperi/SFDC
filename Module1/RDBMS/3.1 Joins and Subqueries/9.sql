SELECT sm.student_code "Student#", sm.student_name "Student", dm.dept_name "Department"
FROM student_master sm
INNER JOIN department_master dm
ON sm.dept_code=dm.dept_code
INNER JOIN
	(SELECT sm1.dept_code HighDeptCode
    FROM student_master sm1
    GROUP BY sm1.dept_code
    ORDER BY count(sm1.student_code) DESC
    LIMIT 1) HighDept
ON HighDept.HighDeptCode = sm.dept_code
