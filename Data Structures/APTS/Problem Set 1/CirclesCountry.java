/*Circles Country is a country that contains several circular-shaped districts. 
Some districts may be situated inside other districts, but their borders do not intersect or touch. Qatam is a resident of Circles Country. When he travels between two locations, 
he always tries to cross the fewest number of district borders as possible because crossing borders is usually a laborious task.
Imagine Circles Country as an infinite plane. You are given int[] x and int[] y and int[] r, where (x[i],y[i]) are the coordinates of the i-th district's center and r[i] is its radius. Qatam is currently at point (x1,y1) and he needs to get to point (x2,y2). 
Neither of these points lies on a district border. Return the minimal number of district borders he must cross to get to his destination.*/

//check video explanation of this code @ https://youtu.be/9P63vhkgEoU
public class CirclesCountry {
public int leastBorders (int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
int crosses = 0;

for(int k=0;k<x.length;k++) {
  if(isInside(x1,y1,x[k],y[k],r[k]) && ! isInside(x2,y2,x[k],y[k],r[k]) ) {
        crosses +=1;
     }
      else if(isInside(x2,y2,x[k],y[k],r[k]) ^  isInside(x1,y1,x[k],y[k],r[k])){
          crosses ++;
      }
     }
     return crosses;
}



//Helper method.
 public boolean isInside(int x, int y, int cx, int cy, int r) {
   double dist = (x-cx)*(x-cx) + (y-cy)*(y-cy);
   double radSquared = r*r;
   return dist < radSquared; //then true
}
}
