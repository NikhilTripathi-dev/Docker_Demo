Docker Setup
Dockerfile
The Dockerfile is used to create a Docker image for the Spring Boot application. It performs the following steps:

Uses a base image with JDK 17.
Sets the working directory to /app.
Copies the packaged JAR file into the container.
Exposes port 8080 for the application.
Specifies the command to run the application.
Docker Compose
The docker-compose.yml file orchestrates multiple services:

app: The Spring Boot application.
mongo: The MongoDB service.
redis: The Redis service.
Running the Application with Docker Compose
To build and run the entire application stack, follow these steps:

Build and start the containers:

bash
Copy code
docker-compose up --build
This command will:

Build the Docker image for the Spring Boot application.
Pull the latest images for MongoDB and Redis.
Start all services defined in docker-compose.yml.
Access the Application:

The Spring Boot application will be available at http://localhost:8080.

Stopping the Application
To stop and remove all containers, run:

bash
Copy code
docker-compose down
Environment Variables
You can configure the MongoDB and Redis connections via environment variables in the docker-compose.yml:

SPRING_DATA_MONGODB_URI: MongoDB connection URI (default: mongodb://mongo:27017/test_db).
SPRING_REDIS_HOST: Redis host (default: redis).
SPRING_REDIS_PORT: Redis port (default: 6379).
Testing the Application
You can test the CRUD operations using tools like Postman or curl:

Create Item: POST /items
Get All Items: GET /items
Get Item by ID: GET /items/{id}
Update Item: PUT /items/{id}
Delete Item: DELETE /items/{id}



![image](https://github.com/user-attachments/assets/87b1c679-1c09-4a5d-a1c3-211e8aef9ecc)





