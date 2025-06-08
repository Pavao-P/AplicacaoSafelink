 ### Scripts ou JSONs usados nos testes do CRUD (no caso de APIs)

GET http://localhost:8080/api/abrigos

PUT http://localhost:8080/api/abrigos/1
{
  "nome": "Abrigo oeste",
  "capacidade": 120,
  "ocupacao": 20,
  "localizacao": "Rua Nova"
}

DELETE localhost:8080/api/abrigos/1
