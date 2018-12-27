package com.bin.po;

/**
 * 
 * @ClassName:  Member     
 * @Description: 会员类 
 * @author: xb    
 * @date:   2018年12月14日 下午5:32:04   
 * @version V1.0
 */
public class Member {
	
	/**
	 * 会员账号
	 */
	private String memberID;
	
	/**
	 * 会员密码
	 */
	private String password;
	
	/**
	 * 会员级别
	 */
	private String rank;
	
	/**
	 * 会员积分
	 */
	private int credit;
	
	/**
	 * 会员手机号
	 */
	private String phone;
	
	/**
	 * 会员皮肤
	 */
	private String imgPath;
	
	/*private List<GroupPost> postes;
 
	public List<GroupPost> getPostes() {
		return postes;
	}
 
	public void setPostes(List<GroupPost> postes) {
		this.postes = postes;
	}*/
 
	public String getMemberID() {
		return memberID;
	}
 
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
	public String getRank() {
		return rank;
	}
 
	public void setRank(String rank) {
		this.rank = rank;
	}
 
	public int getCredit() {
		return credit;
	}
 
	public void setCredit(int credit) {
		this.credit = credit;
	}
 
	public String getPhone() {
		return phone;
	}
 
	public void setPhone(String phone) {
		this.phone = phone;
	}
 
	public String getImgPath() {
		return imgPath;
	}
 
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
}
