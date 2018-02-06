package develop.software.cbay.eftwiki.entities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by cnunezba on 06/02/2018.
 */
@Table(name = "mod")
public class Mod extends Model {

    @Column(name="id_mod")
    public Integer id_mod;

    @Column(name="nombre")
    public String nombre;

    @Column(name="abreviatura")
    public String abreviatura;

    @Column(name="icon")
    public String icon;

    @Column(name="imagen")
    public String imagen;

    @Column(name="precio")
    public Integer precio;

    @Column(name="moneda")
    public String moneda;

    @Column(name="ergonomic")
    public Integer ergonomic;

    @Column(name="recoil")
    public Integer recoil;

    @Column(name="muzzle_velocity")
    public Integer muzzle_velocity;

    @Column(name="base_accuracy")
    public Integer base_accuracy;

    @Column(name="img_other_attachment")
    public String img_other_attachment;
}
