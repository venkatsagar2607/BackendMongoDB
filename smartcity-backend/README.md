
# SmartCity Backend (Spring Boot + MongoDB)

This is a minimal Spring Boot backend for SmartCity with:
- MongoDB (spring-data-mongodb)
- JWT authentication (jjwt)
- Endpoints for register/login, profile and reports

## Quick start (local)

1. Make sure MongoDB is running locally on default port or update `src/main/resources/application.properties`.
2. Build & run:
   ```bash
   mvn clean package
   mvn spring-boot:run
   ```
3. API:
   - `POST /api/auth/register` with JSON `{ "name","email","password" }` => returns `{ token }`
   - `POST /api/auth/login` with `{ "email","password" }` => `{ token }`
   - Add header `Authorization: Bearer <token>` to access:
     - `GET /api/profile/me`
     - `POST /api/reports/submit`
     - `GET /api/reports/my`

## Notes
- **Important:** Change `jwt.secret` in `application.properties` to a strong secret or read it from environment variables in production.
- This scaffold is intentionally minimal — expand input validation, error handling and roles as needed.
