create table test1(
    user_id varchar2(20) primary key,
    user_pw varchar2(20),
    nickname varchar2(20),
    phone varchar2(20),
    join_date date,
    update_date date,
    memo clob
);