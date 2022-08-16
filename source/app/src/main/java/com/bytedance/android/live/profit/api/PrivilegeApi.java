package com.bytedance.android.live.profit.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.profit.privilege.model.C5369d;
import com.bytedance.android.live.profit.privilege.model.ScreenChatSendResponse;
import com.bytedance.android.live.profit.privilege.model.ScreenChatTabResponse;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.HashMap;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface PrivilegeApi {
    static {
        Covode.recordClassIndex(33221);
    }

    @AbstractC102307QQr(LIZ = "screen_chat")
    @FormUrlEncoded
    @POST("/webcast/privilege/screen_chat/tab/")
    Observable<C5176i<ScreenChatTabResponse>> queryScreenChatTab(@Field("room_id") long j, @Field("anchor_id") long j2);

    @GET("/webcast/privilege/subscribe/info/")
    Observable<AbstractC100834PnQ<C5369d>> querySubscribeInfo(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("source") String str);

    @AbstractC102307QQr(LIZ = "screen_chat")
    @FormUrlEncoded
    @POST("/webcast/privilege/screen_chat/send/")
    Observable<C5176i<ScreenChatSendResponse>> sendScreenChat(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/webcast/room/chat/")
    Observable<AbstractC100834PnQ<ChatResult>> sendSubscribeEmoji(@FieldMap HashMap<String, String> hashMap);
}
