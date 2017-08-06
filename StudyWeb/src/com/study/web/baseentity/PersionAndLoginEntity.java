package com.study.web.baseentity;


import java.util.Date;

import com.study.web.util.IdentityCheckUtil;



public class PersionAndLoginEntity extends BaseEntity<PersionAndLoginEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 生日<br>
	 * Date类型<br>
	 */
	private Date birthday;
	/**
	 * 省份id
	 * int类型<br>
	 */
	private int provinceId;
	/**
	 * 城市id<br>
	 * int类型<br>
	 */
	private int cityId;
	/**
	 * 城市的父级id,<br>
	 * 对应省份的id<br>
	 * int类型<br>
	 */
	private int cityOfProvinceId = provinceId;
	/**
	 * 省份名称<br>
	 * String类型<br>
	 * 不常用于修改<br>
	 */
	private String province;
	/**
	 * 城市名称<br>
	 * String类型<br>
	 * 不常修改<br>
	 */
	private String city;
	/**
	 * 身份证编号<br>
	 * String类型
	 */
	private String identityCardId;
	/**
	 * 登录编号
	 */
	private String loginId;
	/**
	 * 登录密码
	 */
	private String loginPassword;
	/**
	 * 登录身份
	 */
	private int loginIdent;
	/**
	 * 课程id，系别id，<br>
	 * 课程父级id(对应系别id)<br>
	 */
	private int subjectParentId,
		subjectId,
		subjectOfParentId = subjectParentId;
	/**
	 * 科目名称
	 */
	private String SubjectName;
	/**
	 * 系别名称
	 */
	private String subjectParentName;
	/**
	 * 返回主键id
	 */
	
	public int getId(){
		return super.getId();
	}
	/**
	 * 获取主键id
	 */
	 
	public void setId(int id){
		super.id = id;
	}
	/**
	 * 
	 */
	 
	public String getName(){
		return super.getName();
	}
	/**
	 * 
	 */
	 
	public void setName(String name){
		super.setName(name);
	}
	/**
	 * 返回登录身份编号
	 * @return
	 */
	 
	public int getLoginIdent() {
		return loginIdent;
	}
	/**
	 * 获取登录身份编号
	 * @param loginIdent
	 */
	 
	public void setLoginIdent(int loginIdent) {
		this.loginIdent = loginIdent;
	}
	/**
	 * 返回系别id
	 * @return
	 */
	 
	public int getSubjectParentId() {
		return subjectParentId;
	}
	/**
	 * 获取系别级id
	 * @param subjectParentId
	 * 
	 */
	 
	public void setSubjectParentId(int subjectParentId) {
		this.subjectParentId = subjectParentId;
	}
	/**
	 * 返回科目id
	 * @return
	 */
	public int getSubjectId() {
		return subjectId;
	}
	/**
	 * 获取科目id
	 * @param subjectId
	 */
	 
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * 返回科目父id
	 * @return
	 */
	public int getSubjectOfParentId() {
		return subjectOfParentId;
	}
	/**
	 * 获取科目父id
	 * @param subjectOfParentId
	 */
	public void setSubjectOfParentId(int subjectOfParentId) {
		this.subjectOfParentId = subjectOfParentId;
	}
	/**
	 * 返回科目名称
	 * @return
	 */
	public String getSubjectName() {
		return SubjectName;
	}
	/**
	 * 获取科目名称
	 * @param subjectName
	 */
	 
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	/**
	 * 返回系别名称
	 * @return
	 */
	public String getSubjectParentName() {
		return subjectParentName;
	}
	/**
	 * 获取系别名称
	 * @param subjectParentName
	 */
	 
	public void setSubjectParentName(String subjectParentName) {
		
		this.subjectParentName = subjectParentName;
	}
	/**
	 * 构造方法
	 */
	public PersionAndLoginEntity() {
		super();
	}
	/**
	 * 返回出生日期
	 * @return
	 */
	 
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 获取出生日期
	 * @param birthday
	 */
	@SuppressWarnings("deprecation")
	public void setBirthday(String birthday) {
		this.birthday = new Date(birthday);
	}
	/**
	 * 返回省份id
	 * @return
	 */
	 
	public int getProvinceId() {
		return provinceId;
	}
	/**
	 * 获取省份id
	 * @param provinceId
	 */
	 
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	/**
	 * 返回城市id
	 * @return
	 */
	public int getCityId() {
		return cityId;
	}
	/**
	 * 获取城市id
	 * @param cityId
	 */
	 
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	/**
	 * 返回城市的父级id
	 * @return
	 */
	 
	public int getCityOfProvinceId() {
		return cityOfProvinceId;
	}
	/**
	 * 获取城市父级id
	 * @param cityOfProvinceId
	 */
	 
	public void setCityOfProvinceId(int cityOfProvinceId) {
		//判断获取的值是否为0，如果不为0判断是否与省份编号相等
		if (cityOfProvinceId > 0 && this.provinceId == cityOfProvinceId) {
			//如果两个条件都成立获取参数
			this.cityOfProvinceId = cityOfProvinceId;
		}
	}
	/**
	 * 返回省份
	 * @return
	 */
	 
	public String getProvince() {
		return province;
	}
	/**
	 * 获取省份
	 * @param province
	 */
	 
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 返回城市
	 * @return
	 */
	 
	public String getCity() {
		return city;
	}
	/**
	 * 获取城市
	 * @param city
	 */
	 
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 返回身份证信息
	 * @return
	 */
	 
	public String getIdentityCardId() {
		return identityCardId;
	}
	/**
	 * 获取一个合法的身份证号
	 * @param identityCardId
	 */
	 
	public void setIdentityCardId(String identityCardId) {
		//判断身份证号码是否合法
		if (IdentityCheckUtil.checkIDCard(identityCardId)) {
			//合法执行保存
			this.identityCardId = identityCardId;
		}
	}
	/**
	 * 返回登录账号
	 * @return
	 */
	 
	public String getLoginId() {
		return loginId;
	}
	/**
	 * 获取登录账号
	 * @param loginId
	 */
	 
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	/**
	 * 返回登录密码
	 * @return
	 */
	 
	public String getLoginPassword() {
		return loginPassword;
	}
	/**
	 * 获取登录密码
	 * @param loginPassword
	 */
	 
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	/**
	 * 重写hashCode()方法，<br>
	 * 返回由城市编号，<br>
	 * 城市所属的省份编号，<br>
	 * 原始{@link java.lang.Object#hashCode()}编码，<br>
	 * 共同拼接成字符串，之后转为新的hashcode编码
	 * 
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.getCityId()+
				""+this.getCityOfProvinceId()+
				""+super.hashCode());
	}
	/**
	 * 清理内存
	 */
	@Override
	protected void finalize() {
		// TODO Auto-generated method stub
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————\n" +
					"销毁异常！\t 详细信息如下：");
			e.printStackTrace();
		}
	}
}
