package com.example.mitubhowmick10.version;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by mitubhowmick10 on 11/4/17.
 */

public class DonarList extends ArrayAdapter<Donar> {
    private Activity context;
    private List<Donar>DonarList;
    public DonarList(Activity context,List<Donar>DonarList )
    {
        super(context,R.layout.list_layout,DonarList);
        this.context=context;
        this.DonarList=DonarList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem= inflater.inflate(R.layout.list_layout,null,true);
        TextView textviewName=(TextView)listViewItem.findViewById(R.id.donarname);
        TextView textviewoccupation=(TextView)listViewItem.findViewById(R.id.donaroccupation);
        TextView textviewage=(TextView)listViewItem.findViewById(R.id.donarage);
        TextView textviewweight=(TextView)listViewItem.findViewById(R.id.donarweight);
        TextView textviewcontact=(TextView)listViewItem.findViewById(R.id.donarcontact);
        Donar donar=DonarList.get(position);
        textviewName.setText(donar.getDname());
        textviewoccupation.setText(donar.getDpesha());
        textviewage.setText(donar.getDage());
        textviewweight.setText(donar.getDweight());
        textviewcontact.setText(donar.getDcontact());
        return listViewItem;
    }
}
