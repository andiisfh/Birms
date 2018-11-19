package com.example.ferdy.birms.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Andi Insanudin on 19/11/18.
 */
public class Converter {

    public static int dpToPx(Context context, int dp) {
        Resources r = context.getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    public static String numberFormat(String number, boolean replaceWithDot) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        return formatRupiah.format((double) Double.valueOf(number));
    }

    public static String reformatDate(String date) {
        String newDate = "";
        try {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+00:00");
            Date tempDate = simpledateformat.parse(date);
            SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy");
            newDate = outputDateFormat.format(tempDate);
        } catch (ParseException ex) {
            System.out.println("Parse Exception");
        }

        return newDate;
    }
}
