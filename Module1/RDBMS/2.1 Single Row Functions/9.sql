USE labassignmentdb;
SELECT student_code "Student Code", studnet_name "Student Name",
CASE
WHEN dept_code = 20 THEN "Electriclas"
WHEN dept_code = 30 THEN "Electronics"
ELSE "Others"
END
FROM student_master;