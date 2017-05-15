package algorithm;

public class Fish {
	private double weight;
	private double[] currentPosition;//posição atual
	private double[] previousPosition;
	private double[] individualDisplacement; //deslocamento individual
	private double fitnessVariation;
	private boolean improvedFitness; //Fitness aperfeicoado
	private double weightVariation; 
	
	public Fish(double weight, double[] position){
		this.setCurrentPosition(position);
		this.setWeight(weight);
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double[] getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(double[] currentPosition) {
		this.currentPosition = currentPosition;
	}
	public double[] getPreviousPosition() {
		return previousPosition;
	}
	public void setPreviousPosition(double[] previousPosition) {
		this.previousPosition = previousPosition;
	}
	public double[] getIndividualDisplacement() {
		return individualDisplacement;
	}
	public void setIndividualDisplacement(double[] individualDisplacement) {
		this.individualDisplacement = individualDisplacement;
	}
	public double getFitnessVariation() {
		return fitnessVariation;
	}
	public void setFitnessVariation(double fitnessVariation) {
		this.fitnessVariation = fitnessVariation;
	}
	public boolean isImprovedFitness() {
		return improvedFitness;
	}
	public void setImprovedFitness(boolean improvedFitness) {
		this.improvedFitness = improvedFitness;
	}
	public double getWeightVariation() {
		return weightVariation;
	}
	public void setWeightVariation(double weightVariation) {
		this.weightVariation = weightVariation;
	}
}
