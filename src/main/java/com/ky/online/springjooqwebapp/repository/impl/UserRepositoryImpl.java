package com.ky.online.springjooqwebapp.repository.impl;

import com.ky.online.springjooqwebapp.model.jooqschema.tables.records.OrdersRecord;
import com.ky.online.springjooqwebapp.model.jooqschema.tables.records.UsersRecord;
import com.ky.online.springjooqwebapp.model.order.Order;
import com.ky.online.springjooqwebapp.model.user.User;
import com.ky.online.springjooqwebapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.ky.online.springjooqwebapp.model.jooqschema.tables.Users.USERS;

@Service
@RequiredArgsConstructor
@Transactional
public class UserRepositoryImpl implements UserRepository {
    private final DSLContext dsl;

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(dsl
                .selectFrom(USERS)
                .where(USERS.ID.eq(id))
                .fetchOneInto(User.class));
    }

    @Override
    public User update(User user) {
        UsersRecord usersRecord = dsl.insertInto(USERS)
                .set(USERS.ID, user.getId())
                .set(USERS.AGE, user.getAge())
                .set(USERS.CREATED_AT, user.getCreatedAt())
                .set(USERS.FIRST_NAME, user.getFirstName())
                .set(USERS.LAST_NAME, user.getLastName())
                .returning(USERS.ID).fetchOne();

        return usersRecord != null ? user : null;
    }

    @Override
    public User save(User user) {
        UsersRecord usersRecord = dsl.insertInto(USERS)
                .set(USERS.ID, user.getId())
                .set(USERS.AGE, user.getAge())
                .set(USERS.CREATED_AT, user.getCreatedAt())
                .set(USERS.FIRST_NAME, user.getFirstName())
                .set(USERS.LAST_NAME, user.getLastName())
                .returning(USERS.ID).fetchOne();

        if (usersRecord != null) {
            user.setId(usersRecord.getId());
            return user;
        }

        return null;
    }

    @Override
    public List<User> findAll() {
        return dsl.selectFrom(USERS)
                .fetchInto(User.class);
    }

    @Override
    public void deleteById(Long id) {
        dsl.delete(USERS)
                .where(USERS.ID.eq(id))
                .execute();
    }
}
