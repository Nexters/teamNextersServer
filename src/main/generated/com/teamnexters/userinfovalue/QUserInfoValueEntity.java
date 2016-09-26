package com.teamnexters.userinfovalue;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUserInfoValueEntity is a Querydsl query type for UserInfoValueEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserInfoValueEntity extends EntityPathBase<UserInfoValueEntity> {

    private static final long serialVersionUID = -43072032L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserInfoValueEntity userInfoValueEntity = new QUserInfoValueEntity("userInfoValueEntity");

    public final StringPath infoOpenYn = createString("infoOpenYn");

    public final StringPath infoValue = createString("infoValue");

    public final com.teamnexters.userinfo.QUserInfoEntity userInfo;

    public final StringPath userNo = createString("userNo");

    public QUserInfoValueEntity(String variable) {
        this(UserInfoValueEntity.class, forVariable(variable), INITS);
    }

    public QUserInfoValueEntity(Path<? extends UserInfoValueEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserInfoValueEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserInfoValueEntity(PathMetadata<?> metadata, PathInits inits) {
        this(UserInfoValueEntity.class, metadata, inits);
    }

    public QUserInfoValueEntity(Class<? extends UserInfoValueEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userInfo = inits.isInitialized("userInfo") ? new com.teamnexters.userinfo.QUserInfoEntity(forProperty("userInfo")) : null;
    }

}

