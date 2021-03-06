USE [master]
GO
/****** Object:  Database [IpamVax]    Script Date: 23/06/2022 17:42:21 ******/
CREATE DATABASE [IpamVax]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'IpamVax', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\IpamVax.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'IpamVax_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\IpamVax_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [IpamVax] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [IpamVax].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [IpamVax] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [IpamVax] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [IpamVax] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [IpamVax] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [IpamVax] SET ARITHABORT OFF 
GO
ALTER DATABASE [IpamVax] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [IpamVax] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [IpamVax] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [IpamVax] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [IpamVax] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [IpamVax] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [IpamVax] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [IpamVax] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [IpamVax] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [IpamVax] SET  DISABLE_BROKER 
GO
ALTER DATABASE [IpamVax] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [IpamVax] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [IpamVax] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [IpamVax] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [IpamVax] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [IpamVax] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [IpamVax] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [IpamVax] SET RECOVERY FULL 
GO
ALTER DATABASE [IpamVax] SET  MULTI_USER 
GO
ALTER DATABASE [IpamVax] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [IpamVax] SET DB_CHAINING OFF 
GO
ALTER DATABASE [IpamVax] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [IpamVax] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [IpamVax] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [IpamVax] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'IpamVax', N'ON'
GO
ALTER DATABASE [IpamVax] SET QUERY_STORE = OFF
GO
USE [IpamVax]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Admin](
	[AdminId] [bigint] IDENTITY(1,1) NOT NULL,
	[AdminLogin] [nvarchar](100) NULL,
	[AdminPassword] [nvarchar](500) NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[AdminId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[EmployeeId] [bigint] IDENTITY(1,1) NOT NULL,
	[Type] [nvarchar](100) NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[EmployeeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[EmployeeSchedule]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[EmployeeSchedule](
	[EmployeeScheduleId] [bigint] IDENTITY(1,1) NOT NULL,
	[EmployeeStart] [datetime2](7) NULL,
	[EmployeeStop] [datetime2](7) NULL,
	[VaxCentreId] [bigint] NULL,
	[EmployeeId] [bigint] NULL,
	[LineId] [bigint] NULL,
 CONSTRAINT [PK_Table_1] PRIMARY KEY CLUSTERED 
(
	[EmployeeScheduleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Line]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Line](
	[LineId] [bigint] NOT NULL,
	[Number] [int] NULL,
	[VaxCentreId] [bigint] NULL,
 CONSTRAINT [PK_Line] PRIMARY KEY CLUSTERED 
(
	[LineId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[People]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[People](
	[PeopleId] [bigint] IDENTITY(1,1) NOT NULL,
	[Firstname] [nvarchar](1000) NULL,
	[Lastname] [nvarchar](1000) NULL,
	[NationalNumber] [nvarchar](50) NULL,
	[DateOfBirth] [date] NULL,
	[PlaceOfBirth] [nvarchar](1000) NULL,
	[CountryOfBirth] [nvarchar](1000) NULL,
	[AddressStreet] [nvarchar](1000) NULL,
	[AddressNumber] [nvarchar](10) NULL,
	[AddressPostalCode] [nvarchar](1000) NULL,
	[AddressCity] [nvarchar](1000) NULL,
	[Password] [nvarchar](1000) NULL,
 CONSTRAINT [PK_People] PRIMARY KEY CLUSTERED 
(
	[PeopleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PeopleSchedule]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PeopleSchedule](
	[SchedulePeopleId] [bigint] NOT NULL,
	[StartTime] [datetime2](7) NULL,
	[PeopleId] [bigint] NULL,
	[VaxCentreId] [bigint] NULL,
	[LineId] [bigint] NULL,
 CONSTRAINT [PK_PeopleSchedule] PRIMARY KEY CLUSTERED 
(
	[SchedulePeopleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Stock]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Stock](
	[StockId] [bigint] NOT NULL,
	[Quantity] [int] NULL,
	[VaccinId] [bigint] NULL,
	[VaxCentreId] [bigint] NULL,
 CONSTRAINT [PK_Stock] PRIMARY KEY CLUSTERED 
(
	[StockId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Vaccin]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Vaccin](
	[VaccinId] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](1000) NULL,
	[AgeMin] [int] NULL,
	[DoseMin] [int] NULL,
	[Booster] [bit] NULL,
 CONSTRAINT [PK_Vaccin] PRIMARY KEY CLUSTERED 
(
	[VaccinId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VaxCentre]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VaxCentre](
	[VaxCentreId] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](1000) NULL,
	[AddressStreet] [nvarchar](1000) NULL,
	[AddressNumber] [nvarchar](100) NULL,
	[AddressCity] [nvarchar](1000) NULL,
 CONSTRAINT [PK_VaxCentre] PRIMARY KEY CLUSTERED 
(
	[VaxCentreId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VaxCentreSchedule]    Script Date: 23/06/2022 17:42:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VaxCentreSchedule](
	[VaxCentreScheduleId] [bigint] IDENTITY(1,1) NOT NULL,
	[Start] [datetime2](7) NULL,
	[Stop] [datetime2](7) NULL,
	[VaxCentreId] [bigint] NULL,
 CONSTRAINT [PK_VaxCentreSchedule] PRIMARY KEY CLUSTERED 
(
	[VaxCentreScheduleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[People] ON 

INSERT [dbo].[People] ([PeopleId], [Firstname], [Lastname], [NationalNumber], [DateOfBirth], [PlaceOfBirth], [CountryOfBirth], [AddressStreet], [AddressNumber], [AddressPostalCode], [AddressCity], [Password]) VALUES (6, N'Ian', N'Murdock', N'6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'$2a$10$jOuOOGjsVqK/5Yhr6NK9aOKZvIS/FQ9A9vCVOhjNsoeBkRsgUDGia')
SET IDENTITY_INSERT [dbo].[People] OFF
GO
SET IDENTITY_INSERT [dbo].[Vaccin] ON 

INSERT [dbo].[Vaccin] ([VaccinId], [Name], [AgeMin], [DoseMin], [Booster]) VALUES (1, N'Pfizer', 12, 2, 1)
INSERT [dbo].[Vaccin] ([VaccinId], [Name], [AgeMin], [DoseMin], [Booster]) VALUES (2, N'Moderna', 18, 2, 0)
SET IDENTITY_INSERT [dbo].[Vaccin] OFF
GO
SET IDENTITY_INSERT [dbo].[VaxCentre] ON 

INSERT [dbo].[VaxCentre] ([VaxCentreId], [Name], [AddressStreet], [AddressNumber], [AddressCity]) VALUES (1, N'Hall Expo', N'Rue du Parc', N'1', N'Rue du Parc')
SET IDENTITY_INSERT [dbo].[VaxCentre] OFF
GO
ALTER TABLE [dbo].[EmployeeSchedule]  WITH CHECK ADD  CONSTRAINT [FK_EmployeeSchedule_Employee] FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[Employee] ([EmployeeId])
GO
ALTER TABLE [dbo].[EmployeeSchedule] CHECK CONSTRAINT [FK_EmployeeSchedule_Employee]
GO
ALTER TABLE [dbo].[EmployeeSchedule]  WITH CHECK ADD  CONSTRAINT [FK_EmployeeSchedule_Line] FOREIGN KEY([LineId])
REFERENCES [dbo].[Line] ([LineId])
GO
ALTER TABLE [dbo].[EmployeeSchedule] CHECK CONSTRAINT [FK_EmployeeSchedule_Line]
GO
ALTER TABLE [dbo].[EmployeeSchedule]  WITH CHECK ADD  CONSTRAINT [FK_EmployeeSchedule_VaxCentre] FOREIGN KEY([VaxCentreId])
REFERENCES [dbo].[VaxCentre] ([VaxCentreId])
GO
ALTER TABLE [dbo].[EmployeeSchedule] CHECK CONSTRAINT [FK_EmployeeSchedule_VaxCentre]
GO
ALTER TABLE [dbo].[Line]  WITH CHECK ADD  CONSTRAINT [FK_Line_VaxCentre] FOREIGN KEY([VaxCentreId])
REFERENCES [dbo].[VaxCentre] ([VaxCentreId])
GO
ALTER TABLE [dbo].[Line] CHECK CONSTRAINT [FK_Line_VaxCentre]
GO
ALTER TABLE [dbo].[PeopleSchedule]  WITH CHECK ADD  CONSTRAINT [FK_PeopleSchedule_Line] FOREIGN KEY([LineId])
REFERENCES [dbo].[Line] ([LineId])
GO
ALTER TABLE [dbo].[PeopleSchedule] CHECK CONSTRAINT [FK_PeopleSchedule_Line]
GO
ALTER TABLE [dbo].[PeopleSchedule]  WITH CHECK ADD  CONSTRAINT [FK_PeopleSchedule_People] FOREIGN KEY([PeopleId])
REFERENCES [dbo].[People] ([PeopleId])
GO
ALTER TABLE [dbo].[PeopleSchedule] CHECK CONSTRAINT [FK_PeopleSchedule_People]
GO
ALTER TABLE [dbo].[PeopleSchedule]  WITH CHECK ADD  CONSTRAINT [FK_PeopleSchedule_VaxCentre] FOREIGN KEY([VaxCentreId])
REFERENCES [dbo].[VaxCentre] ([VaxCentreId])
GO
ALTER TABLE [dbo].[PeopleSchedule] CHECK CONSTRAINT [FK_PeopleSchedule_VaxCentre]
GO
ALTER TABLE [dbo].[Stock]  WITH CHECK ADD  CONSTRAINT [FK_Stock_Vaccin] FOREIGN KEY([VaccinId])
REFERENCES [dbo].[Vaccin] ([VaccinId])
GO
ALTER TABLE [dbo].[Stock] CHECK CONSTRAINT [FK_Stock_Vaccin]
GO
ALTER TABLE [dbo].[Stock]  WITH CHECK ADD  CONSTRAINT [FK_Stock_VaxCentre] FOREIGN KEY([VaxCentreId])
REFERENCES [dbo].[VaxCentre] ([VaxCentreId])
GO
ALTER TABLE [dbo].[Stock] CHECK CONSTRAINT [FK_Stock_VaxCentre]
GO
ALTER TABLE [dbo].[VaxCentreSchedule]  WITH CHECK ADD  CONSTRAINT [FK_VaxCentreSchedule_VaxCentre] FOREIGN KEY([VaxCentreId])
REFERENCES [dbo].[VaxCentre] ([VaxCentreId])
GO
ALTER TABLE [dbo].[VaxCentreSchedule] CHECK CONSTRAINT [FK_VaxCentreSchedule_VaxCentre]
GO
USE [master]
GO
ALTER DATABASE [IpamVax] SET  READ_WRITE 
GO
