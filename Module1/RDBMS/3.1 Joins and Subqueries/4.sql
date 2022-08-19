SELECT bt.staff_code "Staff#", sm.staff_name "Staff", dpt.dept_name "Department", dsg.design_name "Designation", bt.book_code "Book#", bm.book_name "Book"
FROM book_transactions bt
INNER JOIN staff_master sm
ON sm.staff_code = bt.staff_code
INNER JOIN  department_master dpt
ON sm.dept_code = dpt.dept_code
INNER JOIN  designation_master dsg
ON sm.design_code=dsg.design_code
INNER JOIN book_master bm
ON bm.book_code=bt.book_code
WHERE datediff(curdate(),bt.book_issue_date)<31;