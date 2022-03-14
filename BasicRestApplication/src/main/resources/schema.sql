create table Location
(
	id varchar2(100) not null IDENTITY,
	name varchar2(255) not null,
	primary key(id)
);

INSERT INTO Location VALUES (11, 'Delhi');    
INSERT INTO Location VALUES (12, 'Kanpur');    
INSERT INTO Location VALUES (13, 'Lucknow');    