package com.icdsp.tmap;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by ICDSP on 2018-01-14.
 */

public class BaseActivity extends Activity implements View.OnClickListener{

    private RelativeLayout contentView = null;
    private static Context mCtx = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.setContentView(R.layout.base_activity);
        mCtx = this;

        contentView  = (RelativeLayout)findViewById(R.id.contentView);


        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }



    @Override
    public void setContentView(int res)  {

        contentView.removeAllViews();

        LayoutInflater inflater;
        inflater = LayoutInflater.from(this);

        View item = inflater.inflate(res, null);
        contentView.addView(item, new LinearLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                                                                RelativeLayout.LayoutParams.MATCH_PARENT));

    }



    @Override
    public void setContentView(View view) {

        contentView.removeAllViews();

        contentView.addView(view, new LinearLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                                                                RelativeLayout.LayoutParams.MATCH_PARENT));

    }


    public void addView(View v)
    {
        contentView.removeAllViews();
        contentView.addView(v, new LinearLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                                                            RelativeLayout.LayoutParams.MATCH_PARENT));
    }



    @Override
    public void onClick(View v) {

    }

}
