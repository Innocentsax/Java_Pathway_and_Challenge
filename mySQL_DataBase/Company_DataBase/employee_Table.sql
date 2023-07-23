CREATE TABLE employee(
    emp_id INT PRIMARY KEY, 
    first_name VARCHAR(40),
    last_name VARCHAR(40), 
    birth_day DATE, sex VARCHAR(1),
    salary INT, super_id INT, branch_id INT
);

ALTER TABLE employee ADD FOREIGN KEY(branch_id)
REFERENCES branch(branch_id) ON DELETE SET NULL;

ALTER TABLE employee ADD FOREIGN KEY(super_id)
REFERENCES employee(emp_id) ON DELETE SET NULL;
