package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.profit.lottery.p413a.C5310a;
import com.bytedance.android.live.profit.lottery.p413a.C5312d;
import com.bytedance.android.live.profit.lottery.p413a.C5313f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.google.gson.JsonObject;
import io.reactivex.Observable;

/* loaded from: classes12.dex */
public interface LotteryApi {
    static {
        Covode.recordClassIndex(33403);
    }

    @GET("/webcast/lottery/melon/check_user_right/")
    Observable<C5176i<JsonObject>> checkUserRight(@Query("room_id") long j, @Query("lottery_id") long j2);

    @GET("/webcast/lottery/melon/lottery_info/")
    Observable<C5176i<C5313f>> fetchLotteryInfo(@Query("room_id") long j, @Query("query_from") long j2);

    @GET("/webcast/lottery/melon/get_candidate_state/")
    Observable<C5176i<C5310a>> getCandidateState(@Query("lottery_id") long j);

    @GET("/webcast/lottery/melon/lottery_config/")
    Observable<C5176i<C5312d>> getConfig(@Query("room_id") long j, @Query("anchor_id") long j2);

    /* loaded from: classes12.dex */
    public enum QueryFrom {
        Undefined(0),
        ClientEnterRoom(1),
        WebResultPage(2),
        ClientPoll(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final long value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static QueryFrom[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (QueryFrom[]) proxy.result;
            }
            return (QueryFrom[]) values().clone();
        }

        static {
            Covode.recordClassIndex(33404);
        }

        public static QueryFrom valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (QueryFrom) proxy.result;
            }
            return (QueryFrom) Enum.valueOf(QueryFrom.class, str);
        }

        QueryFrom(long j) {
            this.value = j;
        }
    }
}
