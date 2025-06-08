CREATE DATABASE IF NOT EXISTS desafio_fiap;

USE desafio_fiap;

CREATE TABLE IF NOT EXISTS eventos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_evento DATE NOT NULL,
    cidade VARCHAR(255),
    tipo_evento VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS ocorrencia (
    id BIGINT PRIMARY KEY,
    tipo VARCHAR(255),
    descricao VARCHAR(255),
    latitude DOUBLE,
    longitude DOUBLE,
    data DATE
);

CREATE TABLE IF NOT EXISTS abrigo (
  id BIGINT PRIMARY KEY,
  nome VARCHAR(255),
  capacidade INT,
  endereco VARCHAR(255),
  disponivel BOOLEAN
);

CREATE TABLE usuario (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100),
    username VARCHAR(50) UNIQUE,
    senha VARCHAR(255)
);