# Recipe Management System

## Overview

The Recipe Management System is a web application developed using Spring Boot. It allows users to manage recipes and comments associated with each recipe. The project includes controllers, services, models, repositories, and configuration files.

## Project Structure

### Controllers
- **RecipeController**: Defines APIs for managing recipes and comments.

### Models
- **Recipe**: Represents a recipe entity with name, ingredients, instructions, and associated comments.
- **Comment**: Represents a comment entity associated with a recipe.

### Repositories
- **RecipeRepo**: Handles CRUD operations for recipes.
- **CommentRepo**: Handles CRUD operations for comments.

### Services
- **RecipeService**: Provides methods for managing recipes.
- **CommentService**: Provides methods for managing comments associated with recipes.

### Main Application Class
- **RecipeManagemnetSystemApplication**: Entry point of the application. It bootstraps the Spring Boot application and starts the embedded Tomcat server.

## Running the Application
To run the application:
1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd Recipe-Managemnet-System`
3. Run the application: `mvn spring-boot:run`

## Configuration
The application uses MySQL as the database. The default configurations can be found in the `application.properties` file. Ensure that MySQL is installed and running on the specified port.

## Dependencies
- Spring Boot Web
- Spring Data JPA

## Endpoints

### RecipeController
- **GET /api/recipes**: Retrieves all recipes.
- **GET /api/recipes/{id}**: Retrieves a recipe by ID.
- **POST /api/recipes**: Creates a new recipe.
- **PUT /api/recipes/{id}**: Updates an existing recipe.
- **DELETE /api/recipes/{id}**: Deletes a recipe.
- **POST /api/recipes/{id}/comments**: Adds a comment to a recipe.

## Usage
1. Retrieve all recipes by sending a GET request to `/api/recipes`.
2. Retrieve a specific recipe by sending a GET request to `/api/recipes/{id}`.
3. Create a new recipe by sending a POST request to `/api/recipes` with the recipe details in the request body.
4. Update an existing recipe by sending a PUT request to `/api/recipes/{id}` with the updated recipe details in the request body.
5. Delete a recipe by sending a DELETE request to `/api/recipes/{id}`.
6. Add a comment to a recipe by sending a POST request to `/api/recipes/{id}/comments` with the comment details in the request body.

## Documentation
API documentation is not provided in this project, but code comments have been added for clarity and maintenance purposes.
## Contributors
- Anish Kumar Sharma
