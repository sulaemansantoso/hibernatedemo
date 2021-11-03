package dao;

import javafx.collections.ObservableList;

public interface DaoInterface<E> {

    ObservableList<E> getData();
    int addData(E data);
    int delData(E data);
    int updateData(E data);

}
