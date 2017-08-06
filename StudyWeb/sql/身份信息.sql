use ManagerDB
go
select * from ident order by id 
insert into ident(identityName) values('学生')
insert into ident(identityName) values('教师')
insert into ident(identityName) values('管理员')
insert into ident(identityName) values('底层管理员')
insert into ident(identityName) values('基层管理员')


update p_login set ident = 2 where userid =10011
update p_login set ident = 2 where userid =10021
update p_login set ident = 2 where userid =10041
update p_login set ident = 2 where userid =10017

select ps.pName '姓名',ps.pGender '性别',ps.pAge '年龄', lg.userid '登录账号' , it.identityName '身份' from t_person ps, p_login lg,ident it where ps.id = lg.pid and lg.ident = it.id






drop table ident