create table account
(
id integer not null auto_increment,
accountid varchar(10),
accountName varchar(20),
accountStatus varchar(5),
accountStartDate DATE,
accountEndDate Date,
siteid varchar(10),
sitename varchar(25),
location varchar(25),
sitestartDate date,
siteendDate date,
sitestatus varchar(5),
containerid varchar(10),
containername varchar(20),
containertype varchar(5),
containerstatus varchar(5),
startDate date,
endDate date
);

insert into account
(accountid ,accountName ,accountStatus ,accountStartDate,accountEndDate,siteid ,sitename ,location ,sitestartDate,siteendDate,sitestatus ,containerid ,containername ,containertype,containerstatus,startDate,endDate)values
('A12345','A12345','A',sysdate,sysdate,'S1','S1NM','AZ',sysdate,sysdate,'A','C1','C1','S','Open',sysdate,sysdate);
insert into account
(accountid ,accountName ,accountStatus ,accountStartDate,accountEndDate,siteid ,sitename ,location ,sitestartDate,siteendDate,sitestatus ,containerid ,containername ,containertype,containerstatus,startDate,endDate)values
('A12345','A12345','A',sysdate,sysdate,'S1','S1NM','AZ',sysdate,sysdate,'A','C2','C2','S','Open',sysdate,sysdate);
insert into account
(accountid ,accountName ,accountStatus ,accountStartDate,accountEndDate,siteid ,sitename ,location ,sitestartDate,siteendDate,sitestatus ,containerid ,containername ,containertype,containerstatus,startDate,endDate)values
('A12345','A12345','A',sysdate,sysdate,'S1','S1NM','AZ',sysdate,sysdate,'A','C3','C3','S','Open',sysdate,sysdate);
insert into account
(accountid ,accountName ,accountStatus ,accountStartDate,accountEndDate,siteid ,sitename ,location ,sitestartDate,siteendDate,sitestatus ,containerid ,containername ,containertype,containerstatus,startDate,endDate)values
('A12345','A12345','A',sysdate,sysdate,'S1','S1NM','AZ',sysdate,sysdate,'A','C4','C4','S','Open',sysdate,sysdate);
insert into account
(accountid ,accountName ,accountStatus ,accountStartDate,accountEndDate,siteid ,sitename ,location ,sitestartDate,siteendDate,sitestatus ,containerid ,containername ,containertype,containerstatus,startDate,endDate)values
('A12345','A12345','A',sysdate,sysdate,'S2','S2NM','AZ',sysdate,sysdate,'A','C1','C1','S','Open',sysdate,sysdate);
insert into account
(accountid ,accountName ,accountStatus ,accountStartDate,accountEndDate,siteid ,sitename ,location ,sitestartDate,siteendDate,sitestatus ,containerid ,containername ,containertype,containerstatus,startDate,endDate)values
('A12345','A12345','A',sysdate,sysdate,'S2','S2NM','AZ',sysdate,sysdate,'A','C2','C2','S','Open',sysdate,sysdate);
insert into account
(accountid ,accountName ,accountStatus ,accountStartDate,accountEndDate,siteid ,sitename ,location ,sitestartDate,siteendDate,sitestatus ,containerid ,containername ,containertype,containerstatus,startDate,endDate)values
('A12346','A12345','A',sysdate,sysdate,'S1','S1NM','AZ',sysdate,sysdate,'A','C1','C1','S','Open',sysdate,sysdate)