USE labassignmentdb;
SELECT sm.staff_name "Name", dm.design_code "Designation Code"
FROM staff_master sm, designation_master dm
WHERE sm.hiredate<"2000-01-01" AND (sm.staff_sal BETWEEN 12000 AND 250000);