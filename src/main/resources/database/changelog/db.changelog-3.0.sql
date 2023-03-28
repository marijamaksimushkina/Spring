--liquibase formatted sql

--changeset mariya:1
ALTER TABLE users
ADD COLUMN image VARCHAR(64);

--changeset mariya:2
ALTER TABLE users_aud
ADD COLUMN image VARCHAR(64);
