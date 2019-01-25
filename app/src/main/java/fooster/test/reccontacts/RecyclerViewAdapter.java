package fooster.test.reccontacts;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewholder> {
Context mContext;
List<Contact>mData;
Dialog myDialog;
    private ViewGroup parent;
    private int position;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;

        v =LayoutInflater.from(mContext).inflate(R.layout.item_cont,parent,false);
        final MyViewholder vHolder = new MyViewholder(v);

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_contact);

        vHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name_tv = myDialog.findViewById(R.id.dialog_name);
                TextView dialog_phone_tv = myDialog.findViewById(R.id.phone_dialog);
                ImageView dialog_img_tv = myDialog.findViewById(R.id.img_dialog);

                dialog_name_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mData.get(vHolder.getAdapterPosition()).getPhone());
                dialog_img_tv.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());

                Toast.makeText(mContext,"Test Click"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT);
               myDialog.show();
            }

        });
        return vHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewholder myViewholder, int i) {


        createViewHolder().tv_name.setText(mData.get(position).getName());
        createViewHolder().tv_phone.setText(mData.get(position).getPhone());
        createViewHolder().img.setImageResource(mData.get(position).getPhoto());
    }

    private MyViewholder createViewHolder() {


        return null;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{

        private LinearLayout item;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;

        public MyViewholder(View itemView){
            super(itemView);
            item = itemView.findViewById(R.id.cont_item);
            tv_name = itemView.findViewById(R.id.name_cont);
            tv_phone = itemView.findViewById(R.id.phone_cont);
            img = itemView.findViewById(R.id.img_cont);

        }
    }
}
