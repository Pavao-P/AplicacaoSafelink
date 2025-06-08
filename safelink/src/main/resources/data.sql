-- Usuários
INSERT IGNORE INTO usuario (id, nome, username, senha) VALUES
                                                    (1, 'Admin', 'admin', '123456'),
                                                    (2, 'João Silva', 'joao', 'abc123');

-- Abrigos
INSERT IGNORE INTO abrigo (id, nome, capacidade, endereco, disponivel) VALUES
                                                                    (1, 'Abrigo Central', 100, 'Rua das Flores, 123', true),
                                                                    (2, 'Abrigo Zona Norte', 50, 'Avenida dos Pinheiros, 987', true);

-- Ocorrências
INSERT IGNORE INTO ocorrencia (id, tipo, descricao, latitude, longitude, data) VALUES
                                                                            (1, 'Enchente', 'Alagamento em bairro central', -23.5505, -46.6333, CURRENT_DATE),
                                                                            (2, 'Incêndio', 'Incêndio florestal se aproximando', -23.4700, -46.6100, CURRENT_DATE);
