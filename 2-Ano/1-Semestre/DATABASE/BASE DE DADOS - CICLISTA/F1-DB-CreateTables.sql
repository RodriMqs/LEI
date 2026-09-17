USE Ciclistas;

CREATE TABLE TblFabricante ( 
	IDF                  int NOT NULL,
	Marca                nvarchar(10)    ,
	NIPC                 char(13)    ,
	Url                  nvarchar(50)    ,
	Telefone             nvarchar(13),
	Email                nvarchar(40)    ,
	CONSTRAINT PK_fabricante PRIMARY KEY  ( IDF)
 );


CREATE TABLE TblLugar( 
	IDL                  int NOT NULL   ,
	Nome_Local           nvarchar(100) NOT NULL   ,
	Info                 nvarchar(1000)    ,
	X                    decimal(10,7)    ,
	Y                    decimal(10,7)    ,
	Elevacao             decimal(6,2)    ,
	CONSTRAINT PK_Lugar PRIMARY KEY  ( IDL)
 );

CREATE TABLE TblTour ( 
	IDT                  int NOT NULL   ,
	Designacao           nvarchar(50) NOT NULL   ,
	Data_Tour                 date NOT NULL  default GetDate() ,
	Grau_Dificuldade     int  Not Null default 1,
	Distancia            decimal(6,2)  default 0.0  ,
	Tipo                 nvarchar(20)  Default 'Passeio' ,
	CONSTRAINT PK_Tour PRIMARY KEY  ( IDT )
 );

CREATE TABLE TblPercurso ( 
	IDT                  int NOT NULL   ,
	Ordem                int NOT NULL   ,
	IDL                  int NOT NULL   ,
	CONSTRAINT PK_Percurso PRIMARY KEY  ( IDT, Ordem ),
	Constraint FK_Tour Foreign Key (IDT) References TblTour(IDT) 
	                  ON Delete No ACTION On UpDate Cascade,
	Constraint FK_Lugar Foreign Key (IDL) References TblLugar(IDL)
	                  ON Delete No ACTION On UpDate Cascade,
);
	

CREATE TABLE TblCiclista ( 
	IDC                  int NOT NULL   ,
	Nome                 nvarchar(50) NOT NULL   ,
	Data_nascimento      Date Default  '2000-01-01'   ,
	Genero               char(1)    ,
	Telefone             nvarchar(13),
	Email                nvarchar(40)    ,
	Nif                  nvarchar(13)    ,
	IDL_residencia       int NOT NULL   ,
	CONSTRAINT PK_Ciclista PRIMARY KEY  ( IDC ),
	Constraint FK_CiclistaLugar Foreign Key (IDL_residencia) References TblLugar(IDL)
	                  ON Delete No ACTION On UpDate Cascade	
 );
 
 
 
 CREATE TABLE TblOrganizacao ( 
	IDC         int NOT NULL   ,
	IDT         int NOT NULL   ,
	Funcao		nvarchar(40) Not Null Default 'Colaborador',
	CONSTRAINT PK_Organizacao PRIMARY KEY  ( IDC, IDT),
	Constraint FK_OrganizacaoCiclista Foreign Key (IDC) References TblCiclista(IDC)
	                  ON Delete No ACTION On UpDate Cascade,
	Constraint FK_OrganizacaoTour Foreign Key (IDT) References TblTour(IDT)
	                  ON Delete No ACTION On UpDate Cascade
 );
 
CREATE TABLE TblParente ( 
	IDC_A                int NOT NULL   ,
	IDC_B                int NOT NULL   ,
	Tipo                 nvarchar(50) NOT NULL   ,
	CONSTRAINT PK_Parente PRIMARY KEY  ( IDC_A, IDC_B),
	Constraint FK_ParenteCiclistaA Foreign Key (IDC_A) References TblCiclista(IDC)
	                  ON Delete No ACTION On UpDate No Action,
	Constraint FK_ParenteCiclistaB Foreign Key (IDC_B) References TblCiclista(IDC)
	                  ON Delete No ACTION On UpDate No Action					  
 );


CREATE TABLE TblBicicleta ( 
	IDB                  int NOT NULL   ,
	Modelo               nvarchar(30)    ,
	Data_Compra          date    ,
	Preco                decimal(6,2)    ,
	IDF                  int NOT NULL   ,
	IDC                  int NOT NULL   ,
	CONSTRAINT PK_Bicicleta PRIMARY KEY  ( IDB ),
	Constraint FK_BicicletaCiclista Foreign Key (IDC) References TblCiclista(IDC)
	                  ON Delete No ACTION On UpDate Cascade,
	Constraint FK_BicicletaFabricante Foreign Key (IDF) References TblFabricante(IDF)
	                  ON Delete No ACTION On UpDate Cascade					  	
 );


CREATE TABLE TblParticipacao ( 
	IDB                  int NOT NULL   ,
	IDT                  int NOT NULL   ,
	IDC                  int NOT NULL   ,
	Tempo                time(7)    ,
	Inscricao            float    ,
	CONSTRAINT PK_Participacao PRIMARY KEY  ( IDB, IDT, IDC ),
	Constraint FK_ParticipacaoCiclista Foreign Key (IDC) References TblCiclista(IDC)
	                  ON Delete No ACTION On UpDate No Action,	
 	Constraint FK_ParticipacaoTour Foreign Key (IDT) References TblTour(IDT)
	                  ON Delete No ACTION On UpDate No Action,	
 	Constraint FK_ParticipacaoBicicleta Foreign Key (IDB) References TblBicicleta(IDB)
	                  ON Delete No ACTION On UpDate No Action	
 );

