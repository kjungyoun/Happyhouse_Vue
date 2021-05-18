package com.ssafy.happyhouse.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.happyhouse.model.MemberDto;
import com.ssafy.happyhouse.model.PageBean;

public interface MemberService {

//	회원가입
	void registerMember(MemberDto memberDto)throws Exception;
	
//	로그인
	MemberDto login(Map<String,String> map) throws Exception;
	
//	회원정보 수정을 위한 회원의 모든 정보 얻기
	MemberDto getMember(String userid)throws Exception;
	
//	회원정보 수정 -> 로그인 되었을 때만
	void modifyMember(MemberDto memberDto)throws Exception;
	
//	회원탈퇴 -> 로그인 되었을 때만 
	void deleteMember(String userid)throws Exception;
	
//  회원 전체
	List<MemberDto> searchAll(PageBean bean)throws Exception;

}
