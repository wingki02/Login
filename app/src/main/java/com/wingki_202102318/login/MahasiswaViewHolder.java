package com.wingki_202102318.login;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder
{
    public ImageView _jkImageView;
    public TextView _jkTextView;
    public TextView _jpTextView;
    public TextView _namaTextView;
    public TextView _nimTextView;

    public MahasiswaViewHolder(View itemview)
    {
        super(itemview);

        _jkImageView = (ImageView) itemview.findViewById(R.id.jkImageView);
        _jkTextView = (TextView)  itemview.findViewById(R.id.jkTextView);
        _jpTextView = (TextView)  itemview.findViewById(R.id.jpTextView);
        _namaTextView = (TextView)  itemview.findViewById(R.id.namaTextView);
        _nimTextView = (TextView)  itemview.findViewById(R.id.nimTextView);
    }
}

