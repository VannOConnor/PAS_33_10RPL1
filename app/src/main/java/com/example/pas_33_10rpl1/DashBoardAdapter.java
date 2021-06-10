package com.example.pas_33_10rpl1;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashBoardHolder> {

   private ArrayList<SetterGetter> listdata;

   public DashBoardAdapter(ArrayList<SetterGetter> listdata){
       this.listdata    =   listdata;
   }
    @NonNull
    @Override
    public DashBoardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view                =   LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard,parent,false);
       DashBoardHolder holder   =   new DashBoardHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashBoardHolder holder, int position) {

       final SetterGetter getData       =   listdata.get(position);
       String titlemenu         =   getData.getTitle();
       String logomenu          =   getData.getImg();

       holder.titleMenu.setText(titlemenu);
       if (logomenu.equals("logomenu1")){
           holder.imgMenu.setImageResource(R.drawable.hamburger);
       }else if (logomenu.equals("logomenu2")){
           holder.imgMenu.setImageResource(R.drawable.pizza);
       }else if (logomenu.equals("logomenu3")){
           holder.imgMenu.setImageResource(R.drawable.frenchfries);
       }else if (logomenu.equals("logomenu4")){
           holder.imgMenu.setImageResource(R.drawable.nigirisushi);
       }else if (logomenu.equals("logomenu5")){
           holder.imgMenu.setImageResource(R.drawable.rackoflamb);
       }else if (logomenu.equals("logomenu6")){
           holder.imgMenu.setImageResource(R.drawable.doughnut);
       }else if (logomenu.equals("logomenu7")){
           holder.imgMenu.setImageResource(R.drawable.cocktail);
       }else if (logomenu.equals("logomenu8")){
           holder.imgMenu.setImageResource(R.drawable.milkshake);
       }else if (logomenu.equals("logomenu9")){
           holder.imgMenu.setImageResource(R.drawable.energydrink);
       }


    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class DashBoardHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

       TextView titleMenu;
       ImageView imgMenu;

       public DashBoardHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu           =   itemView.findViewById(R.id.tv_title_menu);
            imgMenu              =   itemView.findViewById(R.id.iv_logo_hamburger);

        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()){
                case    R.id.option1:
                    System.out.println();
            }

           return false;
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.add(R.menu.menu, R.id.option1, 1, "Delete").setOnMenuItemClickListener(this);
        }
    }
}
