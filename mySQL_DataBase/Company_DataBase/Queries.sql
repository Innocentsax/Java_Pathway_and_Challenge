-- Find all employee
SELECT * FROM employee;
SELECT * FROM client;

-- Find all employees ordered by salary
SELECT * FROM employee ORDER BY salary DESC;

-- Find all employee ordered by sex then name;
SELECT * FROM employee ORDER BY sex, first_name, last_name;

-- Find the first 5 employees in the table
SELECT * FROM employee LIMIT 5;

-- Find the first and last names of all employee
SELECT first_name, last_name FROM employee;

-- Find the forename and surnames names of all employees
SELECT first_name AS forename, last_name AS surname FROM employee;

-- Find out all the different gender
SELECT DISTINCT sex FROM employee;
