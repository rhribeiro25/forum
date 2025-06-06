create table response(
    id bigint not null auto_increment,
    message varchar(300) not null,
    create_date datetime not null,
    topic_id bigint not null,
    author_id bigint not null,
    solution int(1) not null,
    primary key(id),
    foreign key(topic_id) references topic(id),
    foreign key(author_id) references user(id)
);