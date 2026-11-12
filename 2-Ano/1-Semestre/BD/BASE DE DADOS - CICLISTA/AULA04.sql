/*27. Quantas marcas de bicicletas existem?
SELECT DISTINCT COUNT(Fabricante.Marca)
FROm Fabricante*/

/*--MOSTRAR QUANTAS PESSSOAS RESIDEM NUM LUGAR , A IDADE MEDIA E A IDADE MAXIMA E MINIMA
SELECT 
	l.Nome_Local , COUNT(*) AS QNT_RESIDENTES,
	AVG(c.idade) AS MEDIA_IDADE
FROM Ciclista c , Lugar l
WHERE c.IDL_Residencia = l.IDL
GROUP BY l.Nome_Local*/

/*--MOSTRAR NOME DE LUGAR E QUANTIDADE DE RESIDENTES MAS APENAS PARA LUGARES
--COM MAIS DE 3 RESIDENTES ORDENADO POR ORDEM DECRESCENTE

SELECT 
	l.Nome_Local , COUNT(*) AS QNT_RESIDENTES,
	AVG(c.idade * 1.0) as MEDIA_IDADE
FROM Ciclista c
INNER JOIN Lugar l ON c.IDL_Residencia = l.IDL
GROUP BY l.Nome_Local
HAVING COUNT(*) > 3
ORDER BY COUNT(*) DESC*/

/*--MOSTRAR A QUANTIDADE DE BICLICESTAS DE CADA FABRICANTE
SELECT 
    f.Marca, COUNT(*) AS Qnt_Bicicletas
FROM Fabricante f
INNER JOIN Bicicleta b ON f.IDF = b.IDF
GROUP BY f.Marca

--IGUAL ANTERIOR MAS PARA CADA MODELO
SELECT f.Marca, b.modelo, COUNT(*) AS Qnt_Bicicletas
FROM Fabricante f
INNER JOIN Bicicleta b ON f.IDF = b.IDF
GROUP BY f.marca, b.Modelo
ORDER BY f.Marca ASC*/

--MOSTRAR CICLISTAS QUE PARTICIPARAM EM PASSEIOS COM AS 
--SEGUINTES IDADES 95,71,47,26

/*SELECT DISTINCT c.*
FROM Ciclista c
INNER JOIN Participacao p ON c.IDC=p.IDC
WHERE Idade IN (95,71,47,26)*/

/*--Lista telefonica da base de dados
SELECT Telefone, Nome
FROM Ciclista
WHERE Telefone IS NOT NULL
UNION
SELECT Telefone , Marca
FROM Fabricante 
WHERE Telefone IS NOT NULL*/

--LISTA TOAS AS RELAÇOES DE PARENTECO ENTRE DOIS CICLISTAS
SELECT c1.Nome , p.Tipo_Parentesco, c2.Nome
FROM Parente p
INNER JOIN Ciclista c1 ON p.IDC_A = c1.IDC
INNER JOIN Ciclista c2 ON p.IDC_B = c2.IDC
