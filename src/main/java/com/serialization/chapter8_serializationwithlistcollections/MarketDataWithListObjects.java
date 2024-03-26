package com.serialization.chapter8_serializationwithlistcollections;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;


public class MarketDataWithListObjects implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7772407182190758685L;
	private String securityId;
	private long time;
	private double open;
	private double high;
	private double low;
	private double close;
	private double last;
	private boolean isLevelOne;
	private List<String> mdProviders;
	
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(final String securityId) {
		this.securityId = securityId;
	}
	public long getTime() {
		return time;
	}
	public void setTime(final long time) {
		this.time = time;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(final double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(final double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(final double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(final double close) {
		this.close = close;
	}
	public MarketDataWithListObjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getLast() {
		return last;
	}
	public void setLast(double last) {
		this.last = last;
	}
	public boolean isLevelOne() {
		return isLevelOne;
	}
	public void setLevelOne(boolean isLevelOne) {
		this.isLevelOne = isLevelOne;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<String> getMdProviders() {
		return mdProviders;
	}
	public void setMdProviders(List<String> mdProviders) {
		this.mdProviders = mdProviders;
	}
	@Override
	public String toString() {
		return "MarketDataWithListObjects [securityId=" + securityId + ", time=" + time + ", open="
				+ open + ", high=" + high + ", low=" + low + ", close=" + close + ", last=" + last + ", isLevelOne="
				+ isLevelOne + ", mdProviders=" + mdProviders + "]";
	}
	
	
	

}