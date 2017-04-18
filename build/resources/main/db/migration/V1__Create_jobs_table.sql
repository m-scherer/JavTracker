CREATE TABLE jobs(
  id SERIAL PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  interest_level INT,
  applied_on DATE
);