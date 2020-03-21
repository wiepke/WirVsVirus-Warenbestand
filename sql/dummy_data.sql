#inserts dummy data into the tables

INSERT INTO market VALUES
(
	1, 
	"_track_", 
	"store name", 
	"store address, 1",
	"supermarkt",
	3.1415926,
	2.71
);

INSERT INTO product_market VALUES
(
    1,
    1,
    100,
    '2020-01-01 10:10:10'
);

INSERT INTO products VALUES
(
	1,
	"product name"
);

INSERT INTO market_stats VALUES
(
	1,
	5,
	250,
	15.5
);
