/*
Solorzano Trejo Brandon Uriel
2S11
Metodo set y get
 */
package herencia;
public class Dog {
	private String name;
	private double weight;
	private String colour;
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}
public double getWeight() {
		return weight;
	}
public void setWeight(double weight) {
		this.weight = weight;
	}
public String getColour() {
		return colour;
	}
public void setColour(String colour) {
		this.colour = colour;
	}
public void printToConsole() {
		System.out.print(" nombre: " + getName());
		System.out.print(" color: " + this.colour);
		System.out.println(" peso: " + this.weight);
	}
}

 
