SELECT a.staff_name "Manager", count(b.staff_name) "Strenght"
FROM staff_master a, staff_master b
WHERE a.staff_code=b.staff_code
GROUP BY a.staff_code