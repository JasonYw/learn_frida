package com.bytedance.p1222im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.AckConversationApplyRequestBody */
/* loaded from: classes20.dex */
public final class AckConversationApplyRequestBody extends Message<AckConversationApplyRequestBody, Builder> {
    public static final ProtoAdapter<AckConversationApplyRequestBody> ADAPTER = new ProtoAdapter_AckConversationApplyRequestBody();
    public static final Long DEFAULT_APPLY_ID = 0L;
    public static final ApplyStatusCode DEFAULT_APPLY_STATUS = ApplyStatusCode.APPLYING;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final long serialVersionUID = 0;
    public final Long apply_id;
    public final ApplyStatusCode apply_status;
    public final Map<String, String> bizExt;

    /* renamed from: com.bytedance.im.core.proto.AckConversationApplyRequestBody$ProtoAdapter_AckConversationApplyRequestBody */
    /* loaded from: classes20.dex */
    public static final class ProtoAdapter_AckConversationApplyRequestBody extends ProtoAdapter<AckConversationApplyRequestBody> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final ProtoAdapter<Map<String, String>> bizExt;

        static {
            Covode.recordClassIndex(98553);
        }

        public ProtoAdapter_AckConversationApplyRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, AckConversationApplyRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.bizExt = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AckConversationApplyRequestBody ackConversationApplyRequestBody) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ackConversationApplyRequestBody}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            return ProtoAdapter.INT64.encodedSizeWithTag(1, ackConversationApplyRequestBody.apply_id) + ApplyStatusCode.ADAPTER.encodedSizeWithTag(2, ackConversationApplyRequestBody.apply_status) + this.bizExt.encodedSizeWithTag(3, ackConversationApplyRequestBody.bizExt) + ackConversationApplyRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AckConversationApplyRequestBody redact(AckConversationApplyRequestBody ackConversationApplyRequestBody) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ackConversationApplyRequestBody}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (AckConversationApplyRequestBody) proxy.result;
            }
            Message.Builder<AckConversationApplyRequestBody, Builder> mo29747newBuilder = ackConversationApplyRequestBody.mo29747newBuilder();
            mo29747newBuilder.clearUnknownFields();
            return mo29747newBuilder.mo29748build();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: decode */
        public final AckConversationApplyRequestBody mo29749decode(ProtoReader protoReader) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{protoReader}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (AckConversationApplyRequestBody) proxy.result;
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    if (nextTag != 1) {
                        if (nextTag != 2) {
                            if (nextTag != 3) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().mo29749decode(protoReader));
                            } else {
                                builder.bizExt.putAll(this.bizExt.mo29749decode(protoReader));
                            }
                        } else {
                            try {
                                builder.apply_status(ApplyStatusCode.ADAPTER.mo29749decode(protoReader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        builder.apply_id(ProtoAdapter.INT64.mo29749decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.mo29748build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AdmireAuth admireAuth)
        public final void encode(ProtoWriter protoWriter, AckConversationApplyRequestBody ackConversationApplyRequestBody) {
            if (PatchProxy.proxy(new Object[]{protoWriter, ackConversationApplyRequestBody}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            
            ApplyStatusCode.ADAPTER.encodeWithTag(protoWriter, 2, ackConversationApplyRequestBody.apply_status);
            this.bizExt.encodeWithTag(protoWriter, 3, ackConversationApplyRequestBody.bizExt);
            protoWriter.writeBytes(ackConversationApplyRequestBody.unknownFields());
            FollowerDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 62, followers_detail(user));
            ApplyStatusCode.ADAPTER.encodeWithTag(protoWriter, 2, ackConversationApplyRequestBody.apply_status);
        }
    }

    static {
        Covode.recordClassIndex(98551);
    }

    /* renamed from: com.bytedance.im.core.proto.AckConversationApplyRequestBody$Builder */
    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<AckConversationApplyRequestBody, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long apply_id;
        public ApplyStatusCode apply_status;
        public Map<String, String> bizExt = Internal.newMutableMap();

        static {
            Covode.recordClassIndex(98552);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        /* renamed from: build */
        public final AckConversationApplyRequestBody mo29748build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (AckConversationApplyRequestBody) proxy.result;
            }
            return new AckConversationApplyRequestBody(this.apply_id, this.apply_status, this.bizExt, buildUnknownFields());
        }

        public final Builder apply_id(Long l) {
            this.apply_id = l;
            return this;
        }

        public final Builder apply_status(ApplyStatusCode applyStatusCode) {
            this.apply_status = applyStatusCode;
            return this;
        }

        public final Builder bizExt(Map<String, String> map) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            Internal.checkElementsNotNull(map);
            this.bizExt = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public final Message.Builder<AckConversationApplyRequestBody, Builder> mo29747newBuilder() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Builder) proxy.result;
        }
        Builder builder = new Builder();
        builder.apply_id = this.apply_id;
        builder.apply_status = this.apply_status;
        builder.bizExt = Internal.copyOf("bizExt", this.bizExt);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder();
        if (this.apply_id != null) {
            sb.append(", apply_id=");
            sb.append(this.apply_id);
        }
        if (this.apply_status != null) {
            sb.append(", apply_status=");
            sb.append(this.apply_status);
        }
        if (!this.bizExt.isEmpty()) {
            sb.append(", bizExt=");
            sb.append(this.bizExt);
        }
        sb.replace(0, 2, "AckConversationApplyRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public AckConversationApplyRequestBody(Long l, ApplyStatusCode applyStatusCode, Map<String, String> map) {
        this(l, applyStatusCode, map, ByteString.EMPTY);
    }

    public AckConversationApplyRequestBody(Long l, ApplyStatusCode applyStatusCode, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.apply_id = l;
        this.apply_status = applyStatusCode;
        this.bizExt = Internal.immutableCopyOf("bizExt", map);
    }
}

package com.p1594ss.ugc.aweme;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.Objects;
import okio.ByteString;
import p003X.C65773BxH;

/* renamed from: com.ss.ugc.aweme.AdmireAuth */
/* loaded from: classes20.dex */
public final class AdmireAuth extends Message<AdmireAuth, Builder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final long serialVersionUID = 0;
    @SerializedName("admire_button")
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public int admireButton;
    @SerializedName("is_admire")
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public int isAdmire;
    @SerializedName("is_show_admire_button")
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public int isShowAdmireButton;
    @SerializedName("is_show_admire_tab")
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public int isShowAdmireTab;
    public static final Parcelable.Creator<AdmireAuth> CREATOR = new C65773BxH(AdmireAuth.class);
    public static final ProtoAdapter<AdmireAuth> ADAPTER = new ProtoAdapter_AdmireAuth();

    @Override // com.squareup.wire.Message, android.os.Parcelable
    public final int describeContents() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : super.describeContents();
    }

    @Override // com.squareup.wire.Message, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.isShowAdmireTab);
        parcel.writeInt(this.isShowAdmireButton);
        parcel.writeInt(this.admireButton);
        parcel.writeInt(this.isAdmire);
    }

    /* renamed from: com.ss.ugc.aweme.AdmireAuth$ProtoAdapter_AdmireAuth */
    /* loaded from: classes20.dex */
    public static final class ProtoAdapter_AdmireAuth extends ProtoAdapter<AdmireAuth> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(275602);
        }

        public ProtoAdapter_AdmireAuth() {
            super(FieldEncoding.LENGTH_DELIMITED, AdmireAuth.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: decode */
        public final AdmireAuth mo29749decode(ProtoReader protoReader) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{protoReader}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (AdmireAuth) proxy.result;
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    if (nextTag != 1) {
                        if (nextTag != 2) {
                            if (nextTag != 3) {
                                if (nextTag != 4) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().mo29749decode(protoReader));
                                } else {
                                    builder.is_admire(ProtoAdapter.INT32.mo29749decode(protoReader));
                                }
                            } else {
                                builder.admire_button(ProtoAdapter.INT32.mo29749decode(protoReader));
                            }
                        } else {
                            builder.is_show_admire_button(ProtoAdapter.INT32.mo29749decode(protoReader));
                        }
                    } else {
                        builder.is_show_admire_tab(ProtoAdapter.INT32.mo29749decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.mo29748build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AdmireAuth admireAuth) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{admireAuth}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            return ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(admireAuth.isShowAdmireTab)) + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(admireAuth.isShowAdmireButton)) + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(admireAuth.admireButton)) + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(admireAuth.isAdmire)) + admireAuth.unknownFields().size();
        }
        
        
        
        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AdmireAuth admireAuth) {
            if (PatchProxy.proxy(new Object[]{protoWriter, admireAuth}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, Integer.valueOf(admireAuth.isShowAdmireTab));
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, Integer.valueOf(admireAuth.isShowAdmireButton));
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, Integer.valueOf(admireAuth.admireButton));
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, Integer.valueOf(admireAuth.isAdmire));
            protoWriter.writeBytes(admireAuth.unknownFields());
        }
    }

    public AdmireAuth() {
        super(ADAPTER, ByteString.EMPTY);
    }

    static {
        Covode.recordClassIndex(275600);
    }

    /* renamed from: com.ss.ugc.aweme.AdmireAuth$Builder */
    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<AdmireAuth, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int admire_button;
        public int is_admire;
        public int is_show_admire_button;
        public int is_show_admire_tab;

        static {
            Covode.recordClassIndex(275601);
        }

        @Override // com.squareup.wire.Message.Builder
        /* renamed from: build  reason: collision with other method in class */
        public final AdmireAuth mo29748build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            if (proxy.isSupported) {
                return (AdmireAuth) proxy.result;
            }
            return new AdmireAuth(Integer.valueOf(this.is_show_admire_tab), Integer.valueOf(this.is_show_admire_button), Integer.valueOf(this.admire_button), Integer.valueOf(this.is_admire), buildUnknownFields());
        }

        public final Builder admire_button(Integer num) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            if (num == null) {
                return this;
            }
            this.admire_button = num.intValue();
            return this;
        }

        public final Builder is_admire(Integer num) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            if (num == null) {
                return this;
            }
            this.is_admire = num.intValue();
            return this;
        }

        public final Builder is_show_admire_button(Integer num) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            if (num == null) {
                return this;
            }
            this.is_show_admire_button = num.intValue();
            return this;
        }

        public final Builder is_show_admire_tab(Integer num) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            if (num == null) {
                return this;
            }
            this.is_show_admire_tab = num.intValue();
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: collision with other method in class */
    public final Message.Builder<AdmireAuth, Builder> mo29747newBuilder() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Builder) proxy.result;
        }
        Builder builder = new Builder();
        builder.is_show_admire_tab = this.isShowAdmireTab;
        builder.is_show_admire_button = this.isShowAdmireButton;
        builder.admire_button = this.admireButton;
        builder.is_admire = this.isAdmire;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = unknownFields().hashCode() + Objects.hash(Integer.valueOf(this.isShowAdmireTab), Integer.valueOf(this.isShowAdmireButton), Integer.valueOf(this.admireButton), Integer.valueOf(this.isAdmire));
            this.hashCode = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(", is_show_admire_tab=");
        sb.append(this.isShowAdmireTab);
        sb.append(", is_show_admire_button=");
        sb.append(this.isShowAdmireButton);
        sb.append(", admire_button=");
        sb.append(this.admireButton);
        sb.append(", is_admire=");
        sb.append(this.isAdmire);
        sb.replace(0, 2, "AdmireAuth{");
        sb.append('}');
        return sb.toString();
    }

    public AdmireAuth(Parcel parcel) {
        super(parcel);
        this.isShowAdmireTab = parcel.readInt();
        this.isShowAdmireButton = parcel.readInt();
        this.admireButton = parcel.readInt();
        this.isAdmire = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdmireAuth)) {
            return false;
        }
        AdmireAuth admireAuth = (AdmireAuth) obj;
        if (unknownFields().equals(admireAuth.unknownFields()) && Internal.equals(Integer.valueOf(this.isShowAdmireTab), Integer.valueOf(admireAuth.isShowAdmireTab)) && Internal.equals(Integer.valueOf(this.isShowAdmireButton), Integer.valueOf(admireAuth.isShowAdmireButton)) && Internal.equals(Integer.valueOf(this.admireButton), Integer.valueOf(admireAuth.admireButton)) && Internal.equals(Integer.valueOf(this.isAdmire), Integer.valueOf(admireAuth.isAdmire))) {
            return true;
        }
        return false;
    }

    public AdmireAuth(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public AdmireAuth(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.isShowAdmireTab = num.intValue();
        this.isShowAdmireButton = num2.intValue();
        this.admireButton = num3.intValue();
        this.isAdmire = num4.intValue();
    }
}

