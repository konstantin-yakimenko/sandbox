CREATE SEQUENCE persons_seq START 1001;
CREATE TABLE persons (
    person_id integer PRIMARY KEY DEFAULT nextval('persons_seq'),
    name varchar(255) NOT NULL,
    surname varchar(255) NOT NULL,
    second_name varchar(255),
    age integer not null check ( age > 0 and age < 150)
);
