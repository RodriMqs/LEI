/*SELECT Fabricante.marca, Bicicleta.Modelo, Bicicleta.IDC, Bicicleta.IDB, Ciclista.Nome
FROM Fabricante 
left join Bicicleta ON Fabricante.IDF = Bicicleta.IDF 
left join Ciclista on Bicicleta.IDC = Ciclista.IDC*/

/*10. Obtenha uma listagem com os pormenores dos ciclistas e do seu lugar de residência.
SELECT Ciclista.* , IDL
FROM Lugar, Ciclista
WHERE IDL = Ciclista.IDL_Residencia*/

/*exercicio 12
SELECT Ciclista.* , lugar.IDL
from Ciclista 
inner join Lugar on Ciclista.IDL_Residencia = Lugar.IDL

SELECT Ciclista.IDC, Ciclista.Nome, Ciclista.idade , Ciclista.Genero, Ciclista.Telefone, Ciclista.Email, Ciclista.Nif, Lugar.IDL
FROM Ciclista 
INNER JOIN Lugar ON Ciclista.IDL_Residencia = Lugar.IDL;*/

/*13. Obtenha uma listagem contendo os locais (ID e nome) e os ciclistas (nome) que vivem nesses locais.
Nota: use junção externa

--funçao externa mostra todos os locais
SELECT Lugar.IDL, Lugar.Nome_Local, Ciclista.Nome
FROM Lugar
LEFT JOIN Ciclista ON Lugar.IDL = Ciclista.IDL_residencia;

--funcao interna mostra todos os locais que existem pelo menos uma pessoa  a viver
SELECT Lugar.IDL, Lugar.Nome_Local, Ciclista.Nome
FROM Lugar
INNER JOIN Ciclista ON Lugar.IDL = Ciclista.IDL_residencia;*/

/* 14. Obtenha o ID dos ciclistas que já desempenharam a função de coordenador e/ou de organizador nos
eventos que organizaram

SELECT Ciclista.IDC
FROM Ciclista
inner join Organizacao on Ciclista.IDC=Organizacao.IDC
WHERE Organizacao.Funcao = 'Coordenador' 
OR Organizacao.Funcao = 'Organizador'*/

/*15. Obtenha o ID dos ciclistas que já desempenharam as funções de coordenador e de organizador (nos
eventos que organizaram).

SELECT Organizacao.IDC
FROM Organizacao
WHERE Organizacao.Funcao = 'Coordenador' 
INTERSECT
SELECT Organizacao.IDC 
FROM Organizacao
WHERE Organizacao.Funcao = 'Organizador'*/

/*16. Obtenha o ID dos ciclistas que só desempenharam a função de coordenador (nos eventos que
organizaram).*/

SELECT IDC 
FROM TblOrganizacao 
WHERE Funcao = 'Coordenador'

EXCEPT

SELECT IDC 
FROM TblOrganizacao 
WHERE Funcao <> 'Coordenador';




