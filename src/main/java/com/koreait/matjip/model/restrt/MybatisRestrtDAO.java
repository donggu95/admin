package com.koreait.matjip.model.restrt;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreait.matjip.domain.Restrt;
import com.koreait.matjip.exception.RestrtException;
import com.koreait.matjip.exception.UploadException;

@Repository
public class MybatisRestrtDAO implements RestrtDAO{
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	@Override
	public List selectAll() {
		return null;
	}

	@Override
	public Restrt select(int restrt_id) {
		return null;
	}

	@Override
	public void insert(Restrt restrt) throws RestrtException{
		int result=sessionTemplate.insert("Restrt.insert", restrt); // <insert>
		if(result==0) {
			throw new UploadException("맛집 등록실패");
		}
	}

	@Override
	public void update(Restrt restrt) {
	}

	@Override
	public void delete(int restrt_id) {
	}  
}
