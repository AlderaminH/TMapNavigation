package com.icdsp.tmap;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Common {
	
	public static boolean isDebugMode = true;
	public static boolean isAlertDialogShow = false;
	public static boolean isProgressDialogShow = false;
	
	static AlertDialog alertDialog;
	static DialogInterface.OnClickListener mListener;
	
	
	public static void showAlertDialog(Context ctx, String title, String msg, DialogInterface.OnClickListener listener)
	{
		mListener = listener;
		showAlertDialog(ctx, title, msg);
	}
	
	
	
	public static void showAlertDialog(Context ctx, String title, String msg)
	{
		if(alertDialog == null && isAlertDialogShow != true)
		{
			alertDialog = new AlertDialog.Builder(ctx)
			    .setIcon(R.drawable.ic_launcher)
			    .setTitle(title)
				.setMessage(msg)
				.setNeutralButton("확인", new DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialog, int which) 
				{
					hideAlertDialog();
					if(mListener != null){
						mListener.onClick(dialog, which);
						mListener = null;
					}
				}
							
			}).show();
			
			isAlertDialogShow = true;
		}
	}
	
	public static void hideAlertDialog()
	{
		if(alertDialog != null && isAlertDialogShow == true)
		{
			alertDialog.dismiss();
			alertDialog = null;
			
			isAlertDialogShow = false;
		}
	}
	

	
}
