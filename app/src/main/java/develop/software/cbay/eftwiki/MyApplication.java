package develop.software.cbay.eftwiki;

import android.app.Application;
import com.activeandroid.ActiveAndroid;

import develop.software.cbay.eftwiki.entities.Weapon;


/**
 * Created by cnunezba on 06/02/2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Inicializa Active Android
        ActiveAndroid.initialize(this);

        Weapon weapon = new Weapon();
        weapon.id_weapon=1;
        weapon.imagen="img";
        weapon.nombre="nombre";
        weapon.save();

    }
}
