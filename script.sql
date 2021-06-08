create table task
(
    id serial
        constraint task_pk
            primary key,
    name text not null,
    color text,
    memory int
);

