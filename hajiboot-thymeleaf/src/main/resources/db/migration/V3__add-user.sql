create table users (
    username varchar(100) not null primary key
    , encoded_password varchar(255)
)
;

insert into users (
    username
    , encoded_password
) values (
    'user1'
    , 'a9c9b414a4a31a5e39cf73dd4a267d1a3a14c2ed8a8d2b68341ba2ac4587bf1509de75ef8b5407e8'
)
;

insert into users (
    username
    , encoded_password
) values (
    'user2'
    , 'a9c9b414a4a31a5e39cf73dd4a267d1a3a14c2ed8a8d2b68341ba2ac4587bf1509de75ef8b5407e8'
)
;

alter table customers add
    username varchar(100) not null default 'user1'
;

alter table customers add
    constraint fk_customers_username foreign key (username) references users
;
