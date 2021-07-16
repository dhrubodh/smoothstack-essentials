use library;

-- 1
SELECT tbl_book_copies.noOfCopies,tbl_library_branch.branchName
FROM tbl_book
Inner Join tbl_book_copies on tbl_book_copies.bookId = tbl_book.bookId
Inner Join tbl_library_branch on tbl_library_branch.branchId = tbl_book_copies.branchId
WHERE Title='The Lost Tribe' AND BranchName='Sharpstown';



-- 2--
SELECT tbl_book_copies.noOfCopies,tbl_library_branch.branchName
FROM tbl_book
Inner Join tbl_book_copies on tbl_book_copies.bookId = tbl_book.bookId
Inner Join tbl_library_branch on tbl_library_branch.branchId = tbl_book_copies.branchId
WHERE Title='The Lost Tribe';


-- 3
SELECT name
FROM library.tbl_borrower
WHERE  cardNo not in (select cardNo from library.tbl_book_loans);


-- 4
SELECT tbl_book.title,tbl_borrower.name,tbl_borrower.address
FROM tbl_book_loans
Inner Join tbl_borrower on tbl_borrower.cardNo = tbl_book_loans.cardNo
Inner Join tbl_book on tbl_book.bookId = tbl_book_loans.bookId
Inner join tbl_library_branch on tbl_library_branch.branchId = tbl_book_loans.branchId
WHERE branchName = 'Sharpstown' and date(dueDate)= '2018-04-08 ';


-- 5
SELECT tbl_library_branch.branchName, count(*)
FROM tbl_library_branch, tbl_book_loans
WHERE tbl_book_loans.branchId = tbl_library_branch.branchId
group by tbl_library_branch.branchId;


-- 6
SELECT tbl_borrower.name,tbl_borrower.address, count(*)
FROM tbl_borrower, tbl_book_loans
WHERE tbl_borrower.cardNo = tbl_book_loans.cardNo
group by tbl_borrower.cardNo
having count(*) > 5;


-- 7
Select tbl_book.title, tbl_book_copies.noOfCopies
from tbl_author
Inner Join tbl_book on tbl_author.authorId = tbl_book.authID
Inner Join tbl_book_copies on tbl_book_copies.bookId = tbl_book.bookId
Inner Join tbl_library_branch on tbl_book_copies.branchId = tbl_library_branch.branchId
where tbl_author.authorName = 'Stephen King' and tbl_library_branch.branchName = 'Central'
