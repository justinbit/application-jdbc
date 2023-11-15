CREATE TABLE Role (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE EmployeeFunction (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Department (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Employee (
    id INT PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    extension VARCHAR(255),
    telephone VARCHAR(255),
    department_id INT,
    function_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(id),
    FOREIGN KEY (function_id) REFERENCES EmployeeFunction(id)
);

CREATE TABLE EmployeeRole (
    employee_id INT,
    role_id INT,
    PRIMARY KEY (employee_id, role_id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (role_id) REFERENCES Role(id)
);

-- Alter the Role table
ALTER TABLE Role
MODIFY COLUMN id INT AUTO_INCREMENT;

-- Alter the EmployeeFunction table
ALTER TABLE EmployeeFunction
MODIFY COLUMN id INT AUTO_INCREMENT;

-- Alter the Department table
ALTER TABLE Department
MODIFY COLUMN id INT AUTO_INCREMENT;

-- Alter the Employee table
ALTER TABLE Employee
MODIFY COLUMN id INT AUTO_INCREMENT;

-- Alter the EmployeeRole table (assuming MySQL, you might need to adjust for other databases)
ALTER TABLE EmployeeRole
MODIFY COLUMN employee_id INT AUTO_INCREMENT,
MODIFY COLUMN role_id INT AUTO_INCREMENT;
