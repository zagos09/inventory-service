# Inventory Service API 📦

A RESTful API for managing product inventory, built with Java and Spring Boot.

## 🚀 Technologies Used
* **Java 17**
* **Spring Boot 3** (Web, Data JPA)
* **PostgreSQL** (Production-grade SQL Database)
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

📝 Setup (PostgreSQL)
Ensure you have PostgreSQL running locally on port 5432 with a database named inventory_db. The application is configured to connect with username zagos and password 1234.