USE sichereseinkaufen

CREATE TABLE market (
	market_id 			INT, #market ID
	googleTrack 		VARCHAR(255),
	name 				VARCHAR(255),
	address 			VARCHAR(255)
);

CREATE TABLE products(
	market_id 		INT, #market ID
	product_name 	VARCHAR(255),
	ammount 		INT,
	recorded_at 	TIMESTAMP
);

CREATE TABLE market_stats (
	market_id 		INT, #market ID
	amountOfPeople 	INT,
	sizeOfMarket 	INT,
	averagePresenceTime DECIMAL(6,4)
);