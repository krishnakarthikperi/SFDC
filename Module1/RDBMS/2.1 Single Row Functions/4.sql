USE labassignmentdb;
SELECT * FROM staff_master
WHERE MONTH(hiredate)=12 
AND DAY(hiredate)>15;