SELECT bt.student_code "Student#", sm.student_name "Student", bt.book_code "Book#", bm.book_name "Book"
FROM book_transactions bt
INNER JOIN student_master sm
ON bt.student_code = sm.student_code
INNER JOIN book_master bm
ON bt.book_code=bm.book_code
WHERE bt.book_expected_return_date = curdate(); 