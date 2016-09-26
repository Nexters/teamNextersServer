package com.teamnexters.productattend;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProductAttendEntity is a Querydsl query type for ProductAttendEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductAttendEntity extends EntityPathBase<ProductAttendEntity> {

    private static final long serialVersionUID = 966894434L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductAttendEntity productAttendEntity = new QProductAttendEntity("productAttendEntity");

    public final NumberPath<Integer> prodId = createNumber("prodId", Integer.class);

    public final com.teamnexters.product.QProductEntity productAttend;

    public final NumberPath<Integer> role = createNumber("role", Integer.class);

    public final StringPath userNo = createString("userNo");

    public QProductAttendEntity(String variable) {
        this(ProductAttendEntity.class, forVariable(variable), INITS);
    }

    public QProductAttendEntity(Path<? extends ProductAttendEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductAttendEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductAttendEntity(PathMetadata<?> metadata, PathInits inits) {
        this(ProductAttendEntity.class, metadata, inits);
    }

    public QProductAttendEntity(Class<? extends ProductAttendEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productAttend = inits.isInitialized("productAttend") ? new com.teamnexters.product.QProductEntity(forProperty("productAttend")) : null;
    }

}

