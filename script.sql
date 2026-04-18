CREATE DATABASE treina_recife;

CREATE TABLE tb_alunos (
    INTEGER id AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(150) NOT NULL,
    data_nascimento DATETIME NOT NULL;
)

INSERT INTO tb_alunos
('id', 'nome', 'email', 'data_nascimento')
VALUES
(1, "Rodrigo Guedes Silva", "rodrigogueedes7@gmail.com" , TIMESTAMP '2007-01-13')