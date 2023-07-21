SELECT * FROM student;

UPDATE student
SET major = 'Bio' WHERE major = 'Biology';

UPDATE student SET major = 'Phycis'
WHERE student_id = 2;

UPDATE student SET name = 'Charles' WHERE student_id=1;

UPDATE student SET major='Biochemisty' WHERE major='Bio' OR major='chemistry';

# DELETE
DELETE FROM student WHERE student_id=2;
