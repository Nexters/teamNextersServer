package com.teamnexters.user;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = 604321132L;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final StringPath img = createString("img");

    public final StringPath password = createString("password");

    public final SetPath<com.teamnexters.useractive.UserActiveEntity, com.teamnexters.useractive.QUserActiveEntity> userActives = this.<com.teamnexters.useractive.UserActiveEntity, com.teamnexters.useractive.QUserActiveEntity>createSet("userActives", com.teamnexters.useractive.UserActiveEntity.class, com.teamnexters.useractive.QUserActiveEntity.class, PathInits.DIRECT2);

    public final StringPath userAuth = createString("userAuth");

    public final NumberPath<Integer> userBirth = createNumber("userBirth", Integer.class);

    public final StringPath userId = createString("userId");

    public final SetPath<com.teamnexters.userinfovalue.UserInfoValueEntity, com.teamnexters.userinfovalue.QUserInfoValueEntity> userInfoValues = this.<com.teamnexters.userinfovalue.UserInfoValueEntity, com.teamnexters.userinfovalue.QUserInfoValueEntity>createSet("userInfoValues", com.teamnexters.userinfovalue.UserInfoValueEntity.class, com.teamnexters.userinfovalue.QUserInfoValueEntity.class, PathInits.DIRECT2);

    public final StringPath userName = createString("userName");

    public final StringPath userNo = createString("userNo");

    public final SetPath<com.teamnexters.productattend.ProductAttendEntity, com.teamnexters.productattend.QProductAttendEntity> userProducts = this.<com.teamnexters.productattend.ProductAttendEntity, com.teamnexters.productattend.QProductAttendEntity>createSet("userProducts", com.teamnexters.productattend.ProductAttendEntity.class, com.teamnexters.productattend.QProductAttendEntity.class, PathInits.DIRECT2);

    public QUserEntity(String variable) {
        super(UserEntity.class, forVariable(variable));
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserEntity(PathMetadata<?> metadata) {
        super(UserEntity.class, metadata);
    }

}

