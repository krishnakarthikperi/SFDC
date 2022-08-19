SELECT bt.staff_code "Staff#", sm.staff_name "Staff", dsg.design_name "Designation", dpt.dept_name "Department", bt.book_code "Book#", bm.book_name "Book",
CASE
WHEN DATEDIFF(curdate(),bt.book_expected_return_date)>0 THEN 5*DATEDIFF(curdate(),bt.book_expected_return_date)
ELSE 0
END "Fine"
FROM book_transactions bt
INNER JOIN staff_master sm
ON sm.staff_code = bt.staff_code
INNER JOIN  department_master dpt
ON sm.dept_code = dpt.dept_code
INNER JOIN  designation_master dsg
ON sm.design_code=dsg.design_code
INNER JOIN book_master bm
ON bm.book_code=bt.book_code;
