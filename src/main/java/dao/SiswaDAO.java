package dao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.SiswaEntity;
import org.hibernate.Session;
import utility.HibernateUtility;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class SiswaDAO implements  DaoInterface<SiswaEntity> {
    @Override
    public ObservableList<SiswaEntity> getData() {
        ObservableList<SiswaEntity> sList = FXCollections.observableArrayList();


        Session s = HibernateUtility.getSession();
//        CriteriaBuilder bob = s.getCriteriaBuilder();
//        CriteriaQuery q = bob.createQuery(SiswaEntity.class);
//        q.from(SiswaEntity.class);
//
//        List<SiswaEntity> list = s.createQuery(q).getResultList();
//        sList = FXCollections.observableArrayList(list);

        s.close();

        return null;
    }

    @Override
    public int addData(SiswaEntity data) {
        return 0;
    }

    @Override
    public int delData(SiswaEntity data) {
        return 0;
    }

    @Override
    public int updateData(SiswaEntity data) {
        return 0;
    }
}
