create sequence seq_employees;

create table employees (
    id number(19,0) not null,
    name varchar2(255) not null,
    primary key (id)
);