DROP DATABASE IF EXISTS px_treasure_box;

CREATE DATABASE px_treasure_box
    WITH OWNER = projx_owner;

DROP SCHEMA IF EXISTS px_schema;

CREATE SCHEMA px_schema
    AUTHORIZATION projx_owner;