package com.sda.weather.Localization;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

@RequiredArgsConstructor
public class LocalizationRepositoryImpl implements LocalizationRepository {

    private final SessionFactory sessionFactory;

    @Override
    public List<Localization> findAll() { // todo remove it, it isn't a part of our functionality
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Localization> localizations = session.createQuery("FROM Localization", Localization.class).getResultList();
        transaction.commit();
        session.close();
        return localizations;
    }

    @Override
    public Localization add(Localization localization) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(localization);
        transaction.commit();
        session.close();
        return null; // todo why null?
    }
}
