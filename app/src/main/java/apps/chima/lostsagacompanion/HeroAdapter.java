package apps.chima.lostsagacompanion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class HeroAdapter extends ArrayAdapter<Hero> implements View.OnClickListener {
private final Context context;

    public HeroAdapter(@NonNull Context context, int resource, @NonNull Hero[] objects) {
        super(context, resource, objects);
        this.context = context;
    }

    public HeroAdapter(@NonNull Context context, int resource, @NonNull List<Hero> objects) {
        super(context, resource, objects);
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.hero_list_layout, parent, false);


        TextView heroName = view.findViewById(R.id.heroName);
        heroName.setText(getItem(position).getName());

        TextView combatStyle = view.findViewById(R.id.combatStyle);
        combatStyle.setText(getItem(position).getCombatStyle());

        TextView category = view.findViewById(R.id.category);
        category.setText(getItem(position).getCategory());

        TextView heroID = view.findViewById(R.id.heroID);
        heroID.setText("#" + getItem(position).getId());

        ImageView heroIcon = view.findViewById(R.id.heroIcon);
        heroIcon.setImageBitmap(getItem(position).getIconBitmap());




        return view;
    }

    @Override
    public void onClick(View v) {


    }
}
