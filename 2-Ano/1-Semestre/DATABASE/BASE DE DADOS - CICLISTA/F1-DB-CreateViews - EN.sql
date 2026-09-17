USE Ciclistas;
GO

Create View Factory 
         as Select IDF, Marca as Brand, NIPC as VatNumber, Url, Telefone as Phone, Email 
            From TblFabricante;
GO
			
Create View Place 
         as Select IDL as IDP, Nome_Local as Place_Name, Info, X, Y, Elevacao as Elevation
            From TblLugar;			
GO

Create View Event
         as Select 	IDT as IDE, Designacao as Event_Name, Distancia as Length, 
		            Data_Tour as Event_Date, 
		            Grau_Dificuldade as Difficulty, Tipo as Event_Type
		    From TblTour;	
GO

Create View RoadMap 
         as Select IDT as IDE, Ordem as Tour_Sequence, IDL as IDP 
		    From  TblPercurso;			
GO

Create View Cyclist
         as Select IDC, Nome as Name, 
                    DATEDIFF(YY, Data_nascimento, GetDate()) -
                    CASE WHEN ( 
  				              (MONTH(Data_nascimento)*100 + DAY(Data_nascimento)) >
                              (MONTH(GetDate())*100 + DAY(GetDate()))
                        ) THEN 1 
				    ELSE 0 
				    END As Age,
					Genero as Gender, Telefone as Phone, Email, NIF as TIN, 
					IDL_Residencia as IDP_Residence
			From TblCiclista;			
GO

Create View Organize
         as Select IDC, IDT as IDE, Funcao as Role From TblOrganizacao;		 			
GO

Create View RelationShip
         as Select IDC_A, IDC_B,Tipo as Relation_Type From TblParente;		 
GO

Create View Bicycle
         as Select IDB, Modelo as Model, Data_Compra as Acquisition_Date,
                   Preco as Price,IDF, IDC
            From TblBicicleta;			
GO

Create View Took_Part
         as Select IDB,IDT as IDE, IDC, Tempo as Event_Time, 
		           Inscricao as Registration_Value 
			From TblParticipacao;
GO		 
	
	