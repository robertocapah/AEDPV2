package shp.kalbecallplanaedp.Data;

import android.app.ProgressDialog;

/**
 * Created by Dewi Oktaviani on 12/10/2018.
 */

public interface CustomVolleyResponseListener {
    void onError(String message);

    void onResponse(String response, Boolean status, String strErrorMsg, ProgressDialog dialog);
}
