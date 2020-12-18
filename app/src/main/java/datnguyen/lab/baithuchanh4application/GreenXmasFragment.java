package datnguyen.lab.baithuchanh4application;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GreenXmasFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<Drink> drinkList;
    public GreenXmasFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        drinkList = new ArrayList<>();
        drinkList.add(new Drink("Choco Xmas (L)", 55000, R.drawable.ic_choco_xmas));
        drinkList.add(new Drink("Cookie XMas", 55000, R.drawable.ic_cooikie_xmas));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_green_xmas, container, false);
        recyclerView = v.findViewById(R.id.green_xmas_recycleview);
        RecycleOrderAdapter recyclerOrderAdapter = new RecycleOrderAdapter(getContext(), drinkList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerOrderAdapter);

        return v;
    }


}