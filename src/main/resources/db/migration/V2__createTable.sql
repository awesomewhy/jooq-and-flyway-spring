DROP SCHEMA IF EXISTS jooqschema;

CREATE SCHEMA IF NOT EXISTS jooqschema AUTHORIZATION postgres;

DROP TABLE IF EXISTS jooqschema.users;
DROP TABLE IF EXISTS jooqschema.orders;

create table if not exists jooqschema.users (
    id         bigint primary key generated always as identity,
    first_name text,
    last_name  text,
    age        smallint,
    created_at timestamp
);

create table if not exists jooqschema.orders (
    id          bigint primary key generated always as identity,
    user_id     bigint,
    name        text,
    description text,
    price       numeric(38, 2)

    constraint fk_t_order_user_id foreign key (user_id) references jooqschema.users(id)
    on update cascade
    on delete cascade
);




