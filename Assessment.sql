CREATE TABLE students (
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(30) UNIQUE,
  age INT,
  marks DECIMAL
)
INSERT INTO
  students
VALUES
  (
    1,
    'Rahul ',
    'rahul123456@gmail.com',
    22,
    98
  ),
  (
    2,
    'Priya ',
    'priya@gmail.com',
    21,
    95
  ),
  (
    3,
    'Akash ',
    'akash@gmail.com',
    23,
    85
  )
;



SELECT
  *
FROM
  students
;



DROP TABLE courses
;



-- Q2: Fetch student details where age > 21. 
SELECT
  *
FROM
  students
WHERE
  age > 21
;



-- Q3: Update the email of the student with id = 1 to  'rahul@gmail.com'. 
UPDATE students
SET
  email = 'rahul@gmail.com'
WHERE
  id = 1
;



-- Q4: Delete all students with age < 18. 
DELETE FROM students
WHERE
  age < 18
;



-- Q5: Find the second highest score student details. 
SELECT
  marks
FROM
  students
ORDER BY
  marks DESC
LIMIT
  1
OFFSET
  1
;



-- Q6: Write a query to display student names and their enrolled course  names. 
CREATE TABLE courses (
  course_id INT,
  student_id INT,
  course_name VARCHAR(50),
  FOREIGN key (
    student_id
  ) REFERENCES students (id)
)
;



INSERT INTO
  courses
VALUES
  (
    101,
    1,
    'Java'
  ),
  (
    102,
    2,
    'Python'
  ),
  (
    103,
    1,
    'SQL'
  )
;



SELECT
  *
FROM
  courses
;



SELECT
  *
FROM
  students
ORDER BY
  id ASC
;