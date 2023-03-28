--liquibase formatted sql

--changeset mariya:1
ALTER TABLE users_aud
DROP CONSTRAINT users_aud_username_key;

--changeset mariya:2
ALTER TABLE users_aud
ALTER COLUMN username DROP NOT NULL;

