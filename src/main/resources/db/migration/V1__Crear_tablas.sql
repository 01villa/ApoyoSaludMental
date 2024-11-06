-- Create users table
CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL UNIQUE
);

-- Create therapists table
CREATE TABLE therapists (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            specialty VARCHAR(255) NOT NULL
);

-- Create appointments table
CREATE TABLE appointments (
                              id SERIAL PRIMARY KEY,
                              user_id BIGINT NOT NULL,
                              therapist_id BIGINT NOT NULL,
                              appointment_time TIMESTAMP NOT NULL,
                              FOREIGN KEY (user_id) REFERENCES users(id),
                              FOREIGN KEY (therapist_id) REFERENCES therapists(id)
);
