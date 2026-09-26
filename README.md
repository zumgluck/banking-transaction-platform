# Banking Transaction Platform

A hands-on software engineering project focused on banking
transaction processing, fraud detection and backend architecture.

The project demonstrates the progressive development of a
banking platform using Java, Spring Boot and Oracle Database.

## Project Objectives

- Design a modular banking transaction processing platform.
- Implement rule-based fraud detection.
- Develop REST APIs using Java and Spring Boot.
- Practice database design using Oracle SQL and PL/SQL.
- Apply software engineering and SDLC practices.
- Introduce automated testing and CI/CD.

## Technology Stack

- Java 21
- Spring Boot
- Maven
- Oracle SQL / PL/SQL
- Git
- REST API

## Current Implementation

### Banking API

Initial Spring Boot application featuring:

- Application health endpoint.
- Fraud score evaluation endpoint.
- Input validation.
- Rule-based decision logic.

Fraud decisions:

| Score | Decision |
|-------|----------|
| 0–29 | ALLOW |
| 30–69 | REVIEW |
| 70–100 | DECLINE |

### Database and Fraud Detection

The database module includes:

- Fraud rules.
- Transaction velocity checks.
- Fraud rule hit tracking.
- Fraud decisions.
- Fraud error logging.
- Fraud review queue.

The Java API and Oracle fraud engine are currently
separate components. Their integration is planned.

## Project Structure

```text
banking_transaction_platform/
├── banking-api/
│   └── src/
├── database/
│   ├── fraud/
│   ├── schema/
│   └── tests/
├── .gitignore
└── README.md
```

## Running the Banking API

Requirements:

- Java 21
- Git

Clone the repository and navigate to:

```bash
cd banking-api
```

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

On Linux/macOS:

```bash
./mvnw spring-boot:run
```

Available endpoints:

```http
GET /health
GET /score/{value}
```

Example:

```http
GET http://localhost:8080/score/50
```

Response:

```text
REVIEW
```

## Development Roadmap

- [x] Initial Oracle database schema
- [x] Initial fraud rules and velocity checks
- [x] Spring Boot project initialization
- [x] Health endpoint
- [x] Basic fraud score evaluation
- [ ] Structured JSON API responses
- [ ] Java service layer
- [ ] Oracle database integration
- [ ] Automated API tests
- [ ] GitHub Actions CI/CD
- [ ] Docker
- [ ] Kafka integration
- [ ] Cloud deployment
- [ ] ML-based fraud detection

## Software Development Lifecycle

This project is also used to practice:

- Git branching strategies
- Pull Requests and code review
- Automated testing
- Continuous Integration
- Release Management
- Deployment and monitoring

## Disclaimer

This is an educational portfolio project.

It does not process real banking transactions
or contain real customer information.

## Project Status

Active development.

Current focus:
- Java fundamentals
- REST API development
- Fraud detection
- Git and SDLC practices
