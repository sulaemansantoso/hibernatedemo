package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "siswa", schema = "dbtestoop", catalog = "")
public class SiswaEntity {
    private int id;
    private String nama;
    private String nrp;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nama", nullable = true, length = 150)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Basic
    @Column(name = "nrp", nullable = true, length = 200)
    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SiswaEntity that = (SiswaEntity) o;
        return id == that.id && Objects.equals(nama, that.nama) && Objects.equals(nrp, that.nrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nama, nrp);
    }
}
