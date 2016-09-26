package com.teamnexters.product;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QProductEntity is a Querydsl query type for ProductEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductEntity extends EntityPathBase<ProductEntity> {

    private static final long serialVersionUID = 1877658190L;

    public static final QProductEntity productEntity = new QProductEntity("productEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> prodDate = createDateTime("prodDate", java.util.Date.class);

    public final StringPath prodDesc = createString("prodDesc");

    public final StringPath prodLink = createString("prodLink");

    public final StringPath prodTitle = createString("prodTitle");

    public final StringPath prodType = createString("prodType");

    public QProductEntity(String variable) {
        super(ProductEntity.class, forVariable(variable));
    }

    public QProductEntity(Path<? extends ProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductEntity(PathMetadata<?> metadata) {
        super(ProductEntity.class, metadata);
    }

}

