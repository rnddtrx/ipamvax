USE [IpamVax]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[EmployeeSchedule]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Line]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[People]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PeopleSchedule]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Stock]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Vaccin]    Script Date: 13/06/2022 17:59:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Vaccin](
	[VaccinId] [bigint] IDENTITY(1,1) NOT NULL,
	[VaccinName] [nvarchar](1000) NULL,
	[VaccinAgeMin] [int] NULL,
	[VaccinDoseMin] [int] NULL,
	[VaccinBooster] [bit] NULL,
 CONSTRAINT [PK_Vaccin] PRIMARY KEY CLUSTERED 
(
	[VaccinId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VaxCentre]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VaxCentreSchedule]    Script Date: 13/06/2022 17:59:27 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[People] ON 

INSERT [dbo].[People] ([PeopleId], [Firstname], [Lastname], [NationalNumber], [DateOfBirth], [PlaceOfBirth], [CountryOfBirth], [AddressStreet], [AddressNumber], [AddressPostalCode], [AddressCity], [Password]) VALUES (6, N'Ian', N'Murdock', N'6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'$2a$10$jOuOOGjsVqK/5Yhr6NK9aOKZvIS/FQ9A9vCVOhjNsoeBkRsgUDGia')
SET IDENTITY_INSERT [dbo].[People] OFF
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
