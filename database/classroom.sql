begin transaction;

drop table if exists students, teachers;

create table teachers (
    id serial primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(200) not null
);

create table students (
    id serial primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(200) not null,
    teacher_id integer references teachers(id)
);

commit;