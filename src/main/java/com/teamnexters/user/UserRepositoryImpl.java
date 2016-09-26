package com.teamnexters.user;

import java.util.List;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import com.mysema.query.jpa.JPASubQuery;
import com.teamnexters.useractive.QUserActiveEntity;
import com.teamnexters.userinfovalue.QUserInfoValueEntity;

public class UserRepositoryImpl extends QueryDslRepositorySupport implements UserRepositoryCustom {

	public UserRepositoryImpl() {
		super(UserEntity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UserEntity> getUsersByGener(int gener) {
		QUserEntity qu = QUserEntity.userEntity;
		QUserActiveEntity qua = QUserActiveEntity.userActiveEntity;
		QUserInfoValueEntity qive = QUserInfoValueEntity.userInfoValueEntity;
		return from(qu).leftJoin(qive).where(qu.userNo.eq(qive.userNo), qive.infoOpenYn.eq("Y")).leftJoin(qu.userActives, qua).where(qua.userNo.eq(qu.userNo), qua.gener.eq(gener), qua.completeYN.eq("Y")).orderBy(qua.gener.desc(), qu.userName.asc()).list(qu);
	}

	@Override
	public List<Integer> getGeneragtions() {
		QUserActiveEntity qua = QUserActiveEntity.userActiveEntity;
		return from(qua).groupBy(qua.gener).orderBy(qua.gener.asc()).list(qua.gener);
	}
	
	@Override
	public List<UserEntity> getAllUserList() {
		QUserEntity qu = QUserEntity.userEntity;
		QUserInfoValueEntity qive = QUserInfoValueEntity.userInfoValueEntity;
		QUserActiveEntity qua = QUserActiveEntity.userActiveEntity;
		
		return from(qu
				, new JPASubQuery().from(qive).where(qive.infoOpenYn.eq("Y")).list(qive).as(qive))
	}
	

}
