package com.aerilys.helpers.android;
import android.content.Context;
import android.graphics.Typeface;

public final class FontManager
{
	public static Typeface Roboto;
		
	/*
	* Has to be load at init
	* Replace "Roboto" by your own typeface
	*/
	public static void init(Context context)
	{
		Roboto = Typeface.createFromAsset(context.getAssets(), "ROBOTO-CONDENSED.TTF");
	}
}
