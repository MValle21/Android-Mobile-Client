package io.intelehealth.client.views.adapters;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.intelehealth.client.R;
import io.intelehealth.client.app.IntelehealthApplication;
import io.intelehealth.client.databinding.CardviewHomeBinding;
import io.intelehealth.client.views.activites.LoginActivity;

/**
 * Created by tusharjois on 9/20/16.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.IconViewHolder> {

    final static String TAG = HomeAdapter.class.getSimpleName();
    final String[] options = {IntelehealthApplication.getAppContext().getString(R.string.new_patient),
            IntelehealthApplication.getAppContext().getString(R.string.find_patient),
            IntelehealthApplication.getAppContext().getString(R.string.today_patient),
            IntelehealthApplication.getAppContext().getString(R.string.active_patient),
            IntelehealthApplication.getAppContext().getString(R.string.video_library)
            // , IntelehealthApplication.getAppContext().getString(R.string.action_sync_all)
    };
    final int[] icons = {R.drawable.ic_person_add_24dp, R.drawable.ic_search_24dp,
            R.drawable.ic_calendar_intele_24dp, R.drawable.ic_calendar_intele_24dp, R.drawable.ic_play_circle_filled_black_24dp
            //,android.R.drawable.ic_menu_preferences
    };

    //TODO: Change placeholder icon "android.R.drawable.ic_menu_my_calendar"
    LayoutInflater layoutInflater;

    @Override
    public IconViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        CardviewHomeBinding cardviewHomeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.cardview_home, parent, false);
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_home, parent, false);
//        return new IconViewHolder(v, parent.getContext());
        return new IconViewHolder(cardviewHomeBinding, parent.getContext());
    }

    @Override
    public void onBindViewHolder(IconViewHolder holder, int position) {
        holder.cardviewHomeBinding.optionName.setText(options[position]);
        holder.cardviewHomeBinding.optionName.setId(position);
        holder.cardviewHomeBinding.optionIcon.setImageResource(icons[position]);
//        holder.optionName.setText(options[position]);
//        holder.optionName.setId(position);
//        holder.icon.setImageResource(icons[position]);
    }

    @Override
    public int getItemCount() {
        return this.options.length;
    }

    public static class IconViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //        CardView cardView;
//        TextView optionName;
//        ImageView icon;
        Context context;

        CardviewHomeBinding cardviewHomeBinding;

        IconViewHolder(CardviewHomeBinding cardviewHomeBinding1, Context activityContext) {
            super(cardviewHomeBinding1.getRoot());
            this.cardviewHomeBinding = cardviewHomeBinding1;
//            itemView.setOnClickListener(this);
//            this.cardView = (CardView) itemView.findViewById(R.id.cardview_home);
//            this.optionName = (TextView) itemView.findViewById(R.id.option_name);
//            this.icon = (ImageView) itemView.findViewById(R.id.option_icon);
            this.context = activityContext;
        }

        @Override
        public void onClick(View v) {
            switch (this.cardviewHomeBinding.optionName.getId()) {
                case 0: {
                    Intent intent = new Intent(this.context, LoginActivity.class);
                    this.context.startActivity(intent);
                    break;
                }
                case 1: {
                    Intent intent = new Intent(this.context, LoginActivity.class);
                    this.context.startActivity(intent);
                    break;
                }
                case 2: {

                    //TODO: Change Activity after coding is done.

                    // Query for today's patient
                    // SELECT * FROM visit WHERE start_datetime LIKE "2017-05-08T%" ORDER BY start_datetime ASC
                    Intent intent = new Intent(this.context, LoginActivity.class);
                    this.context.startActivity(intent);
                    break;
                }
                case 3: {

                    //TODO: Change Activity after coding is done.

                    // Query for today's patient
                    // SELECT * FROM visit WHERE start_datetime LIKE "2017-05-08T%" ORDER BY start_datetime ASC
                    Intent intent = new Intent(this.context, LoginActivity.class);
                    this.context.startActivity(intent);
                    break;
                }
                case 4: {
                    Intent intent = new Intent(this.context, LoginActivity.class);
                    this.context.startActivity(intent);
                    break;
                }
                case 5: {
                    Intent intent = new Intent(this.context, LoginActivity.class);
                    this.context.startActivity(intent);
                    break;
                }
                default:
                    Log.i(TAG, "Matching class not found");
            }

        }

    }

}