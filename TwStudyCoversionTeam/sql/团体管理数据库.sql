Create Database ManagerDB
on
(
	name = 'ManageDB',
	filename = 'E:\调味学习学术团体\twpxxxsttdata\ManageDB.mdf',
	size = 3MB,
	filegrowth = 25%
)
log on
(
	name = 'ManageDB_log',
	filename = 'E:\调味学习学术团体\twpxxxsttdata\ManageDB_log.ldf',
	size = 2MB,
	filegrowth = 20%
)
go
use ManagerDB
go
create table t_person
(
	id int primary key identity(1,1) not null, -- 序列号
	pName varchar(20),--成员姓名
	pAge int not null, --成员年龄
	pGender varchar(2) check(pGender = '男' or pGender =  '女'),--成员性别（限定为男或女）
	pProvince varchar(20) null,--成员所在省份
	pCity varchar(30) null,--成员所在城市
	pMBP varchar(11) null, --成员手机号
	pSubjects varchar(max) not null ,--成员学习科目
	pQId varchar(50) not null--成员QQ号
)
--科目表
create table Subjects
(
	id int identity(1,1) primary key, --科目序号
	sbj varchar(50) not null check(sbj != ' ' or sbj != '') --科目名称
)
--课程类型表
create table SubjectParent
(
	id int primary key identity(1,1) not null,--课程类型编号
	sbjParent varchar(10),--课程类型名称
	sbjId int foreign key references Subjects(id) null--对应的课程
)
--省份表
create table Province
(
	id int primary key identity(1,1) not null,--省份id
	Province varchar(20)--省份名称
)
--城市表
create table City
(
	id int primary key identity(1,1) not null,--城市id
	t_city varchar(50),--城市名称
	pid int foreign key references Province(id) not null--外键连接省份
)
--登录表
create table p_login
(
	userid int primary key identity(10000,1) not null ,--登录账号
	pid int foreign key references t_person(id),--外键连接学生的id编号
	password varchar(16) not null,--登录密码
	ident int not null--成员身份0为普通成员，1为教师，2为普通管理员，3为底层管理员
)
--成员身份表
create table ident
(
	id int primary key identity(0,1) not null,
	identityName varchar(20) unique not null
)
--========================================================--
--文件类别表
create table fileTyp
(
	id int primary key identity(1,1) not null,
	fileType varchar(20) not null -- 上传类型
)
--文件类型表
create table unfolder
(
	id int primary key identity(1,1) not null,
	typeid int foreign key references fileTyp(id), -- 文件类型编号，外键连接文件类型id
	fileName varchar(50) not null unique -- 上传文件的后缀名
)
--服务器信息表
create table servicemanager
(
	id int primary key identity(1,1) not null,
	serviceName varchar(100) not null, -- 服务器名称
	serviceIp varchar(13) not null, -- 服务器的IP地址
	serviceStatue int check(serviceStatue = 1 or serviceStatue = 0) default(0) -- 服务器的状态，1为启用，0为禁用
)
--服务器空间表
create table servicelocalurl
(
	id int primary key identity(1,1) not null,
	savePath varchar(100) not null, -- 服务器路径
	pathHomeSize int not null, -- 盘符剩余空间
	pathHomedescr varchar(50) not null -- 描述盘符的作用
)
--图片类型表
create table fileIconName
(
	id int primary key identity(1,1) not null,
	iconTypeName varchar(10) not null -- 图标后缀名
)
--图片信息表
create table fileIcon
(
	id int primary key identity(1,1) not null,
	fileIconSetPath varchar(max) not null, -- 文件的上传路径名
	fileIconSavePath varchar(max) not null, -- 文件图标的保存路径
	fileIconName varchar(100) not null, -- 文件图标名称
	fileIconNameId int foreign key references fileIconName(id) -- 图标的后缀名编号，外键连接图标后缀名表id，非空
)
--审核状态表
create table examineAndVerifyRank
(
	id int primary key identity(1,1) not null,
	passedStatus varchar(20) -- 审核状态
)
--文件信息表
create table fileMessage
(
	id int primary key identity(1,1),
	fileOfSubjectParentId int foreign key references SubjectParent(id), -- 系别编号，外键连接系别表id，非空
	fileOfSubjectId int foreign key references Subjects(id), -- 课程编号，外键连接课程表id，非空
	fileTypeId int foreign key references fileTyp(id), -- 文件类型编号，外键连接文件类型id，非空
	filenameId int foreign key references unfolder(id), -- 文件后缀名，外键连接文件后缀名id，非空
	fileText varchar(max) not null, -- 文件名称
	fileUpperId int foreign key references t_person(id), -- 上传者，外键连接成员id，非空
	fileSize int not null, -- 文件大小
	fileStatueId int foreign key references examineAndVerifyRank(id) , -- 上传状态
	fileSaveDate datetime not null, -- 上传日期
	fileIconId int foreign key references fileIcon(id) , -- 上传图标，外键连接图标id，非空
	fileSaveIPId int foreign key references servicemanager(id) , -- 保存文件服务器的IP地址，外键连接保存服务器的IP地址编号
	specialty int check(specialty = 1 or specialty = 0), -- 专业内容为1，非专业内容为0
	passed int  check(passed = 0 or passed = 1 or passed = 2 or passed = 3) default(1), -- 1表示待审核，2表示初审通过，3表示完全通过，0表示不通过
	passedDate datetime  --审核日期
)

--========================================================--

--审核类型表
create table fileImportant
(
	id int primary key identity(1,1) not null,
	special varchar(50) not null unique -- 是否专业文件审核
)
--文件权限表
create table examineAndVerifyPower
(
	id int primary key identity(1,1) not null,
	passedStatusId int foreign key references examineAndVerifyRank(id), -- 审核等级
	identId int foreign key references ident(id), -- 对应权限身份，外键对应身份信息表主键，非空
	special int foreign key references fileImportant(id) -- 对应文件权重编号，外键对应文件权重表，非空
)
--文件审核日志表
create table fileStatusLog
(
	id int primary key identity(1,1),
	fileId int foreign key references fileMessage(id), -- 文件编号
	passedStatusId int foreign key references examineAndVerifyRank(id), -- 审核状态
	passedStatusRemark varchar(max), -- 审核状态及原因备注
	remark varchar(max) -- 最终备注（审核未通过时备注原因）
)

--========================================================--
--广告信息表
create table advertisement
(
	id int primary key identity(1,1) not null,
	personId int foreign key references t_person(id) not null, -- 成员信息编号，外键对应成员信息表编号
	ident int foreign key references ident(id) check(ident = 1) not null, -- 成员身份编号，外键对应成员登录表身份编号
	theme varchar(40) not null, -- 广告主题
	upperDate datetime not null, -- 上传广告时间，非空，默认当前时间
	startDate datetime, -- 广告启用时间，允许为空，默认当前时间
	endDate datetime, -- 广告到期时间，允许为空，最少间隔三个月
	statusId int foreign key references examineAndVerifyRank(id) -- 审核状态，外键连接审核权限表id，非空
)

--========================================================--
--权限操作表
create table manageprower
(
	id int primary key identity(1,1) not null,
	disc varchar(50) not null unique -- 操作权限描述
)
--权限表
create table prower
(
	id int primary key identity(1,1) not null,
	manage varchar(50) not null unique, -- 对应功能表的功能
	checkeds varchar(20) not null, -- 直接传入表名操作权限
	objectnode varchar(20), -- 功能的父节点
	childnode int foreign key references manageprower(id), -- 1为只允许查询，2为允许查询修改，3为允许CURD操作 
	changepersonId int foreign key references t_person(id), -- 修改权限的执行者，外键对应成员信息编号
	orderident int foreign key references ident(id), -- 可执行权限操作的角色
	changedate datetime not null -- 修改角色操作权限的时间
)