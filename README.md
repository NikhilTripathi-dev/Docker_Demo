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

![image](https://github.com/user-attachments/assets/1ee4225b-0bcc-4417-ab92-bad763a3a5c2)

![image](https://github.com/user-attachments/assets/91903866-033a-4234-b3ac-6a1f6eb3b9af)

![image](https://github.com/user-attachments/assets/397ced1b-b97f-40ea-bfc7-bb0e63ddd4eb)

![image](https://github.com/user-attachments/assets/55b26bcd-11e0-4c63-9d57-ef65be675479)

![image](https://github.com/user-attachments/assets/5e8d6faf-4c9b-4864-850c-1eeae0958f24)










