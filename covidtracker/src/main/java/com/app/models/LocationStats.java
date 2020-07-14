package com.app.models;

public class LocationStats {

	private String state;
	private String country;
	private long latestTotalCases;
	private long diffFromPreviousDay;

	public LocationStats() {
	}

	public LocationStats(String state, String country, long latestTotalCases, long diffFromPreviousDay) {
		super();
		this.state = state;
		this.country = country;
		this.latestTotalCases = latestTotalCases;
		this.diffFromPreviousDay = diffFromPreviousDay;
	}

	public long getDiffFromPreviousDay() {
		return diffFromPreviousDay;
	}

	public void setDiffFromPreviousDay(long diffFromPreviousDay) {
		this.diffFromPreviousDay = diffFromPreviousDay;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getLatestTotalCases() {
		return latestTotalCases;
	}

	public void setLatestTotalCases(long latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}

	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}

}
