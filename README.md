# 🚀 Employee Management System (Full Stack)

## 📌 Overview

This is a **Full Stack Employee Management System** built using **Spring Boot (Backend)** and **React JS (Frontend)**.
It allows users to perform complete CRUD operations (Create, Read, Update, Delete) on employee data.

---

## 🧩 Tech Stack

### 🔹 Backend:

* Java 17
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL

### 🔹 Frontend:

* React JS
* Axios
* HTML, CSS

### 🔹 Tools:

* Git & GitHub
* Eclipse (Backend)
* VS Code (Frontend)

---

## ⚙️ Features

* ✅ Add Employee
* ✅ View All Employees
* ✅ Update Employee Details
* ✅ Delete Employee
* ✅ REST API Integration
* ✅ Full Stack Architecture

---

## 📁 Project Structure

```
EmployeeManagementSystem/
│
├── employee-management-system   # Spring Boot Backend
└── employee-frontend            # React Frontend
```

---

## 🚀 How to Run

### 🔹 Backend (Spring Boot)

1. Open project in Eclipse
2. Run as **Spring Boot Application**
3. Server starts at:

```
http://localhost:8080
```

---

### 🔹 Frontend (React)

```bash
cd employee-frontend
npm install
npm start
```

👉 Runs at:

```
http://localhost:3000
```

---

## 🌐 API Endpoints

| Method | Endpoint              | Description        |
| ------ | --------------------- | ------------------ |
| GET    | `/api/employees`      | Get all employees  |
| POST   | `/api/employees`      | Create employee    |
| GET    | `/api/employees/{id}` | Get employee by ID |
| PUT    | `/api/employees/{id}` | Update employee    |
| DELETE | `/api/employees/{id}` | Delete employee    |

---

## 🔗 Integration

The frontend communicates with backend using REST APIs via Axios.

Example:

```javascript
axios.get("http://localhost:8080/api/employees");
```

---

## 🎯 Learning Outcomes

* Implemented layered architecture (Controller → Service → Repository)
* Integrated React frontend with Spring Boot backend
* Used Hibernate ORM for database operations
* Handled CORS and API communication issues
* Used Git for version control

---

## 🚧 Future Improvements

* 🔹 Add Authentication (JWT)
* 🔹 Add Pagination & Search
* 🔹 Improve UI with Bootstrap / Material UI
* 🔹 Deploy on cloud (AWS / Render)

---

## 👨‍💻 Author

**Pratham Shah**

---

