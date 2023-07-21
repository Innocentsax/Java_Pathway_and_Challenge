SELECT name, major FROM student ORDER BY name ASC;
SELECT name, major FROM student ORDER BY name DESC;
SELECT * FROM student ORDER BY major, student_id DESC;
SELECT * FROM student LIMIT 2;
SELECT * FROM student ORDER BY student_id DESC LIMIT 2;
SELECT * FROM student WHERE major='Biochemisty';
SELECT * FROM student WHERE major='Biochemisty' OR major='Physics';
SELECT * FROM student WHERE major='Biochemisty' OR name='Innocent';

/*
< -- LESS THAN
> -- GREATER THAN
<> -- NOT EQUAL
<= -- LESS THAN OR EQUAL TO
>= -- GREATER THAN OR EQUAL TO
*/

SELECT * FROM student WHERE student_id <=3;
SELECT * FROM student WHERE name IN ('Claire', 'Samuel', 'Innocent')
