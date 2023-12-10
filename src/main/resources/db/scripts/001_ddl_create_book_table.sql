CREATE TABLE IF NOT EXISTS book(
                                   id serial primary key,
                                   name varchar(256) UNIQUE,
                                    author varchar(256)
    );