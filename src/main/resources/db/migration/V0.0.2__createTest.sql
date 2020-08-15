CREATE TABLE tests (
    key1_id integer NOT NULL,
    key2_id integer NOT NULL,
    value varchar(255),
    PRIMARY KEY(key1_id, key2_id)
);
