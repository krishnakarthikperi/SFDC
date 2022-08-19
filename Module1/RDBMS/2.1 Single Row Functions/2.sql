USE labassignmentdb;
SELECT student_name "Student Name", DATE_FORMAT(student_dob,'%M, %d %Y') "Date of Birth"
FROM student_master
WHERE DAY(student_dob) IN ('Sunday','Saturday');