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

insert into teachers (first_name, last_name, email) values ('Michael', 'Lambert', 'michael.lambert@techelevator.com');
insert into teachers (first_name, last_name, email) values ('Daniel', 'Commins', 'daniel.commins@techelevator.com');

insert into students (first_name, last_name, email, teacher_id) values ('Beau', 'Blevins', 'bblevins@gmail.com', 1);
insert into students (first_name, last_name, email, teacher_id) values ('Cina', 'Noel', 'cnoel@gmail.com', 1);
insert into students (first_name, last_name, email, teacher_id) values ('Eddy', 'Guo', 'eguo@gmail.com', 1);

insert into students (first_name, last_name, email, teacher_id) values ('Justin', 'Wong', 'jwong@gmail.com', 2);
insert into students (first_name, last_name, email, teacher_id) values ('Lena', 'Johnson', 'ljohnson@gmail.com', 2);
insert into students (first_name, last_name, email, teacher_id) values ('Raina', 'Vincelli', 'rvincelli@gmail.com', 2);

commit;