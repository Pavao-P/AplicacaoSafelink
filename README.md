 ### Scripts ou JSONs usados nos testes do CRUD (no caso de APIs)

 PUT http://localhost:8080/api/abrigos/1
{
  "nome": "Abrigo Central Atualizado",
  "capacidade": 120,
  "ocupacao": 20,
  "localizacao": "Rua Nova, Centro"
}


GET localhost:8080/api/abrigos/1

GET http://localhost:8080/api/abrigos

PUT http://localhost:8080/api/abrigos/2
{
  "id": 2,
  "nome": "Abrigo Zona OESTE",
  "capacidade": 50,
  "ocupacao": 0,
  "localizacao": null
}

DELETE localhost:8080/api/abrigos/1
