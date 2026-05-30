package io.nekohasekai.sagernet.fmt.tailscale;

import androidx.annotation.NonNull;

import com.esotericsoftware.kryo.io.ByteBufferInput;
import com.esotericsoftware.kryo.io.ByteBufferOutput;

import org.jetbrains.annotations.NotNull;

import io.nekohasekai.sagernet.fmt.AbstractBean;
import io.nekohasekai.sagernet.fmt.KryoConverters;

public class TailscaleBean extends AbstractBean {

    public String authKey;
    public String controlURL;
    public Boolean ephemeral;
    public String hostname;
    public Boolean acceptRoutes;
    public String exitNode;
    public Boolean exitNodeAllowLANAccess;
    public String advertiseRoutes;
    public Boolean advertiseExitNode;

    @Override
    public void initializeDefaultValues() {
        super.initializeDefaultValues();
        if (authKey == null) authKey = "";
        if (controlURL == null) controlURL = "";
        if (ephemeral == null) ephemeral = false;
        if (hostname == null) hostname = "";
        if (acceptRoutes == null) acceptRoutes = false;
        if (exitNode == null) exitNode = "";
        if (exitNodeAllowLANAccess == null) exitNodeAllowLANAccess = false;
        if (advertiseRoutes == null) advertiseRoutes = "";
        if (advertiseExitNode == null) advertiseExitNode = false;
    }

    @Override
    public void serialize(ByteBufferOutput output) {
        output.writeInt(0);
        super.serialize(output);
        output.writeString(authKey);
        output.writeString(controlURL);
        output.writeBoolean(ephemeral);
        output.writeString(hostname);
        output.writeBoolean(acceptRoutes);
        output.writeString(exitNode);
        output.writeBoolean(exitNodeAllowLANAccess);
        output.writeString(advertiseRoutes);
        output.writeBoolean(advertiseExitNode);
    }

    @Override
    public void deserialize(ByteBufferInput input) {
        int version = input.readInt();
        super.deserialize(input);
        authKey = input.readString();
        controlURL = input.readString();
        ephemeral = input.readBoolean();
        hostname = input.readString();
        acceptRoutes = input.readBoolean();
        exitNode = input.readString();
        exitNodeAllowLANAccess = input.readBoolean();
        advertiseRoutes = input.readString();
        advertiseExitNode = input.readBoolean();
    }

    @Override
    public boolean canTCPing() {
        return false;
    }

    @NotNull
    @Override
    public TailscaleBean clone() {
        return KryoConverters.deserialize(new TailscaleBean(), KryoConverters.serialize(this));
    }

    public static final Creator<TailscaleBean> CREATOR = new CREATOR<TailscaleBean>() {
        @NonNull
        @Override
        public TailscaleBean newInstance() {
            return new TailscaleBean();
        }

        @Override
        public TailscaleBean[] newArray(int size) {
            return new TailscaleBean[size];
        }
    };
}
