-- Find the number of employees
SELECT COUNT(emp_id) FROM employee;

-- Find the number of employees that have supervior
SELECT COUNT(super_id) FROM employee;

-- Find the number of female employees born after 1970.
SELECT COUNT(emp_id) FROM employee WHERE sex='F' AND birth_day > '1971-01-01';

-- Find the average of all employee's salaries.
SELECT AVG(salary) FROM employee;

-- Find the average of all employee's salaries where sex are male
SELECT AVG(salary) FROM employee WHERE sex = 'M';

-- Find the sum of the Employee Salaray.
SELECT SUM(salary) FROM employee;

-- Find out how many males and females there are.
SELECT COUNT(sex), sex FROM employee GROUP BY sex;

-- Find the total sales of each salesman
SELECT SUM(total_sales), emp_id FROM works_with GROUP BY emp_id;

-- Find the total amount of money each client spend 
SELECT SUM(total_sales), client_id FROM works_with GROUP BY client_id;



# WILDCARD IN SQL
/*

'%' = any number character, 
'_' = any one character

*/

-- Find any client's who are an LLC
SELECT * FROM client WHERE client_name LIKE '%LLC';

-- Find any branch suppliers who are in the label business
SELECT * FROM branch_supplier WHERE supplier_name LIKE '% Label%';

-- Find any employee born in October
SELECT * FROM employee WHERE birth_day LIKE '____-10%';

-- Find any clients who are schools
SELECT * FROM client WHERE client_name LIKE '%school%';



-- UNIONS IN SQL
-- Find a list of employee and brand name
SELECT first_name AS company_name FROM employee UNION SELECT branch_name FROM branch 
UNION SELECT client_name FROM client;

-- Find the list of all clients & branch supplier's names
SELECT client_name, client.branch_id FROM client UNION SELECT supplier_name, branch_supplier.branch_id FROM branch_supplier;

-- Find the list of all money spent or earned by the company
SELECT salary FROM employee UNION SELECT total_sales FROM works_with;


-- JOINS IN SQL
INSERT INTO branch VALUES(4, 'Buffalo', NULL, NULL);
SELECT * FROM branch;

-- Find all branches and names of their managers
SELECT employee.emp_id, employee.first_name, branch.branch_name FROM employee
JOIN branch ON employee.emp_id = branch.mgr_id; 

-- Types of Joins 1. Normal Join(Above).. 2. Left Join
SELECT employee.emp_id, employee.first_name, branch.branch_name FROM employee
LEFT JOIN branch ON employee.emp_id = branch.mgr_id;

-- 3. Right join
SELECT employee.emp_id, employee.first_name, branch.branch_name FROM employee
RIGHT JOIN branch ON employee.emp_id = branch.mgr_id;


--- NESTED QUERIES IN SQL
-- Find names of all employees who have sold over 30,000 to a single client
SELECT employee.first_name, employee.last_name FROM employee WHERE employee.emp_id IN (
    SELECT works_with.emp_id FROM works_with WHERE works_with.total_sales > 30000
);

-- Find all clients who are handled by the branch that Michael Scott manages, Assume you know Michael's ID
SELECT client.client_name FROM client WHERE client.branch_id = (
    SELECT branch.branch_id FROM branch WHERE branch.mgr_id = 102
    LIMIT 1
);



---- ON DELETE
# On delete set null
# On delete casket

# On delete set null
DELETE FROM employee WHERE emp_id = 102;
SELECT * FROM branch;
SELECT * FROM employee;

# On delete casket
DELETE FROM branch WHERE branch_id = 2;
SELECT * FROM branch_supplier;
