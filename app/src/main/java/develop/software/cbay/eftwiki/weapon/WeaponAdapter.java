package develop.software.cbay.eftwiki.weapon;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import develop.software.cbay.eftwiki.R;

/**
 * Created by cnune on 31/01/2018.
 */

public class WeaponAdapter extends RecyclerView.Adapter<WeaponAdapter.WeaponViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Weapon> weaponList ;

    public WeaponAdapter(Context mCtx, List<Weapon> weaponList) {
        this.mCtx = mCtx;
        this.weaponList = weaponList;
    }

    @Override
    public WeaponViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_weapon, null);
        return new WeaponViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeaponViewHolder holder, int position) {
        //getting the product of the specified position
        Weapon weapon = weaponList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(weapon.getTitle());
        holder.textViewShortDesc.setText(weapon.getShortdesc());
        holder.textViewRating.setText(String.valueOf(weapon.getRating()));
        holder.textViewPrice.setText(String.valueOf(weapon.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(weapon.getImage()));

        holder.cardWeapon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                TextView texto = view.findViewById(R.id.textViewTitle);
                String text = (String) texto.getText();

                WeaponFragmentDetail weaponDetail = new WeaponFragmentDetail();
                Bundle args = new Bundle();
                args.putString("nombre", text);
                weaponDetail.setArguments(args);
                //Inflate the fragment

                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, weaponDetail).addToBackStack(null).commit();





            }
        });
    }

    @Override
    public int getItemCount() {
        return weaponList.size();
    }

    public class WeaponViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;
        CardView cardWeapon;

        public WeaponViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
            cardWeapon = itemView.findViewById(R.id.card_weapon);
        }
    }


}
