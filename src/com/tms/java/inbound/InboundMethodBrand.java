package com.tms.java.inbound;

import com.tms.java.interfaces.IInbound;

public class InboundMethodBrand implements IInbound {
    @Override
    public int getInboundTypeIndex() {
        return 1;
    }

    @Override
    public IInbound getInboundType() {
        return null;
    }

    @Override
    public void inBoundMethod() {

    }
}
