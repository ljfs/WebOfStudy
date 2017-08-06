use ManagerDB
go
select * from t_person where pProvince != '河南' and pProvince != '四川' and pProvince != '江苏' and pProvince != '河北' and pProvince != '江西' and pProvince != '黑龙江' and pProvince != '广东' and pProvince != '贵州' and pProvince != '山东' and pProvince != '广西' and pProvince != '湖北'
select* from Subjects
insert into t_person(pName,pGender,pAge,pQId,pSubjects) values('司玉静','女',16,'2180839919','2,3')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('李林夕','男',16,'四川','遂宁','15828956950','4','1359890473')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('李昊哲','男',15,'河南','郑州','15225170125','3,4,5,6,8,9,11','1213062069')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('刘文磊','男',20,'河南','郑州','18639470171','15','1508200401')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('张志杰','男',16,'河南','焦作','13721475679','3,8','1747296388')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pSubjects,pQId) values('于彦钊','男',21,'河南','焦作','2','1067610614')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('彭高乐','女',13,'江苏','无锡','15251509796','3,8,9,10','2646878949')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pSubjects,pQId) values('朱爱君','女',16,'河北','沧州','3,8','2362253823')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('邓芳梅','女',16,'江西','南昌','15083993126','14,15','2795875189')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('杨智浩','男',19,'河南','焦作','15039169365','15,16','1248074893')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('刘传芳','女',14,'河南','焦作','15039169365','2,3,8','2508947885')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('刘胜航','男',15,'河南','郑州','18903825666','3,8,14','1291441558')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('张悦','女',18,'黑龙江','铁力',null,'3,8','2493998897')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('牟正帅','男',13,'河南','郑州','13073705095','6','376712068')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('陈婷婷','女',15,'广东','南兴','15875981948','16,15','3387312487')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('李思成','男',17,'四川','遂宁','15328517912','4,5','1476907630')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('梁林俐','女',18,'贵州','贵阳','13765169140','15,16','2496283859')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('胡卓炎','女',13,'河南','焦作','18436256229','3,8,16','1191572783')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('张宇','男',21,'河南','焦作','17630454476','16','190957192')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('王艺杰','男',20,'河南','焦作',null,'3,8','931551413')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('李英腾','男',20,'河南',null,null,'4,11','1576923508')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('刘俊沣','男',21,'河南','焦作','13838902742','java深入编程，后期影视编辑，超弦理论','271715883,2789395212')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('丁伟晨','男',17,'河南','焦作',null,'3,8','1119185334')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('谢雯芳','女',17,'河南','焦作','13849596745','1,3,8','3317877714,1598716848,3222698102')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('陈霖','男',20,'河南','新乡','13781991906','9,10,12,15','1216494923')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('王啸林','男',18,'河南','郑州','15003875654','3,10','1910297674')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('冀俊涛','男',17,'河南','郑州','15890664451','5','1191569886')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('洪嘉慧','女',18,'江苏','姜堰','15298521663','3,8','958834946')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('刘畅之','男',20,'河北','石家庄','15383113219','9,10,15,16','1438571001')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('刘研','女',14,'河南','焦作','13462496475','2,3,8,14,15,16','2596545677,3574446921')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('阳怡蚺','女',15,'四川','广安','18582605937','3,8','414904616')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('程秀艳','女',17,'山东','聊城','15065523198','3,8,15','3133158865')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('向利君','女',13,'四川',null,null,'3,8,13','3382991506')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('李玉环','女',18,'广西','梧州','18276468617','3,8','2116496709')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('安屹','女',20,'山东',null,null,'1','740844377')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('朱明月','女',16,'河北','沧州',null,'5,7,11','3077911478')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('刘晨曦','男',21,'河南','焦作','13203974850','9','794400687')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('温雅玉','女',23,null,null,null,'4','1828526557')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('宋国洋','男',19,'河南','郑州','15139877091','2,5,10','957363383')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('司双力','男',19,'河南','郑州','13849420297','10,15','474076900')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('朱纵野','男',20,'山东','青岛','17866637952','1,4,13','408561045')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId) values('夏天赐','男',16,'湖北','武汉','18872275205','2,3,4,7,8,9,10,11,15','1719351621')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('李昂','男',17,'河南','郑州',null,'8','2102392051',1)
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('罗宝祥','男',17,'安徽',null,'15956040412','3,5,8','2474317818',1)
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('周世豪','男',15,'河南','郑州','15039051976','3,8','3146553375',1)
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('陈怡洁','女',16,'河南','郑州','18530922962','3','2386175636',1)
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('孙铭泽','男',17,'河南','焦作',null,'3,10','2463396506','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('梁贵蒙','女',17,'河南','新乡',null,'3,4,7','2105009424','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('李敏','女',18,'河南','焦作',null,'15','732395186','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('翟慧杰','女',16,'河南','焦作',null,'3,8','1822002350','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('张欣瑶','女',16,'河南','焦作',null,'1,15,16','1617583550','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('裴英豪','男',14,'河南','焦作',null,'3,8','2818660956','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('常梦妍','女',16,'河南','焦作',null,'2,3','3176181079','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('李佳卿','女',18,'河南','焦作',null,'1','956217223','1')
insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values('都蔚琳','女',14,'河南','焦作',null,'3,8','2593113136',1)





update t_person set pQId = '3387312487,2793887986' where pName = '陈婷婷'
update t_person set pQId = '2496283859,2373374062' where pName = '梁林俐'
update t_person set pSubjects = '1,2,3' where id = 1
update t_person set pName = '李江环' where id = 34
update t_person set pProvince = '广东' where pName = '温雅玉'
update t_person set pReputation = '0' where pQId = '2105009424'
update t_person set pReputation = '0' where id = 17
update t_person set pProvince = '河南' ,pCity = '新乡' where id = 1
select * from t_person where pQId = '2102392051'
update t_person set  pSubjects = '6,8' where pQId = '2102392051'
select * from t_person where pQId = '1213062069'
update t_person set pSubjects = '3,4,5,6,8,9,11,19,21,22,23' where pQId = '1213062069'





select count(*) '广西' from t_person where pProvince ='广西'
drop table t_person
