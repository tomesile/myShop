package com.tms.java.inbound;

import com.tms.java.interfaces.IInbound;

public class InboundMethodRacks implements IInbound {

    @Override
    public int getInboundTypeIndex() {
        return 0;
    }

    @Override
    public IInbound getInboundType() {
        return null;
    }

    @Override
    public void inBoundMethod() {

    }
}
