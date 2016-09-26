package com.teamnexters.userinfo;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserInfoEntity is a Querydsl query type for UserInfoEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserInfoEntity extends EntityPathBase<UserInfoEntity> {

    private static final long serialVersionUID = 1870774476L;

    public static final QUserInfoEntity userInfoEntity = new QUserInfoEntity("userInfoEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath infoName = createString("infoName");

    public QUserInfoEntity(String variable) {
        super(UserInfoEntity.class, forVariable(variable));
    }

    public QUserInfoEntity(Path<? extends UserInfoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserInfoEntity(PathMetadata<?> metadata) {
        super(UserInfoEntity.class, metadata);
    }

}

