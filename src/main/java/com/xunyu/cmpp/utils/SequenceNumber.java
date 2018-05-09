package com.xunyu.cmpp.utils;

import java.io.Serializable;

/**
 * @author xym
 * @description 序列数实体类
 * @date 2018/4/18 15:39
 */
public class SequenceNumber implements Serializable{
	private static final long serialVersionUID = 650229326111998772L;
	private long nodeIds;
	private int month;
	private int day;
	private int hour;
	private int minutes;
	private int seconds;
	private long sequenceId;
	public SequenceNumber() {
		this(CachedMillisecondClock.INS.now());
	}
	
	/**
	 * 
	 * @param nodeIds
	 * @param timeMillis
	 */
	public SequenceNumber(long nodeIds, long timeMillis) {
		this(timeMillis, nodeIds, DefaultSequenceNumberUtil.getSequenceNo());
	}
	/**
	 * 
	 * @param timeMillis
	 */
	public SequenceNumber(long timeMillis) {
		this(timeMillis, 1010,  DefaultSequenceNumberUtil.getSequenceNo());
	}

	/**
	 * 
	 * @param timeMillis
	 * @param nodeIds
	 * @param sequenceId
	 */
	public SequenceNumber(long timeMillis, long nodeIds, long sequenceId) {
		setMonth(Integer.parseInt(String.format("%tm", timeMillis)));
		setDay(Integer.parseInt(String.format("%td", timeMillis)));
		setHour(Integer.parseInt(String.format("%tH", timeMillis)));
		setMinutes(Integer.parseInt(String.format("%tM", timeMillis)));
		setSeconds(Integer.parseInt(String.format("%tS", timeMillis)));
		setNodeIds(nodeIds);
		setSequenceId(sequenceId);
	}
	/**
	 * @return the nodeIds
	 */
	public long getNodeIds() {
		return nodeIds;
	}
	/**
	 * @param nodeIds the nodeIds to set
	 */
	public void setNodeIds(long nodeIds) {
		this.nodeIds = nodeIds;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}
	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}
	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}
	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}
	/**
	 * @param seconds the seconds to set
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	/**
	 * @return the sequenceId
	 */
	public long getSequenceId() {
		return sequenceId;
	}
	/**
	 * @param sequenceId the sequenceId to set
	 */
	public void setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
	}

	@Override
	public String toString() {
		return String
				.format("%1$010d%2$02d%3$02d%4$02d%5$02d%6$02d%7$010d",
						nodeIds, month, day, hour, minutes, seconds, sequenceId);
	}	
	
}
