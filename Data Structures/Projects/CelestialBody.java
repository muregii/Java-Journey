

/**
 * Celestial Body class for NBody
 * Modified from original Planet class
 * used at Princeton and Berkeley
 * @author ola
 *
 * If you add code here, add yourself as @author below
 *
 *
 */
public class CelestialBody {

	private double myXPos;
	private double myYPos;
	private double myXVel;
	private double myYVel;
	private double myMass;
	private String myFileName;
	//double G =  6.67*1e-11;
	//double dis= 0.0;

	/**
	 * Create a Body from parameters	
	 * @param xp initial x position
	 * @param yp initial y position
	 * @param xv initial x velocity
	 * @param yv initial y velocity
	 * @param mass of object
	 * @param filename of image for object animation
	 */
	public CelestialBody(double xp, double yp, double xv,
			             double yv, double mass, String filename){
							 myXPos=xp;
							 myYPos=yp;
							 myXVel=xv;
							 myYVel=yv;
							 myMass=mass;
							 myFileName=filename;
							 
							 
		// TODO: complete constructor

	}

	/**
	 *
	 * @return
	 */
	public double getX() {
		// TODO: complete method
		return myXPos;
	}

	/**
	 *
	 * @return
	 */
	public double getY() {
		// TODO: complete method
		return myYPos;
	}

	/**
	 * Accessor for the x-velocity
	 * @return the value of this object's x-velocity
	 */
	public double getXVel() {
		// TODO: complete method
		return myXVel;
	}
	/**
	 * Return y-velocity of this Body.
	 * @return value of y-velocity.
	 */
	public double getYVel() {
		// TODO: complete method
		return myYVel;
	}

	/**
	 *
	 * @return
	 */
	public double getMass() {
		// TODO: complete method
		//return 5.0;
		return myMass;
	}

	/**
	 *
	 * @return
	 */
	public String getName() {
		// TODO: complete method
		//return "cow-planet";
		return myFileName;
	}

	/**
	 * Return the distance between this body and another
	 * @param b the other body to which distance is calculated
	 * @return distance between this body and b
	 */
	public double calcDistance(CelestialBody b) {
		// TODO: complete method
		double dis = Math.sqrt((myXPos-b.myXPos)*(myXPos-b.myXPos)+(myYPos-b.myYPos)*(myYPos-b.myYPos));
		return dis;
	}

	public double calcForceExertedBy(CelestialBody b) {
		// TODO: complete method
		double dis = Math.sqrt((myXPos-b.myXPos)*(myXPos-b.myXPos)+(myYPos-b.myYPos)*(myYPos-b.myYPos));
		double force= (6.67*1e-11*myMass*b.myMass)/(dis*dis);
		return force;
	}

	public double calcForceExertedByX(CelestialBody b) {
		// TODO: complete method

		double forceX= calcForceExertedBy(b)*(-myXPos+b.myXPos)/(calcDistance(b));
		
		return forceX;
	}
	public double calcForceExertedByY(CelestialBody b) {
		// TODO: complete method
		double forceY=calcForceExertedBy(b)*(-myYPos+b.myYPos)/(calcDistance(b));
		return forceY;
	}

	public double calcNetForceExertedByX(CelestialBody[] bodies) {
		// TODO: complete method
		double sum=0.0;
		for(CelestialBody b:bodies){
			if(!b.equals(this)){
				 sum = sum+calcForceExertedByX(b);
			}
		    //return sum;

		}
		
		return sum;
	}

	public double calcNetForceExertedByY(CelestialBody[] bodies) {
		double sum = 0.0;
		for(CelestialBody b:bodies){
			if(!b.equals(this)){
				sum= sum+calcForceExertedByY(b);
			}
		}
		return sum;
	}

	public void update(double deltaT, 
			           double xforce, double yforce) {
						   double acx= xforce/myMass;
						   double acy= yforce/myMass;
						  double nvx = myXVel + deltaT*acx;
						  double nvy = myYVel + deltaT*acy;
						  double nmxp = myXPos + deltaT*nvx;
						  double nmyp = myYPos + deltaT*nvy;
						  myXVel=nvx;
						  myYVel=nvy;
						  myXPos=nmxp;
						  myYPos=nmyp;
						  
		// TODO: complete method
	}

	/**
	 * Draws this planet's image at its current position
	 */
	public void draw() {
		StdDraw.picture(myXPos,myYPos,"images/"+myFileName);
	}
}
