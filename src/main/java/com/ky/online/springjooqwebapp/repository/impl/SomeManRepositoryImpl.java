package com.ky.online.springjooqwebapp.repository.impl;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.jooqschema.tables.records.OrdersRecord;
import com.ky.online.springjooqwebapp.model.order.Order;
import com.ky.online.springjooqwebapp.repository.SomeManRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional
public class SomeManRepositoryImpl {
    private final DSLContext dsl;

//    @Override
//    public Optional<SomeMan> findById(Long id) {
//        return Optional.ofNullable(dsl
//                .selectFrom(SomeMan)
//                .where(ORDERS.ID.eq(id))
//                .fetchOneInto(Order.class));
//    }
//
//    @Override
//    public Order update(SomeMan order) {
//        OrdersRecord ordersRecord = dsl.update(ORDERS)
//                .set(ORDERS.ID, order.getId())
//                .set(ORDERS.DESCRIPTION, order.getDescription())
//                .set(ORDERS.USER_ID, order.getUser().getId())
//                .set(ORDERS.NAME, order.getName())
//                .set(ORDERS.PRICE, order.getPrice())
//                .returning(ORDERS.ID).fetchOne();
//
//        return ordersRecord != null ? order : null;
//    }
//
//    @Override
//    public Order save(SomeMan order) {
//        OrdersRecord ordersRecord = dsl.insertInto(ORDERS)
//                .set(ORDERS.ID, order.getId())
//                .set(ORDERS.DESCRIPTION, order.getDescription())
//                .set(ORDERS.USER_ID, order.getUser().getId())
//                .set(ORDERS.NAME, order.getName())
//                .set(ORDERS.PRICE, order.getPrice())
//                .returning(ORDERS.ID).fetchOne();
//
//        if (ordersRecord != null) {
//            order.setId(ordersRecord.getId());
//            return order;
//        }
//
//        return null;
//    }
//
//    @Override
//    public List<SomeMan> findAll() {
//        return dsl.selectFrom(ORDERS)
//                .fetchInto(SomeMan.class);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        dsl.delete(ORDERS)
//                .where(ORDERS.ID.eq(id))
//                .execute();
//    }
}
