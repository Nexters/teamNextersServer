package com.teamnexters.user;

import java.util.List;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import com.teamnexters.useractive.QUserActiveEntity;

public class UserRepositoryImpl extends QueryDslRepositorySupport implements UserRepositoryCustom {

	public UserRepositoryImpl() {
		super(UserEntity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UserEntity> getUsersByGener(int gener) {
		QUserEntity qu = QUserEntity.userEntity;
		QUserActiveEntity qua = QUserActiveEntity.userActiveEntity;
		return from(qu).leftJoin(qu.userActives, qua).where(qua.userNo.eq(qu.userNo), qua.gener.eq(gener), qua.completeYN.eq("Y")).orderBy(qua.gener.desc(), qu.userName.asc()).list(qu);
	}

	@Override
	public List<Integer> getGeneragtions() {
		QUserActiveEntity qua = QUserActiveEntity.userActiveEntity;
		return from(qua).groupBy(qua.gener).orderBy(qua.gener.asc()).list(qua.gener);
	}
	
	

}
