SELECT book_pub_author "Author", book_name "Book" 
FROM book_master
WHERE book_pub_author IN
	(SELECT bm.book_pub_author
    FROM book_master bm
    GROUP BY book_pub_author
    HAVING COUNT(book_pub_author)>1)