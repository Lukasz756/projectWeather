package com.sda.weather.localization;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

@RequiredArgsConstructor
public class LocalizationRepositoryImpl implements LocalizationRepository {

    private final SessionFactory sessionFactory;



    @Override
    public Localization add(Localization localization) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(localization);
        transaction.commit();
        session.close();
        return localization;
    }
}
