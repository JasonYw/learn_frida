package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.model.C3156b;
import com.bytedance.android.live.network.response.C5175h;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/* loaded from: classes12.dex */
public interface BroadcastUserApi {
    static {
        Covode.recordClassIndex(14388);
    }

    @GET("/webcast/user/permission/")
    Observable<C5176i<PermissionResult>> getUserPermission();

    @GET("/webcast/user/permission/")
    Observable<C5176i<PermissionResult>> getUserPermissionWithId(@Query("sec_anchor_id") String str, @Query("micro_app_entrance_visibility") String str2);

    @GET("/frisbee/task/get_task_list/")
    Observable<C5175h<C3156b>> getUserTasks(@QueryMap Map<String, String> map);

    @POST("/webcast/room/upload/image/")
    Single<C5176i<C2852e>> uploadAvatar(@Body TypedOutput typedOutput);
}
