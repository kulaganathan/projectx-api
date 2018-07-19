DROP TABLE IF EXISTS px_schema.px_users;

CREATE TABLE IF NOT EXISTS px_schema.px_users (
  userid BIGSERIAL CONSTRAINT pk_userid PRIMARY KEY,
  fname VARCHAR(25) NOT NULL,
  lname VARCHAR(25) NOT NULL,
  password VARCHAR(50) NOT NULL,
  is_active BOOLEAN NOT NULL,
  email VARCHAR(50) NOT NULL
);