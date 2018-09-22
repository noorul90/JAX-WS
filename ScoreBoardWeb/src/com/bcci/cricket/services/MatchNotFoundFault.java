/**
 * MatchNotFoundFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.bcci.cricket.services;

public class MatchNotFoundFault extends java.lang.Exception {
    private static final long serialVersionUID = 1455736248079L;
    private com.bcci.cricket.types.ErrorDetails faultMessage;

    public MatchNotFoundFault() {
        super("MatchNotFoundFault");
    }

    public MatchNotFoundFault(java.lang.String s) {
        super(s);
    }

    public MatchNotFoundFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public MatchNotFoundFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(com.bcci.cricket.types.ErrorDetails msg) {
        faultMessage = msg;
    }

    public com.bcci.cricket.types.ErrorDetails getFaultMessage() {
        return faultMessage;
    }
}
