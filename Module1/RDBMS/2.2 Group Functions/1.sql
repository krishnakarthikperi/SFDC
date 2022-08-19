USE labassignmentdb;

SELECT max(staff_sal) "Highest", min(staff_sal) "Lowest", sum(staff_sal) "Total", avg(staff_sal) "Average"
FROM staff_master
GROUP BY dept_code;