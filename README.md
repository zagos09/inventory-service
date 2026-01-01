# Inventory Service API 📦

A RESTful API for managing product inventory, built with Java and Spring Boot.

## 🚀 Technologies Used
* **Java 17**
* **Spring Boot 3** (Web, Data JPA)
* **H2 Database** (In-Memory SQL Database)
* **Lombok** (Boilerplate reduction)

## ⚙️ Features
This API allows you to perform CRUD operations on products:
* **Create** new products.
* **Read** all products.
* **Delete** products by ID.

## 🔌 API Endpoints

Base URL: `http://localhost:8080/api/products`

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/api/products` | Get a list of all products |
| **POST** | `/api/products` | Add a new product |
| **DELETE** | `/api/products/{id}` | Delete a product by ID |

## 🧪 How to Test (Using Terminal)

### 1. Add a Product (POST)
```bash
curl -X POST http://localhost:8080/api/products \
-H "Content-Type: application/json" \
-d '{"name":"MacBook Pro", "description":"Apple Laptop", "price":2000.0}'
```
2. Get All Products (GET)
Open in browser: http://localhost:8080/api/products

3. Delete a Product (DELETE)
```bash
curl -X DELETE http://localhost:8080/api/products/1
```
📝 Note
Currently, the application uses an H2 In-Memory Database. This means data is lost when the application restarts. Persistent storage (PostgreSQL) will be added in future updates.
