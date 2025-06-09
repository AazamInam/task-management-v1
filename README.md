# 🧠 Task Management Take-Home Assignment

A full-stack microservice for managing tasks. Built with Spring Boot, Angular, Docker, and AWS Lambda integration.

## 📂 Project Structure

- `backend/`: Spring Boot REST API
- `frontend/`: Angular frontend with priority filter
- `lambda/`: AWS Lambda pseudocode for overdue task notifier
- `docs/`: DDL + architecture diagram

---

## 🚀 How to Run

### 🔧 Backend

```bash
cd backend
./mvnw clean install -DskipTests
docker build -t task-management-backend .
docker run -p 8080:8080 task-management-backend
