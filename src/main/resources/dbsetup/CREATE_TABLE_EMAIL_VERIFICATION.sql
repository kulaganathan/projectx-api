DROP TABLE IF EXISTS px_schema.px_email_verification;

CREATE TABLE IF NOT EXISTS px_schema.px_email_verification (
  verification_id INTEGER CONSTRAINT pk_email_verification PRIMARY KEY,
  userid INTEGER REFERENCES px_schema.px_users (userid),
  verification_code VARCHAR(50) NOT NULL,
  has_verified BOOLEAN NOT NULL
);