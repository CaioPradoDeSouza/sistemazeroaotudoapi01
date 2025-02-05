INSERT INTO NPL_USUARIO (ID, NOME, LOGIN, SENHA, EMAIL, SITUACAO) VALUES (1, 'caio', 'caio123','1234','caio@123','ATIVO');

ALTER SEQUENCE NPL_USUARIO_ID_SEQ RESTART WITH 2;

INSERT INTO NPL_PERFIL(ID, DESCRICAO) VALUES (1, 'DEV');
INSERT INTO NPL_PERFIL (ID, DESCRICAO) VALUES (2, 'Gerente');
INSERT INTO NPL_PERFIL (ID, DESCRICAO) VALUES (3, 'Cliente');

ALTER SEQUENCE NPL_PERFIL_SEQ RESTART WITH 4;

INSERT INTO NPL_RECURSO (ID, NOME, CHAVE) VALUES (1, 'Tela Usuário', 'usuario');
INSERT INTO NPL_RECURSO (ID, NOME, CHAVE) VALUES (2, 'Tela Perfil', 'perfil');
INSERT INTO NPL_RECURSO (ID, NOME, CHAVE) VALUES (3, 'Tela Recurso', 'recurso');

ALTER SEQUENCE NPL_RECURSO_SEQ RESTART WITH 4;