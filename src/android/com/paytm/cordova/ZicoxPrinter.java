package com.paytm.cordova;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class ZicoxPrinter extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("printBarcode")) {
            printBarcode(args.getString(0));
            return true;
        } else if (action.equals("printLabel")) {
            printLabel(args.getString(0));
            return true;
        }
        return false;
    }

    private void printBarcode(String packageId){
        Log.i("Error", "plugin working fine. Pkg Id:" + packageId);
    }

    private void printLabel(String data){
        Log.i("Error", "plugin working fine. data: " + data);
    }


}