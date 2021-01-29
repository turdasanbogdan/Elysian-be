DROP TABLE IF EXISTS stocks CASCADE;
DROP TABLE IF EXISTS drugs CASCADE;
DROP TABLE IF EXISTS pharmacies CASCADE;
CREATE TABLE drugs(

	drug_id int PRIMARY KEY,
	name varchar(255),
	type varchar(255)

);

CREATE TABLE pharmacies(

    pharmacy_id int PRIMARY KEY,
    name varchar(255),
    address varchar(255),
    city varchar(255),
    phone varchar(255)

);

CREATE TABLE stocks(

    stock_id int PRIMARY KEY,
    pharmacy_id int,
    drug_id int,
    quantity int


);

INSERT INTO drugs values (1, 'Olaflur', 'COMPRIMATE');
INSERT INTO drugs values (2, 'Clorhexidina', 'COMPRIMATE');
INSERT INTO drugs values (3, 'Tiamina', 'SIROP');
INSERT INTO drugs values (4, 'Calciu', 'SIROP');
INSERT INTO drugs values (5, 'Alle gel', 'UNGUENT');
INSERT INTO drugs values (6, 'Adrenalina Terapia', 'UNGUENT');
INSERT INTO drugs values (7, 'Fenol', 'SPARY');

INSERT INTO pharmacies values (1, 'Catena', 'Strada Garii', 'Bucuresti', '0767778891');
INSERT INTO pharmacies values (2, 'HelpNet', 'Bulevardul unirii', 'Bucuresti', '0372409405');
INSERT INTO pharmacies values (3, 'Medimfarm', 'Aleea Stundetilor', 'Timisoara', '0256202171');
INSERT INTO pharmacies values (4, 'Farmavet', 'Gheorghe Doja', 'Timisoara', '0254251261');
INSERT INTO pharmacies values (5, 'Sicofarm S.R.L', 'Mihail Kogalniceanu', 'Iasi', '0723135300');
INSERT INTO pharmacies values (6, 'Top-Farm', 'Alexandru Ioan Cuza', 'Iasi', '0266338113');
INSERT INTO pharmacies values (7, 'InfoFarm', 'Strada Garii', 'Cluj', '0254241505');
INSERT INTO pharmacies values (8, 'GeroFarm', 'Strada Garii', 'Cluj', '0372409406');

INSERT INTO stocks values(1, 1, 1, 100);
INSERT INTO stocks values(2, 1, 2, 50);
INSERT INTO stocks values(3, 2, 3, 101);
INSERT INTO stocks values(4, 2, 4, 60);
INSERT INTO stocks values(5, 3, 5, 100);
INSERT INTO stocks values(6, 3, 6, 200);
INSERT INTO stocks values(7, 4, 7, 300);
INSERT INTO stocks values(8, 4, 1, 10);
INSERT INTO stocks values(9, 5, 2, 11);
INSERT INTO stocks values(10, 5, 3, 80);
INSERT INTO stocks values(11, 6, 4, 350);
INSERT INTO stocks values(12, 7, 5, 10);
INSERT INTO stocks values(13, 7, 6, 20);
INSERT INTO stocks values(14, 7, 7, 30);
INSERT INTO stocks values(15, 7, 1, 50);
INSERT INTO stocks values(16, 7, 2, 60);
INSERT INTO stocks values(17, 8, 1, 100);
INSERT INTO stocks values(18, 8, 2, 100);
INSERT INTO stocks values(19, 8, 3, 100);

