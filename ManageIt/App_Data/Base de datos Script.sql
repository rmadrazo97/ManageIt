--4 junio
CREATE DATABASE Manageit;
GO


USE Manageit;
GO


CREATE TABLE Producto
	(
	idProducto varchar(50) primary key NOT NULL,
	descripcion varchar(50) NOT NULL,
	observaciones varchar(MAX) NULL,
	precio decimal(18, 2) NOT NULL,
	descuento decimal(5, 2) NULL
	)
GO


CREATE TABLE TipoEmpleado
	(
	idTipo int identity (1,1) primary key NOT NULL,
	nombre varchar(50) NOT NULL,
	descripcion varchar(50) NOT NULL
	) 
GO


CREATE TABLE Empleado
	(
	idEmpleado int identity(1,1) primary key NOT NULL,
	nombre varchar(75) NOT NULL,
	documento varchar(3) NOT NULL,
	nodocto varchar(50) NOT NULL,
	email varchar(75) NULL,
	comision decimal(5, 3) NULL,
	telefonocelular varchar(20) NOT NULL,
	telefonoresidencia varchar(20) NOT NULL,
	telefonoextra varchar(20) NULL,
	direccion varchar(50) NOT NULL,
	fechanacimiento date NULL,
	idTipo int NOT NULL FOREIGN KEY (idTipo)     
    REFERENCES TipoEmpleado (idTipo)      
    ON UPDATE CASCADE    
	)  
GO

CREATE TABLE Usuario
	(
	username varchar(50) primary key NOT NULL,
	clave varchar(50) NOT NULL,
	activo bit NOT NULL default 1,
	idEmpleado int NOT NULL FOREIGN KEY (idEmpleado)     
    REFERENCES Empleado (idEmpleado)      
    ON UPDATE CASCADE
	)
GO

CREATE TABLE Usuario
	(
	username varchar(50) primary key NOT NULL,
	clave varchar(50) NOT NULL,
	activo bit NOT NULL default 1,
	idEmpleado int NOT NULL FOREIGN KEY (idEmpleado)     
    REFERENCES Empleado (idEmpleado)      
    ON UPDATE CASCADE
	)
GO

--5 junio
CREATE TABLE PuntoDeVenta
	(
	idPuntoDeVenta int IDENTITY(1,1) PRIMARY KEY NOT NULL,
	direccion varchar(50) NOT NULL,
	capacidad int NOT NULL,
	idEmpleado int NOT NULL FOREIGN KEY (idEmpleado)     
    REFERENCES Empleado (idEmpleado)      
    ON UPDATE CASCADE
	)
GO



CREATE TABLE Bodega
	(
	idPuntoDeVenta int FOREIGN KEY (idPuntoDeVenta)     
    REFERENCES PuntoDeVenta (idPuntoDeVenta) ON UPDATE CASCADE NOT NULL,
	idProducto varchar(50) FOREIGN KEY (idProducto)     
    REFERENCES Producto (idProducto) ON UPDATE CASCADE NOT NULL,
	cantidad decimal(18,2) NOT NULL,
	PRIMARY KEY(idPuntoDeVenta, idProducto)
	)
GO


CREATE TABLE Cliente
	(
	nit varchar(10) PRIMARY KEY NOT NULL,
	nombre varchar(50) NOT NULL,
	email varchar(70) NOT NULL,
	direccion varchar(70) NOT NULL,
	telefonoPrincipal varchar(20) NOT NULL,
	telefonoSecundario varchar(20),
	credito decimal(18, 2) NOT NULL DEFAULT 0,
	diasDeCredito int NOT NULL DEFAULT 0,
	contacto varchar(50),
	)
GO


CREATE TABLE Factura
	(
	serie varchar(10) NOT NULL,
	numero varchar(50) NOT NULL,
	nit varchar(10) FOREIGN KEY (nit)     
    REFERENCES Cliente (nit) ON UPDATE CASCADE NOT NULL,
	username varchar(50) FOREIGN KEY (username)     
    REFERENCES Usuario (username) ON UPDATE CASCADE NOT NULL,
	PRIMARY KEY(serie, numero)
	)
GO

CREATE TABLE DetalleFactura
	(
	serie varchar(10) NOT NULL,
	numero varchar(50)  NOT NULL,
	idProducto varchar(50) FOREIGN KEY (idProducto)     
    REFERENCES Producto (idProducto) ON UPDATE CASCADE NOT NULL,
	cantidad decimal(18,2) NOT NULL,
	PRIMARY KEY(serie, numero, idProducto),
	FOREIGN KEY  (serie, numero)   
    REFERENCES Factura(serie,numero) ON UPDATE CASCADE
	)
GO

CREATE TABLE TipoDocumento
	(
	idTipoDocumento varchar(3) PRIMARY KEY NOT NULL,
	nombre varchar(50),
	descripcion varchar(70)
	)
GO


CREATE TABLE Documento
	(
	idDocumento INT IDENTITY(1,1) NOT NULL,
	idTipoDocumento varchar(3) NOT NULL FOREIGN KEY (idTipoDocumento)     
    REFERENCES TipoDocumento (idTipoDocumento) ON UPDATE CASCADE,
	nit varchar(10) FOREIGN KEY (nit)     
    REFERENCES Cliente (nit) ON UPDATE CASCADE,
	contactoReceptor varchar(70),
	username varchar(50) FOREIGN KEY (username)     
    REFERENCES Usuario (username) ON UPDATE CASCADE NOT NULL,
	PRIMARY KEY(idDocumento)
	)
GO

CREATE TABLE DetalleDocumento
	(
	idDocumento INT NOT NULL,
	idProducto varchar(50) FOREIGN KEY (idProducto)     
    REFERENCES Producto (idProducto) ON UPDATE CASCADE NOT NULL,
	cantidad decimal(18,2) NOT NULL,
	PRIMARY KEY(idDocumento, idProducto)
	)
GO