SELECT staff_code "Staff#", staff_name "Staff", staff_sal "Salary"
FROM staff_master
WHERE staff_sal<(SELECT AVG(sm2.staff_sal) FROM staff_master sm2);