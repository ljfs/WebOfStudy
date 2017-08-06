package com.study.web.entity;

/**
 * 成员实体类，用于登记成员信息
 * @version 1.0
 * @author 刘俊沣
 *
 */
public class Persion {
	/**
	 * 整型 id,对应数据表中的id
	 */
	private int id;
	/**
	 * 字符串类型的name，对应数据表中的pName,<br>
	 * 用于保存用户的姓名
	 */
	private String name;
	/**
	 * 整型age，对应数据表中的pAge,<br>
	 * 用于保存成员的年龄，在setter访问器中对年龄进行限制
	 */
	private int age;
	/**
	 * 字符串类型的gender，对应数据表中的pGender,<br>
	 * 用于保存成员的性别，在setter访问器中对成员的性别限制为男或女
	 */
	private String gender;
	/**
	 * 字符串类型的province，对应数据表中的pProvince,<br>
	 * 用于保存省份信息
	 */
	private String province;
	/**
	 * 字符串类型的city，对应数据表中的pCity,<br>
	 * 用于保存成员的城市信息
	 */
	private String city;
	/**
	 * 字符串类型的moblePhone，对应数据表中的pMBP,<br>
	 * 保存成员的手机号码信息
	 */
	private String moblePhone;
	/**
	 * 字符串类型的subject，对应数据表中的pSubject,<br>
	 * 保存由成员的选择添加的科目的编号组成的字符串
	 */
	private String subject;
	/**
	 * 字符串类型的Qid,对应数据表中的pQid,<br>
	 * 保存成员的QQ号码
	 */
	private String Qid;
	/**
	 * 整型的reputation，对应数据表中的pReputation,<br>
	 * 记录成员的信誉度，默认值为1
	 */
	private int reputation;
	/**
	 * 无参数构造方法，用于实例化一个无任何参数的成员实体类<br>
	 * 仅仅作用于实例化
	 */
	public Persion() {
		super();
	}
	/**
	 * 含参构造方法，用于直接添加参数，<br>
	 * 并且仅仅不传递id属性，以及非必填项
	 * @param name
	 * 传入成员的姓名参数
	 * @param age
	 * 传入成员的年龄参数
	 * @param gender
	 * 传入成员的性别参数
	 * @param subject
	 * 传入科目编号组成的字符串
	 * @param qid
	 * 传入成员的QQ号码
	 * @param reputation
	 * 传入成员的信誉度
	 */
	public Persion(String name, int age, String gender, String subject,
			String qid, int reputation) {
		super();
		this.name = name;
		this.age = age;
		//判断传入的参数是否为男或女
		if(gender.equals("男") || gender.equals("女")){
			//如果传入的参数符合条件则执行赋值操作
			this.gender = gender;
		}else{
			//否则默认值为男
			this.gender = "男";
		}
		this.subject = subject;
		Qid = qid;
		this.reputation = reputation;
	}
	/**
	 * 含参构造方法，用于直接添加参数，<br>
	 * 并且仅仅传递无默认值的构造方法
	 * @param name
	 * 传入成员的姓名
	 * @param age
	 * 传入成员的年龄
	 * @param gender
	 * 传入成员的性别
	 * @param province
	 * 传入成员的所在省份
	 * @param city
	 * 传入成员的城市信息
	 * @param subject
	 * 传入成员的所选课程
	 * @param qid
	 * 传入成员的QQ号码
	 */
	public Persion(String name, int age, String gender, String province,
			String city, String subject, String qid) {
		super();
		this.name = name;
		this.age = age;
		//判断传入的参数是否为男或女
		if(gender.equals("男") || gender.equals("女")){
			//如果传入的参数符合条件则执行赋值操作
			this.gender = gender;
		}else{
			//否则默认值为男
			this.gender = "男";
		}
		this.province = province;
		this.city = city;
		this.subject = subject;
		Qid = qid;
	}
	/**
	 * 含参构造方法，用于直接添加参数，<br>
	 * 传入所除必填内容之外含省份参数的属性
	 * @param name
	 * 传入成员的姓名参数
	 * @param age
	 * 传入成员的年龄参数
	 * @param gender
	 * 传入成员的性别参数
	 * @param province
	 * 传入成员的所在省份信息
	 * @param subject
	 * 传入成员的所选科目信息
	 * @param qid
	 * 传入成员的QQ信息
	 */
	public Persion(String name, int age, String gender, String province,
			String subject, String qid) {
		super();
		this.name = name;
		this.age = age;
		//判断传入的参数是否为男或女
		if(gender.equals("男") || gender.equals("女")){
			//如果传入的参数符合条件则执行赋值操作
			this.gender = gender;
		}else{
			//否则默认值为男
			this.gender = "男";
		}
		this.province = province;
		this.subject = subject;
		Qid = qid;
	}
	/**
	 * 含参构造方法，用于直接添加参数，<br>
	 * 传入数据表中对应的所有参数
	 * @param id
	 * 传入成员的编号列
	 * @param name
	 * 传入成员的姓名信息
	 * @param age
	 * 传入成员的年龄参数
	 * @param gender
	 * 传入成员的性别参数
	 * @param province
	 * 传入成员的所在省份信息
	 * @param city
	 * 传入成员的所在城市信息
	 * @param moblePhone
	 * 传入成员的手机号码信息
	 * @param subject
	 * 传入成员所选科目的编号组成的字符串信息
	 * @param qid
	 * 传入成员的QQ号码
	 * @param reputation
	 * 传入成员的信誉度
	 */
	public Persion(int id, String name, int age, String gender,
			String province, String city, String moblePhone, String subject,
			String qid, int reputation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		//判断传入的参数是否为男或女
		if(gender.equals("男") || gender.equals("女")){
			//如果传入的参数符合条件则执行赋值操作
			this.gender = gender;
		}else{
			//否则默认值为男
			this.gender = "男";
		}
		this.province = province;
		this.city = city;
		this.moblePhone = moblePhone;
		this.subject = subject;
		Qid = qid;
		this.reputation = reputation;
	}
	/**
	 * 获取并返回成员的编号
	 * @return
	 * 返回一个整型的id编号
	 */
	public int getId() {
		return id;
	}
	/**
	 * 获取成员的编号并传入实体类中
	 * @param id
	 * 成员的id编号
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取并返回成员的姓名信息
	 * @return
	 * 返回一个字符串类型的成员姓名信息
	 */
	public String getName() {
		return name;
	}
	/**
	 * 获取成员的姓名并传入实体类中
	 * @param name
	 * 传入参数为姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取并返回成员的年龄
	 * @return
	 * 返回一个整型的年龄信息
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 获取并保存符合条件的成员年龄信息并保存在实体类中
	 * @param age
	 * 传入参数为成员的年龄信息，有效范围为7~80岁<br>
	 * 如果年龄不在选择范围内，则默认为7岁
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 获取并返回成员的性别
	 * @return
	 * 返回一个字符串类型的成员性别信息
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 获取符合条件的成员性别信息并保存在实体类中
	 * @param gender
	 * 传入参数为成员的性别信息，有效值为“男”或“女”<br>
	 * 如果未传入参数或传入参数不在范围内，<br>
	 * 则默认为男
	 */
	public void setGender(String gender) {
		//判断传入的参数是否为男或女
		if(gender.equals("男") || gender.equals("女")){
			//如果传入的参数符合条件则执行赋值操作
			this.gender = gender;
		}else{
			//否则默认值为男
			this.gender = "男";
		}
	}
	/**
	 * 获取并返回成员所在的省份
	 * @return
	 * 返回一个字符串类型的省份信息
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 获取并保存一个省份的信息并保存到实体类中
	 * @param province
	 * 传入参数为一个字符串类型的省份信息
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取并返回一个成员所在的城市信息
	 * @return
	 * 返回一个字符创类型的城市信息
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 获取并保存一个成员的城市信息到实体类中
	 * @param city
	 * 参数为一个成员的所在城市信息
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取并返回成员的手机号码
	 * @return
	 * 返回一个字符串类型的手机号码
	 */
	public String getMoblePhone() {
		return moblePhone;
	}
	/**
	 * 获取并保存一个成员的手机号信息到实体类中
	 * @param moblePhone
	 * 存入的参数为字符串类型的成员手机号码
	 */
	public void setMoblePhone(String moblePhone) {
		if (moblePhone == null) {
			moblePhone = "";
		}else if (!(moblePhone.equals("")) || (moblePhone != null)) {
			int length = moblePhone.length();
			if (length == 11) {
				this.moblePhone = moblePhone;
			}
		}
		
	}
	/**
	 * 获取并返回一个成员所选的科目拼接成的字符串
	 * @return
	 * 返回一个成员的所选科目拼接成的字符串
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * 获取并保存成员所选的科目组成的字符串
	 * @param subject
	 * 传入一个字符串类型的成员所选的科目的编号组成的字符串
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * 获取并返回成员的QQ号码
	 * @return
	 * 返回成员的QQ号码
	 */
	public String getQid() {
		return Qid;
	}
	/**
	 * 获取并保存成员的QQ号码
	 * @param qid
	 * 传入一个字符串类型的参数保存成员的QQ号码
	 */
	public void setQid(String qid) {
		Qid = qid;
	}
	/**
	 * 获取并返回成员的信誉度
	 * @return
	 * 返回一个整型的编号默认情况下信誉度为1，否则信誉度为0
	 */
	public int getReputation() {
		return reputation;
	}
	/**
	 * 获取并保存成员的信誉度
	 * @param reputation
	 * 传入一个整型参数，如果参数不为1或0则默认为1
	 */
	public void setReputation(int reputation) {
		
			this.reputation = reputation;
	}
}