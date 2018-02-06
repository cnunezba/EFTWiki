package develop.software.cbay.eftwiki.entities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

/**
 * Created by cnunezba on 06/02/2018.
 */
@Table(name = "weapon")
public class Weapon extends Model {

    @Column(name="id_weapon")
    public Integer id_weapon;

    @Column(name="nombre")
    public String nombre;

    @Column(name="imagen")
    public String imagen;

    @Column(name="precio")
    public Integer precio;

    @Column(name="moneda")
    public String moneda;

    public List<Mod> mods;

    public Weapon() {
        super();
    }

    public Weapon(Integer id_weapon, String nombre, String imagen, Integer precio, String moneda, List<Mod> mods) {
        super();
        this.id_weapon = id_weapon;
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.moneda = moneda;
        this.mods = mods;
    }
}
