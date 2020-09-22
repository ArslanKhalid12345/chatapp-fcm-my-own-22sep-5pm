package com.example.messagingappversion10.Notify;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAvXFqWZw:APA91bHpN1TBRtsp5nfov9AQMahA17AozivwZXeBhRo_LtYW95fY2MpPtWspbDTZ2hHGgyW470udepbTMVUbUaFrJxWk0AH8VgnvQPhZIPH09KXHjWT_tQhQWm5pGlH3zMZn6zJH7TTq"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}