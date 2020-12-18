package datnguyen.lab.baithuchanh4application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleOrderAdapter extends RecyclerView.Adapter<RecycleOrderAdapter.MyViewHolder> {
    Context context;
    List<Drink> drinkList;

    public RecycleOrderAdapter(Context context, List<Drink> drinkList) {
        this.context = context;
        this.drinkList = drinkList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.drink_item, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_drink_name.setText(drinkList.get(position).getDrinkName());
        holder.tv_price.setText((drinkList.get(position).getPrice()).toString());
        holder.img_drink.setImageResource(drinkList.get(position).getUrlImage());

    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RelativeLayout item_drink;
        ImageView img_drink;
        TextView tv_drink_name, tv_price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_drink = (RelativeLayout) itemView.findViewById(R.id.layout_item_drink);
            img_drink = itemView.findViewById(R.id.img_drink);
            tv_drink_name = itemView.findViewById(R.id.tv_drink_name);
            tv_price = itemView.findViewById(R.id.tv_drink_price_107);
        }
    }
}
