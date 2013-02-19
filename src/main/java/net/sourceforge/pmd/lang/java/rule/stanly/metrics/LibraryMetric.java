package net.sourceforge.pmd.lang.java.rule.stanly.metrics;

public class LibraryMetric {
	private int Packages;
	private int NumberOfClass;	// unit class + inner class
	private float UnitPerPackage;
	private int Fat;
	private float Tangled;
	private float ACDPackage;
	private float ACDUnit;
	private float Distance;
	private float DistanceAbsolute;
	private int totalWMC;
	private int totalDIT;
	private int totalNOC;
	private float CBO;
	private float RFC;
	private float LCOM;
	
	public int getPackages() {
		return Packages;
	}
	public void setPackages(int packages) {
		Packages = packages;
	}
	public float getUnitPerPackage() {
		return UnitPerPackage;
	}
	public void setUnitPerPackage(float unitPerPackage) {
		UnitPerPackage = unitPerPackage;
	}
	public int getFat() {
		return Fat;
	}
	public void addFat(int fat) {
		Fat += fat;
	}
	public float getTangled() {
		return Tangled;
	}
	public void setTangled(float tangled) {
		Tangled = tangled;
	}
	public float getACDPackage() {
		return ACDPackage;
	}
	public void setACDPackage(float aCDPackage) {
		ACDPackage = aCDPackage;
	}
	public float getACDUnit() {
		return ACDUnit;
	}
	public void setACDUnit(float aCDUnit) {
		ACDUnit = aCDUnit;
	}
	public float getDistance() {
		return Distance;
	}
	public void setDistance(float distance) {
		Distance = distance;
	}
	public float getDistanceAbsolute() {
		return DistanceAbsolute;
	}
	public void setDistanceAbsolute(float distanceAbsolute) {
		DistanceAbsolute = distanceAbsolute;
	}
	public float getWMC() {
		return (float)totalWMC / (float)NumberOfClass;
	}
	public void addWMC(int wMC) {
		totalWMC += wMC;
	}
	public float getDIT() {
		return (float)totalDIT / (float)NumberOfClass;
	}
	public void addDIT(int dIT) {
		totalDIT += dIT;
	}
	public float getNOC() {
		return (float)totalNOC / (float)NumberOfClass;
	}
	public void addNOC(float nOC) {
		totalNOC += nOC;
	}
	public float getCBO() {
		return CBO;
	}
	public void setCBO(float cBO) {
		CBO = cBO;
	}
	public float getRFC() {
		return RFC;
	}
	public void setRFC(float rFC) {
		RFC = rFC;
	}
	public float getLCOM() {
		return LCOM;
	}
	public void setLCOM(float lCOM) {
		LCOM = lCOM;
	}
	public int getNumberOfClass() {
		return NumberOfClass;
	}
	public void addNumberOfClass(int numberOfClass) {
		NumberOfClass += numberOfClass;
	}
}
