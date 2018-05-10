package com.esau.mpesatrial;

public class Config {
    //Use credentials from your Lipa na MPESA Online(MPesa Express) App from the developer portal
    public static final String CONSUMER_KEY = "<your consumer key here>";
    public static final String CONSUMER_SECRET = "<your consumer secret here>";

    // global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";

    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";

    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
    public static final String CHANNEL_ID = "100";

    public static final String SHARED_PREF = "ah_firebase";

    //STKPush Properties
    public static final String BUSINESS_SHORT_CODE = "174379";
    public static final String PASSKEY = "<your passkey here>";
    public static final String TRANSACTION_TYPE = "CustomerPayBillOnline";
    public static final String PARTYB = "174379";
    public static final String CALLBACKURL = "https://spurquoteapp.ga/pusher/pusher.php?title=stk_push&message=result&push_type=individual&regId=";

    public static final String TOKEN_URL = "https://sandbox.safaricom.co.ke/oauth/v1/generate?grant_type=client_credentials";
}
