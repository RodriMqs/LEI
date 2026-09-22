
num = 123
print(num)

numalt = num + 0.5
print (numalt)
print(type(numalt))

nome = input("Nome: ")
print(nome, type(nome))

texto = "também podem usar aspas, até porque podem querer usar ' no texto a escrever, ou vice-versa"
print(texto)
print(texto[0])
print(texto[-1])
print(texto[0:3])
print(texto[0:50:3])
print(texto[0::3])
print(texto[::3])
print(texto[::])

texto_grande = '''
ergeg
ererv
erverv
'''
print(texto_grande)

novo = texto[29:38]
print(novo)
print(novo[::-2])

print(5/2) #DIVISAO NORMAL
print(5//2) #DIVISAO INTEIRA TIPO C
print(round(2.6))

"""EXERCICIO 1
1. Defina uma variável num contendo o seu número de aluno.
2. Crie uma nova variável numalt contendo o valor da sua variável num.
3. Some 5 ao valor da sua variável numalt .
4. Verifique o tipo da sua variável (num).
5. Altere o tipo da sua variável (num ) para float.
6. Verifique o valor e o tipo da sua variável num."""


numAluno = 12345
numalt = numAluno
numalt = numalt + 5
print("Numalt somado mais 5: ", numalt, type(numAluno))
numAluno = float(numAluno)
print(numAluno , type(numAluno))

lista = [1,2,3,4,5,6,7,8,9,10]
print(type(lista))
print(lista)
print(lista[::-1])

import numpy as np

listas = np.concatenate((lista, lista[::-1]))
print(listas)
print(type(listas))

import numpy as np

vcol = np.array([1,2,3,4,5,6,7,8,9,10])
print(vcol)
print(vcol[5])

vcol[7] = 100
# Posicões pares
print(vcol[::2])
# Posições ímpares
print(vcol[1::2])
vcolinv1 = vcol[::-1]
print(vcolinv1)
# Valores entre as posições 2 e 7
vcolinv2 = vcolinv1[2:7]
print(vcolinv2)
vlin1 = vcol[::2]
print(vlin1)
vlin2 = vlin1[::-1]
print(vlin2)
vlin = np.concatenate((vlin1, vlin2))
print(vlin)
print(len(vlin1), len(vlin2), len(vlin))

lista = np.arange(4,32,3)
print(lista)
listamaior = np.arange(0.5,len(lista)*3, 1, dtype=float)
print(listamaior)

time = np.linspace(2, 5, num=16)
print(time)
print(len(time))

"""# Exercícios

18. Crie um vetor vlin100 com os números de 1 a 100.
19. Crie um vetor vpar100 com os números pares entre 1 e 100.
20. Crie um vetor vimpar100 com os números impares entre 1 e 100.
21. Crie um vetor vlincem todo com zeros (use a função **zeros** do numpy).
21. Atualize o seu vetor vlincem com os números de vpar100 e de vimpar100 alternados. No final este vetor deverá ter os números de 1 a 100."""

vlin100 = np.arange(1,101,1)
vpar100 = np.arange(2,101,2)
vimpar100 = np.arange(1,101,2)
vlincem = np.zeros(100)
print(vlin100)
print(vpar100)
print(vimpar100)
print(vlincem)
vlincem[0::2]= vimpar100
print(vlincem)
vlincem[1::2]= vpar100
print(vlincem)

import matplotlib.pyplot as plt
import numpy as np

tempo = np.arange(1/8,2,1/64)
sinal= 6*np.sin(2*np.pi*tempo)

plt.figure(figsize=(15, 5))
plt.plot(tempo, sinal)
plt.title('Plot')
plt.ylabel('Sinal')
plt.xlabel('tempo')
plt.show()

"""A = np.array([[1,2,3,4,5], [6,7,8,9, 10]])
print('Dimensão de A: ', np.shape(A))
print('\n A = \n', A)
print('\n Multiplicação coeficiente a coeficiente: \n', A * A)
print('\n Multiplicaçao de matrizes: \n' , A @ np.transpose(A))
"""

import numpy as np

""" Exercícios

1. Defina uma variável A contendo matriz de 3 linhas e 4 colunas com números à
sua escolha.
2. Crie uma nova variável B contendo o valor que se encontra na linha 2 coluna 2
da sua variável A.
3. Altere o valor que se encontra na linha 3 coluna 2 da sua variável A, para 10.
4. Crie uma nova variável C contendo a segunda linha da sua variável A.
5. Crie uma nova variável D contendo a segunda coluna da sua variável A.
6. Crie uma nova variável E contendo os valores das linha 2 e 3 e das colunas 2 e 3, da sua variável A.
7. Crie uma nova variável F contendo os valores da sua variável A, mas com as linhas invertidas.
8. Crie uma nova variável G contendo os valores da sua variável A, mas com as colunas invertidas.
9. Crie uma nova variável H contendo os valores da sua matriz A que se encontram nas posições pares (linhas colunas pares).
10. Verifique as dimensões das suas matrizes A, C e D."""

A = np.array([[1,2,3,4], [5,6,7,8], [9,10,11,12]])
print(np.shape(A))
print('\n A = \n', A)
B = A[1,1]
print(B)
A[2,1] = 10
print(A)
C = A[1 , :]
print("C=\n" ,C)
D = np.transpose(A[:,1])
print("D=\n",D)
E = A[1:3,1:3]
print('\n E = \n', E)

F = A[::-1,:]
print('\n F = \n', F)

G = A[:, ::-1]
print('\n G = \n', G)

H = A[1::2,1::2]
print('\n H = ', H)

"""11. Crie um vetor linha viln contendo todos os valores da sua variável A.
12. Crie uma nova variável I resultante da transposta da sua matriz A.Verifique as dimensões da matriz transposta.
13. Defina uma variável Z contendo uma matriz de zeros com 6 linhas e 8 colunas.
14. Copie os valores da sua matriz A para as posições pares (linhas e colunas pares)
da sua matriz Z .
15. Copie os valores da sua matriz A para as posições ímpares (linhas e colunas
ímpares) da sua matriz Z .
16. Copie os valores da sua matriz A para as posições em que as linhas são ímpares
e as colunas são pares da sua matriz Z .
17. Copie os valores da sua matriz A para as posições em que as linhas são pares e
as colunas são ímpares da sua matriz Z ."""

vlin = A.flatten()
print(np.shape(vlin))
print('vlin = ', vlin)

I = np.transpose(A)
print("I = \n", I)

Z = np.zeros((6,8))
print("Z = \n", Z)
