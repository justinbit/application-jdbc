# Employee Management Application 🚀

## Overview
The Employee Management Application is designed to streamline the process of managing employee information within an organization. This application allows you to maintain data related to employees, their functions, departments, and roles efficiently.

## Entities

### Employee
- **id** (int): Unique identifier for each employee.
- **firstName** (string): First name of the employee.
- **surname** (string): Surname or last name of the employee.
- **extension** (string): Employee extension within the organization.
- **telephone** (string): Employee's telephone contact.
- **department** (Department): Reference to the department in which the employee belongs.
- **function** (Function): Reference to the function or role of the employee.
- **roles** (List\<Role>): List of roles assigned to the employee.

### Function
- **id** (int): Unique identifier for each function.
- **name** (string): Name of the function or role.

### Department
- **id** (int): Unique identifier for each department.
- **name** (string): Name of the department.

### Role
- **id** (int): Unique identifier for each role.
- **name** (string): Name of the role.

## Project Structure
The project follows a modular structure with distinct entities representing key aspects of employee management. Here's a brief breakdown:

- **Employee Module**: Manages employee details, including personal information, department, function, and assigned roles.
- **Function Module**: Defines various functions or roles that employees can undertake.
- **Department Module**: Represents different departments within the organization.
- **Role Module**: Specifies the roles that employees can be assigned.

## Technology Stack
The application is implemented using Java and utilizes the following technologies:
- **Java**: Core programming language.
- **Database**: Utilizes SQL for data storage and retrieval.
- **Object-Relational Mapping (ORM)**: Implements ORM concepts for efficient database interaction.

## How to Use
1. **Employee Creation**: Add new employees with their personal details, department, function, and assigned roles.
2. **Function and Role Management**: Define various functions and roles that employees can undertake.
3. **Department Setup**: Establish different departments within the organization.

This Employee Management Application aims to provide a structured and efficient solution for handling employee-related information. Feel free to customize and extend the application based on your organizational needs! 🌐👥