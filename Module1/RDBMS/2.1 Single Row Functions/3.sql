USE labassignmentdb;
SELECT staff_name "Staff Name", TIMESTAMPDIFF(MONTH,hiredate, curdate()) "Months Worked"
FROM staff_master
ORDER BY 'Months Worked';