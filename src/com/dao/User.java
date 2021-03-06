package com.dao;

public class User {
	private int userid;
	private String nickname;
	private int score;
	private String dob;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getDate() {
		return dob;
	}
	public void setDate(String dob) {
		this.dob = dob;
	}
	
	public String toString() {
		return "nickname: " + nickname +
				" score: " + score +
				" date: " + dob; 
	}
}
