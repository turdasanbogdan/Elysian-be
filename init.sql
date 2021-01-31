
DROP TABLE IF EXISTS stocks CASCADE;
DROP TABLE IF EXISTS drugs CASCADE;
DROP TABLE IF EXISTS pharmacies CASCADE;
CREATE TABLE drugs(

	id int PRIMARY KEY,
	name varchar(255),
	type varchar(255)

);

CREATE TABLE pharmacies(

    id int PRIMARY KEY,
    address varchar(255),
    city varchar(255),
    name varchar(255),
    phone varchar(255)

);

CREATE TABLE stocks(

    id int PRIMARY KEY,
    quantity int,
    drug_id int,
    pharmacy_id int

);

INSERT INTO drugs values (1, 'Olaflur', 'COMPRIMATE');
INSERT INTO drugs values (2, 'Clorhexidina', 'COMPRIMATE');
INSERT INTO drugs values (3, 'Tiamina', 'SIROP');
INSERT INTO drugs values (4, 'Calciu', 'SIROP');
INSERT INTO drugs values (5, 'Alle gel', 'UNGUENT');
INSERT INTO drugs values (6, 'Adrenalina Terapia', 'UNGUENT');
INSERT INTO drugs values (7, 'Fenol', 'SPARY');

INSERT INTO pharmacies values (1, 'Strada Garii','Bucuresti','Catena', '0767778891');
INSERT INTO pharmacies values (2, 'Bulevardul unirii','Bucuresti','HelpNet',  '0372409405');
INSERT INTO pharmacies values (3,  'Aleea Stundetilor', 'Timisoara','Medimfarm', '0256202171');
INSERT INTO pharmacies values (4,  'Gheorghe Doja', 'Timisoara', 'Farmavet','0254251261');
INSERT INTO pharmacies values (5, 'Mihail Kogalniceanu', 'Iasi', 'Sicofarm S.R.L', '0723135300');
INSERT INTO pharmacies values (6,  'Alexandru Ioan Cuza', 'Iasi','Top-Farm', '0266338113');
INSERT INTO pharmacies values (7,  'Strada Garii', 'Cluj','InfoFarm', '0254241505');
INSERT INTO pharmacies values (8,  'Strada Garii', 'Cluj', 'GeroFarm','0372409406');

INSERT INTO stocks values(1,100, 1, 1);
INSERT INTO stocks values(2,50, 2, 1);
INSERT INTO stocks values(3,101, 3, 2);
INSERT INTO stocks values(4,60, 4, 2);
INSERT INTO stocks values(5,100, 5, 3);
INSERT INTO stocks values(6,200, 6, 3);
INSERT INTO stocks values(7,300, 7, 4);
INSERT INTO stocks values(8,10, 1, 4);
INSERT INTO stocks values(9,11, 2, 5);
INSERT INTO stocks values(10,80, 3, 5);
INSERT INTO stocks values(11,350, 4, 6);
INSERT INTO stocks values(12, 10,5, 7);
INSERT INTO stocks values(13, 20,6, 7);
INSERT INTO stocks values(14, 30,7, 7);
INSERT INTO stocks values(15, 50,1, 7);
INSERT INTO stocks values(16, 60,2, 7);
INSERT INTO stocks values(17, 100,1, 8);
INSERT INTO stocks values(18, 100,2, 8);
INSERT INTO stocks values(19,100, 3, 8);
