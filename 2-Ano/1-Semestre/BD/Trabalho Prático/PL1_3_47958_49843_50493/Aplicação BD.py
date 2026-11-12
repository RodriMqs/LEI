import pyodbc
import tkinter as tk
from tkinter import ttk
from tkinter import messagebox

def mostrar_tabela(tabela):
    # Dados que servem para conectar à base de dados
    server = '192.168.100.14'
    database = 'BD_PL1_03'
    username = 'User_BD_PL1_03'
    password = 'diubi:2023!BD!PL1_03'
    connection_string = f'DRIVER=SQL Server;SERVER={server};DATABASE={database};UID={username};PWD={password};charset=UTF-8'

    # Comando para conectar à base de dados
    try:
        conn = pyodbc.connect(connection_string)
        cursor = conn.cursor()

        # Consultar uma tabela específica
        query_tabela = f'SELECT * FROM [dbo].[{tabela}]'
        cursor.execute(query_tabela)
        resultados_tabela = [tuple(row) for row in cursor.fetchall()]

        # Obter informações sobre as colunas
        colunas_tabela = [column[0] for column in cursor.description]

        return resultados_tabela, colunas_tabela

    except pyodbc.Error as ex:
        print(f"Erro na conexão: {ex}")

    finally:
        # Fechar a conexão
        if conn:
            conn.close()

def exibir_tabela(tabela):
    # Obter resultados e colunas da tabela
    resultados_tabela, colunas_tabela = mostrar_tabela(tabela)

    # Criar janela
    root = tk.Tk()
    root.title(f"Tabela '{tabela}'")

    # Criar árvore para exibir tabela
    tree = ttk.Treeview(root, columns=colunas_tabela, show="headings")

    # Adicionar colunas à árvore
    for coluna in colunas_tabela:
        tree.heading(coluna, text=coluna)
        tree.column(coluna, width=100)

    # Adicionar linhas à árvore
    for row in resultados_tabela:
        tree.insert("", "end", values=row)

    # Adicionar barra que permita explorar a tabela horizontalmente
    scrollbar_x = ttk.Scrollbar(root, orient="horizontal", command=tree.xview)
    tree.configure(xscrollcommand=scrollbar_x.set)
    scrollbar_x.pack(side="bottom", fill="x")

    tree.pack()

    # Executar loop da interface gráfica
    root.mainloop()

    # Verificar valores acima da média e exibir mensagem
    coluna_para_verificar = "ColunaParaVerificar"  # Substitua pelo nome da coluna desejada
    resultados_media = verificar_valores_acima_da_media(tabela, coluna_para_verificar)

    if resultados_media:
        mensagem = f"Valores na coluna '{coluna_para_verificar}' acima da média:\n"
        for row in resultados_media:
            mensagem += f"{row}\n"

        messagebox.showinfo("Valores Acima da Média", mensagem)
    else:
        messagebox.showinfo("Valores Acima da Média", "Não há valores acima da média.")

def verificar_valores_acima_da_media(tabela, coluna):
    # Dados que servem para conectar à base de dados
    server = '192.168.100.14'
    database = 'BD_PL1_03'
    username = 'User_BD_PL1_03'
    password = 'diubi:2023!BD!PL1_03'
    connection_string = f'DRIVER=SQL Server;SERVER={server};DATABASE={database};UID={username};PWD={password};charset=UTF-8'

        # Comando para conectar à base de dados
    try:
        conn = pyodbc.connect(connection_string)
        cursor = conn.cursor()

        # Calcular a média dos valores numa coluna específica
        query_media = f'SELECT AVG({coluna}) FROM [dbo].[{tabela}]'
        cursor.execute(query_media)
        media = cursor.fetchone()[0]

        # Verificar se os valores estão acima da média
        query_verificar = f'SELECT * FROM [dbo].[{tabela}] WHERE {coluna} > {media}'
        cursor.execute(query_verificar)
        resultados = cursor.fetchall()

        return resultados

    except pyodbc.Error as ex:
        print(f"Erro na conexão: {ex}")

    finally:
        # Fechar a conexão
        if conn:
            conn.close()

# Lista de tabelas
tabelas = ["Estação", "Leitura", "Sensores_de_Radiação", "Tipo_de_Estação", "Tipo_de_Sensor"]

# Exibir cada tabela e verificar valores acima da média
for tabela in tabelas:
    exibir_tabela(tabela)
