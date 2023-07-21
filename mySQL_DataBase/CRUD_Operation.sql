/*INT     -- Whole Numbers
DECIMAL(M, N)   -- Decimal Numbers - Exact Value
VARCHAR(String of character)      -- String of text of length 1
BLOB            -- Binary Large Object, stores large data
DATE            -- 'YYYY - MM - DD'
TIMESTAMP       -- 'YYYY-MM-DD.  HH:MM:SS' - used for recording*/

CREATE TABLE student (
    student_id INT PRIMARY KEY,
    name VARCHAR(20),
    major VARCHAR(20)
    /* PRIMARY KEY(student_id) */
);

DESCRIBE student; # Display Table

DROP TABLE student; #Delete Table

ALTER TABLE student ADD gpa DECIMAL(3,2); # Update the Table

ALTER TABLE student DROP COLUMN gpa; # Delete a single column
