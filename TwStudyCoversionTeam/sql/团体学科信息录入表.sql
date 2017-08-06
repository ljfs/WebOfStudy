use ManagerDB
go
select * from Subjects -- where id >= 17
select s.id '编号' , sbj '课程名称' ,sp.sbjParent '类别' from SubjectParent sp,Subjects s where sp.id = s.spid or s.spid = null order by s.id
select * from SubjectParent

insert into  SubjectParent(sbjParent) values('中学课程')
insert into  SubjectParent(sbjParent) values('语言')
insert into  SubjectParent(sbjParent) values('体育')
insert into  SubjectParent(sbjParent) values('计算机')
insert into  SubjectParent(sbjParent) values('音乐')
insert into  SubjectParent(sbjParent) values('物理')
insert into  SubjectParent(sbjParent) values('哲学')

update SubjectParent set sbjParent = '中学课程' where id = 1 


insert into Subjects(sbj) values('日语')
insert into Subjects(sbj) values('陈式太极拳')
insert into Subjects(sbj) values('中学物理')
insert into Subjects(sbj) values('JAVA编程')
insert into Subjects(sbj) values('C语言编程')
insert into Subjects(sbj) values('C++编程')
insert into Subjects(sbj) values('C#编程')
insert into Subjects(sbj) values('中学数学')
insert into Subjects(sbj) values('大学数学')
insert into Subjects(sbj) values('大学物理')
insert into Subjects(sbj) values('SQLServer数据库初级编程')
insert into Subjects(sbj) values('《易经》')
insert into Subjects(sbj) values('电子琴')
insert into Subjects(sbj) values('钢琴')
insert into Subjects(sbj) values('乐理及音乐鉴赏')
insert into Subjects(sbj) values('声乐基础')
insert into Subjects(sbj) values('Word2010编辑基础')
insert into Subjects(sbj) values('MvBox混音使用与录制技巧')
insert into Subjects(sbj) values('安卓软件开发基础')
insert into Subjects(sbj) values('THML+CSS网页设计')
insert into Subjects(sbj) values('Javascript基础编程')
insert into Subjects(sbj) values('广义相对论基础')
insert into Subjects(sbj) values('量子力学基础')



update Subjects set spid = 2 where id = 1
update Subjects set spid = 3 where id = 2
update Subjects set spid = 1 where id = 3
update Subjects set spid = 4 where id = 4
update Subjects set spid = 4 where id = 5
update Subjects set spid = 4 where id = 6
update Subjects set spid = 4 where id = 7
update Subjects set spid = 1 where id = 8
update Subjects set spid = 4 where id = 11
update Subjects set spid = 7 where id = 12
update Subjects set spid = 5 where id = 13
update Subjects set spid = 5 where id = 14
update Subjects set spid = 5 where id = 15
update Subjects set spid = 5 where id = 16
update Subjects set spid = 5 where id = 18
update Subjects set spid = 4 where id = 19
update Subjects set spid = 4 where id = 20
update Subjects set spid = 4 where id = 21
update Subjects set spid = 6 where id = 22
update Subjects set spid = 6 where id = 23