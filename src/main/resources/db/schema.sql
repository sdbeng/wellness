DROP TABLE clinic IF EXISTS;

CREATE TABLE clinic (
  id         INTEGER IDENTITY PRIMARY KEY,
  name       VARCHAR(80),
  description    VARCHAR(255),
  location       VARCHAR(80),
  dateCreated   DATE,
  dateUpdated   DATE
);