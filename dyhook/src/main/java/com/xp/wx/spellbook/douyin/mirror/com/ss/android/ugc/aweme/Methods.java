package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/Methods;", "", "()V", "ClassIAccountUserService_getCurUser", "Ljava/lang/reflect/Method;", "getClassIAccountUserService_getCurUser", "()Ljava/lang/reflect/Method;", "ClassIAccountUserService_getCurUser$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Methods.class), "ClassIAccountUserService_getCurUser", "getClassIAccountUserService_getCurUser()Ljava/lang/reflect/Method;"))};
    private static final Lazy ClassIAccountUserService_getCurUser$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassIAccountUserService_getCurUser() {
        Lazy lazy = ClassIAccountUserService_getCurUser$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("ClassIAccountUserService_getCurUser"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("ClassIAccountUserService_getCurUser"));
        }
        ClassIAccountUserService_getCurUser$delegate = lazy;
    }

    private Methods() {
    }
}
