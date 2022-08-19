SELECT * 
FROM book_master
WHERE (YEAR(book_pub_year) BETWEEN 2001 AND 2004)
AND book_name REGEXP '\&';