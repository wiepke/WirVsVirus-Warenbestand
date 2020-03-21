USE sichereseinkaufen

drop table market;
drop table products;
drop table product_market;
drop table market_stats;

CREATE TABLE market (
	market_id 			INT UNIQUE,     # out own market ID
	googleTrack 		VARCHAR(255),   # placeID from google maps
	name 				VARCHAR(255),
	address 			VARCHAR(255),
	types               VARCHAR(255),   # supermarkt, grocery store, ...
	ltdtude             DECIMAL(6,4),
	lngtude             DECIMAL(6,4)
);

CREATE TABLE product_market (
	market_id 		INT, #market ID+
	product_id      INT,
	amount          INT,
	recorded_at 	TIMESTAMP
);

CREATE TABLE products(
	product_id      INT,
	product_name 	VARCHAR(255)
);

CREATE TABLE market_stats (
	market_id 		INT, #market ID
	amountOfPeople 	DECIMAL(6,4),
	sizeOfMarket 	INT,
	averagePresenceTime DECIMAL(6,4),
	recorded_at 	TIMESTAMP
);