# Spring MVC Cars Application

A simple Spring MVC web application that displays a list of cars with filtering capabilities using Thymeleaf templates.

## Features

- Display a list of 5 predefined cars
- Filter cars by count (1-5 cars)
- Responsive web interface with clean styling
- RESTful URL structure with query parameters

## Project Structure

```
src/
├── main/
│   └── java/
│       └── web/
│           ├── controller/
│           │   ├── HelloController.java
│           │   └── CarsController.java
│           ├── model/
│           │   └── Car.java
│           └── service/
│               └── CarService.java
└── webapp/
    └── WEB-INF/
        └── pages/
            ├── index.html
            └── cars.html
```

## Components

### Models
- **Car.java**: Entity class with brand, model, and year fields

### Services
- **CarService.java**: Business logic for managing car data
  - Contains 5 predefined cars
  - `getCars(int count)`: Returns specified number of cars
  - `getAllCars()`: Returns all cars

### Controllers
- **HelloController.java**: Handles root path (`/`)
- **CarsController.java**: Handles `/cars` endpoint with optional count parameter

### Views
- **index.html**: Welcome page
- **cars.html**: Cars listing page with filtering options

## Technology Stack

- **Java 17**
- **Spring MVC 5.3.14**
- **Thymeleaf 3.0.14**
- **Maven 3.9.10**
- **Apache Tomcat 9.0.107**

## Prerequisites

- Java JDK 17 or higher
- Apache Maven 3.6+
- Apache Tomcat 9.0+

## Installation & Setup

### 1. Clone the Repository
```bash
git clone <repository-url>
cd project-prerequisite-2-2-2
```

### 2. Build the Project
```bash
mvn clean package
```

### 3. Deploy to Tomcat

#### Option A: Manual Deployment
1. Copy `target/Spring_MVC.war` to Tomcat's `webapps/` directory
2. Start Tomcat:
   ```bash
   # Windows
   bin/startup.bat
   
   # Linux/Mac
   bin/startup.sh
   ```

#### Option B: IDE Deployment
- Configure your IDE to deploy to Tomcat
- Run the project directly from your IDE

### 4. Access the Application
- **Home page**: `http://localhost:8080/spring_mvc/`
- **Cars page**: `http://localhost:8080/spring_mvc/cars`

## Usage

### URL Endpoints

| URL | Description |
|-----|-------------|
| `/` | Welcome page |
| `/cars` | Display all cars |
| `/cars?count=1` | Display 1 car |
| `/cars?count=2` | Display 2 cars |
| `/cars?count=3` | Display 3 cars |
| `/cars?count=4` | Display 4 cars |
| `/cars?count=5` | Display 5 cars |

### Navigation
- Use the navigation links on the cars page to filter results
- The page shows the current number of cars being displayed
- All links use Thymeleaf's `@{...}` syntax for proper context path handling

## Development

### Making Changes

#### Java Code Changes
1. Modify your Java files
2. Build: `mvn clean package`
3. Copy the new WAR to Tomcat's `webapps/`
4. Tomcat will automatically redeploy

#### HTML/Template Changes
- Most HTML changes don't require redeployment
- Just refresh your browser

### Project Configuration

The application uses:
- **Spring MVC** for web framework
- **Thymeleaf** for templating
- **Maven** for build management
- **WAR packaging** for deployment

## Troubleshooting

### Common Issues

1. **404 Error on `/cars`**
   - Ensure the WAR file is properly deployed
   - Check Tomcat logs for deployment errors
   - Verify the context path in the URL

2. **Build Failures**
   - Update `maven-war-plugin` to version 3.3.2+ for Java 17 compatibility
   - Ensure all dependencies are resolved

3. **Links Not Working**
   - Use Thymeleaf's `@{...}` syntax for proper context path handling
   - Avoid hardcoded paths in templates

### Logs
- Check Tomcat logs in `logs/catalina.out` for deployment issues
- Application logs will show any runtime errors

## API Reference

### CarsController

#### GET `/cars`
Returns a list of cars.

**Query Parameters:**
- `count` (optional): Number of cars to return (1-5)

**Response:**
- Returns `cars.html` template with car data

### CarService

#### `getCars(int count)`
Returns the specified number of cars from the predefined list.

**Parameters:**
- `count`: Number of cars to return

**Returns:**
- `List<Car>`: List of cars (up to 5)

#### `getAllCars()`
Returns all available cars.

**Returns:**
- `List<Car>`: Complete list of cars

## License

The solution to this project created by Habsida is provided by Woong Kim

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request 