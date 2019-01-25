package fooster.test.reccontacts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmantContact extends Fragment {
    View v;
    private RecyclerView myrec;
    private List<Contact>lstCont;
    public FragmantContact(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v = inflater.inflate(R.layout.contact_fragment,container,false);
       myrec = v.findViewById(R.id.rec);
       RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstCont);
       myrec.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrec.setAdapter(recyclerViewAdapter);
        return v;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        lstCont = new ArrayList<>();
        lstCont.add(new Contact("Джекі Чан","(111)00000000",R.drawable.one));
        lstCont.add(new Contact("Taison","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Lion King","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Dimonchik King","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Test","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Naruto","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Marusia","(111)00000000",R.drawable.two));
        lstCont.add(new Contact("Simba","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Джекі Чан","(111)00000000",R.drawable.one));
        lstCont.add(new Contact("Барак Обама","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Джекі Чан","(111)00000000",R.drawable.one));
        lstCont.add(new Contact("Naruto","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Simba","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Lion King","(111)00000000",R.drawable.three));
        lstCont.add(new Contact("Test","(111)00000000",R.drawable.three));

        lstCont.add(new Contact("Dimonchik King","(111)00000000",R.drawable.three));



    }
}
