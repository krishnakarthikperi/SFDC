SELECT bt.staff_code "Staff#", sm.staff_name "Staff", dpt.dept_name "Departmanet"
FROM book_transactions bt
INNER JOIN staff_master sm
ON bt.staff_code = sm.staff_code
INNER JOIN  department_master dpt
ON sm.dept_code = dpt.dept_code
WHERE bt.staff_code IN
	(SELECT bt1.staff_code
    FROM book_transactions bt1
    GROUP BY bt1.staff_code
    HAVING COUNT(bt1.staff_code)>1)