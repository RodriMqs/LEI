USE Ciclistas;
GO

Create View Fabricante 
         as Select * from TblFabricante;
GO	 
		
Create View Lugar 
         as Select * from TblLugar;
GO

Create View Evento
		 as Select IDT as IDE, Designacao as Nome_Evento, Data_Tour as Data_Evento, 
		           Distancia, Grau_Dificuldade as Dificuldade, Tipo as Tipo_Evento 
			From TblTour;
GO

Create View Percurso 
         as Select IDT as IDE, Ordem, IDL 
		    From TblPercurso;
GO

Create View Ciclista
         as Select IDC, Nome, 
                    DATEDIFF(YY, Data_nascimento, GetDate()) -
                    CASE WHEN ( 
  				              (MONTH(Data_nascimento)*100 + DAY(Data_nascimento)) >
                              (MONTH(GetDate())*100 + DAY(GetDate()))
                        ) THEN 1 
				    ELSE 0 
				    END As Idade,
					Genero, Telefone, Email, NIF, IDL_Residencia
			From TblCiclista;	 
GO

Create View Organizacao
         as Select IDC, IDT as IDE, Funcao  From TblOrganizacao;
GO

Create View Parente
         as Select IDC_A, IDC_B, Tipo as Tipo_Parentesco From TblParente;
GO

Create View Bicicleta
         as Select * From TblBicicleta;
GO

Create View Participacao
         as Select IDB, IDT as IDE, IDC, Tempo, Inscricao as Valor_Inscricao 
		 From TblParticipacao;
GO

