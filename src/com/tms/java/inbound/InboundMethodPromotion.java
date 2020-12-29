package com.tms.java.inbound;

import com.tms.java.interfaces.IInbound;

public class InboundMethodPromotion implements IInbound {
    @Override
    public int getInboundTypeIndex() {
        return 2;
    }

    @Override
    public IInbound getInboundType() {
        return null;
    }

    @Override
    public void inBoundMethod() {

    }
}
