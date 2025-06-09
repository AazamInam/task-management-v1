# Build backend JAR
./mvnw clean package -DskipTests

# Build Docker image
docker build -t your-dockerhub-username/task-management-backend .

# Run locally (optional)
docker run -p 8080:8080 your-dockerhub-username/task-management-backend

# Push to DockerHub
docker login
docker push your-dockerhub-username/task-management-backend
