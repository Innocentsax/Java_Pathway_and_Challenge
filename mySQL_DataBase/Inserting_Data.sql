#DROP TABLE student;
CREATE TABLE student(
    student_id INT AUTO_INCREMENT,
    name VARCHAR(20),
    major VARCHAR(20),
    PRIMARY KEY(student_id)
);
SELECT * FROM student;

INSERT INTO student(name, major) VALUES('Jack', 'Biology');
INSERT INTO student(name, major) VALUES('Kate','Sociology');
INSERT INTO student(name, major) VALUES('Innocent', 'Physics');
INSERT INTO student(name, major) VALUES('Samuel', 'Botany');
INSERT INTO student(name, major) VALUES('Oluwa', 'Python');
INSERT INTO student(name, major) VALUES('Chioma', 'Node');

#INSERT INTO student VALUES(4, 'Jack', 'Biology');
#INSERT INTO student VALUES(5, 'Mike', 'computer Science');
