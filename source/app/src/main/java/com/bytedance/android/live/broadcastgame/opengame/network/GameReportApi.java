package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface GameReportApi {
    static {
        Covode.recordClassIndex(20331);
    }

    @GET("/webcast/openapi/report/reason_list/")
    Observable<C5176i<C3591r>> getReportReasonList(@Query("scene") String str, @Query("room_id") long j);

    @POST("/webcast/openapi/report/baseinfo/submit/")
    Observable<C5176i<C3556at>> submitReportBaseInfoRequest(@Query("app_id") String str, @Query("reason_id") String str2, @Query("report_desc") String str3, @Query("report_uris") String str4, @Query("room_id") long j, @Query("reason_desc") String str5, @Query("no_extra") Boolean bool, @Query("app_path") String str6, @Query("app_query") String str7);

    @POST("/webcast/openapi/report/extrainfo/submit/")
    Observable<C5176i<Object>> submitReportExtraInfoRequest(@Query("report_id") String str, @Query("app_screenshot_oids") String str2, @Query("full_screenshot_oids") String str3, @Query("room_id") String str4);

    @POST("/wsos_v2/webcast_interact_open/upload/")
    Observable<C3558av> uploadImg(@Body TypedOutput typedOutput);
}
